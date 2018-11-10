import java.util.Scanner;

public class Combat {

	public static void startCombat(Enemy[] enemyArray, Player player) {
		Scanner input = new Scanner(System.in);

		int enemies = getNumEnemies(enemyArray); // the number of enemies in the fight
		int choice; // what the player wants to do on their turn
		boolean run = false; // if the player wants to run
		int turn = getInitiative(); // determines who goes first player=1, enemy=0

		// combat loop
		while (enemies > 0 && run == false) {

			if (turn == 1) { // player turn
				System.out.println("What do you want to do?");
				System.out.println("1. Attack");
				System.out.println("2. Use item");
				System.out.println("3. Try to run away");

				choice = input.nextInt();

				// the players choice of action
				switch (choice) {
				case 1:
					playerAttack(input, enemyArray);
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

				System.out.println("Enemy Turn.");

				// each enemy attacks
				for (int i = 0; i < enemies; i++)
					enemyAttack(i, enemyArray, player);

				System.out.println("");
				turn = 1; // change to player
			}
		}
	}

	private static void enemyAttack(int enemy, Enemy[] enemyArray, Player player) {
		int playerArmor = 15;
		int power = enemyArray[enemy].getAttackPower();
		
		int roll = rollAttack(power);

		if (roll >= playerArmor) {
			System.out.println("Enemy " + enemy + " hits you for " + power);
			// TODO player take damage
		} else {
			System.out.println("Enemy " + enemy + " missed their attack");
		}

	}

	private static void playerAttack(Scanner input, Enemy[] enemyArray) {
		int enemy;
		int weapon;
		int roll;

		System.out.println("Choose an enemy:");
		int count = 0;
		while (enemyArray[count] != null) {
			System.out.println(count + ": " + enemyArray[count].toString());
			count++;
		}

		enemy = input.nextInt(); // TODO validation

		// TODO
		// System.out.println("Choose a weapon to attack with");
		// System.out.println("1. PLAYER WEAPON 1 STATS");
		// System.out.println("2. PLAYER WEAPON 2 STATS");
		// weapon = input.nextInt();

		int power = 3; // weapon damage

		roll = rollAttack(power);

		if (roll >= 12) {
			System.out.println("You hit enemy " + enemy + " for " + power);
			// TODO enemy take damage
		} else {
			System.out.println("You missed your attack");
		}
		System.out.println("");
	}

	// TODO
	private static void useItem(Scanner input) {
		int itemChoice;
		System.out.println("SHOW INVENTORY");
		itemChoice = input.nextInt();

	}

	// DONE
	private static int getNumEnemies(Enemy[] enemyArray) {
		int enemies = 0;
		for (int i = 0; i < enemyArray.length; i++) {
			if (enemyArray[i] != null)
				enemies++;
		}
		return enemies;
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
