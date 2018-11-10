import java.util.Scanner;

public class Combat {

	public static void startCombat(Enemy enemy, Player player) {
		Scanner input = new Scanner(System.in);

		int choice; // what the player wants to do on their turn
		boolean run = false; // if the player wants to run
		boolean enemyAlive = true;
		int turn = getInitiative(); // determines who goes first player=1, enemy=0

		// combat loop
		while (enemyAlive == true && run == false) {

			if (turn == 1) { // player turn
				System.out.println("What do you want to do?");
				System.out.println("1. Attack");
				System.out.println("2. Use item");
				System.out.println("3. Run");

				choice = input.nextInt();

				// the players choice of action
				switch (choice) {
				case 1:
					enemyAlive = playerAttack(input, player, enemy);
					break;
				case 2:
					useItem(input);
					break;
				case 3:
					run = tryRunning();
					break;
				}

				turn = 0; // change to enemy

			} else { // enemy turn

				System.out.println(enemy.getName() + "'s Turn.");

				// each enemy attacks
				enemyAttack(enemy, player);

				System.out.println("");
				turn = 1; // change to player
			}
		}
	}

	private static void enemyAttack(Enemy enemy, Player player) {
		int playerArmor = 15;
		int power = enemy.getAttackPower();

		int roll = rollAttack(power);
		System.out.println("They rolled a " + roll + " against your armor class of " + playerArmor);

		if (roll >= playerArmor) {
			System.out.println("The enemy hits you for " + power + " damage");
			player.takeDamage(power);

			if (player.getHealth() > 0)
				System.out.println("You have " + player.getHealth() + " health remaining");
			else {
				System.out.println("You died");
			}
		} else {
			System.out.println("The enemy missed their attack");
		}

	}

	private static boolean playerAttack(Scanner input, Player player, Enemy enemy) {
		
		int weapon;
		int roll;
		int power;
		int enemyArmor = enemy.getArmorClass();

		System.out.println("Choose an attack");
		System.out.println("1. Main Weapon (3 dmg)"); // TODO currently equipped weapon
		System.out.println("2. Sidearm (5 dmg)");
		weapon = input.nextInt();

		if (weapon == 1) {
			// int power = player.activeWeapon.getAttackPower(); // weapon damage
			power = 3;
		} else {
			power = 5;
		}

		roll = rollAttack(power);
		System.out.println("You rolled a " + roll + " against their armor class of " + enemyArmor);

		if (roll >= enemyArmor) {
			System.out.println("You hit the enemy for " + power + " damage");
			enemy.takeDamage(power);

			if (enemy.getHealth() > 0)
				System.out.println("They have " + enemy.getHealth() + " health remaining");
			else {
				System.out.println("They died. You gain 1 exp");
				//TODO add experience
				return false;
			}

		} else {
			System.out.println("You missed your attack");
		}

		System.out.println("");
		return true;
	}

	// TODO
	private static void useItem(Scanner input) {

	}

	// DONE
	private static int getInitiative() {
		int turn;
		int playerInitiative = 1 + (int) (Math.random() * ((20 - 1) + 1));
		int enemyInitiative = 1 + (int) (Math.random() * ((20 - 1) + 1));

		System.out.println("Your Initiative: " + playerInitiative);
		System.out.println("Enemy Initiative: " + enemyInitiative);

		if (playerInitiative >= enemyInitiative) {
			System.out.println("You have the higher initiative. You go first.\n");
			turn = 1;
		} else {
			System.out.println("The enemies have the higher initiative. They go first.\n");
			turn = 0;
		}
		return turn;
	}

	// DONE
	private static boolean tryRunning() {
		int run = 1 + (int) (Math.random() * ((20 - 1) + 1));

		if (run >= 15) {
			System.out.println("You managed to get away.\n");
			return true;
		} else {
			System.out.println("You tried to run but couldn't get away!\n");
			return false;
		}
	}

	// DONE
	private static int rollAttack(int modifier) {
		return 1 + (int) (Math.random() * ((20 - 1) + 1)) + modifier;
	}
}
