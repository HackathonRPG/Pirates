import java.util.Scanner;

public class Combat {

	public static void startCombat(int enemies) {
		Scanner input = new Scanner(System.in);

		int choice; // what the player wants to do on their turn
		boolean run = false; // if the player wants to run

		int turn; // player = 1, enemy = 0
		turn = getInitiative(); // determines who goes first

		// combat loop
		while (enemies > 0 && run == false) {

			if (turn == 1) { // player turn
				System.out.println("What do you want to do?");
				System.out.println("1. Attack");
				System.out.println("2. Use item");
				System.out.println("3. Try to run ");

				choice = input.nextInt(); // TODO validation

				// the players choice of action
				switch (choice) {
				case 1:
					playerAttack(input);
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
				
				for (int i = 0; i < enemies; i++) {
					enemyAttack(3);
				}
				
				turn = 1; // change to player
			}
		}
	}

	private static int getInitiative() {
		int turn;
		int playerInitiative = 1 + (int) (Math.random() * ((20 - 1) + 1));
		int enemyInitiative = 1 + (int) (Math.random() * ((20 - 1) + 1));

		System.out.println("Your Initiative: " + playerInitiative);
		System.out.println("Enemy Initiative: " + enemyInitiative);

		if (playerInitiative >= enemyInitiative) {
			System.out.println("You have the higher initiative. You go first.");
			turn = 1;
		} else {
			System.out.println("You have the higher initiative. You go first.");
			turn = 0;
		}
		return turn;
	}

	private static void enemyAttack(int power) {
		int playerArmor = 15;
		int roll = 1 + (int) (Math.random() * ((20 - 1) + 1)) + power;

		if (roll >= playerArmor) {
			System.out.println("The enemy hits you for " + power);
			// player.takedamage
		} else {
			System.out.println("The enemy missed their attack");
		}

	}

	private static void playerAttack(Scanner input) {
		int enemy;
		int weapon;
		int roll;

		System.out.print("Choose an enemy");
		System.out.print("ENEMY STATS");
		enemy = input.nextInt();

		System.out.println("Choose a weapon to attack with");
		System.out.println("1. PLAYER WEAPON 1 STATS");
		System.out.println("2. PLAYER WEAPON 2 STATS");

		weapon = input.nextInt();

		roll = rollAttack(5);

	}

	private static void useItem(Scanner input) {

	}

	// DONE
	private static boolean tryRunning() {
		int run = 1 + (int) (Math.random() * ((20 - 1) + 1));

		if (run >= 15) {
			System.out.println("You managed to get away");
			return true;
		} else {
			System.out.println("You tried to run but failed");
			return false;
		}
	}

	// DONE
	private static int rollAttack(int modifier) {
		return 1 + (int) (Math.random() * ((20 - 1) + 1)) + modifier;
	}
}
