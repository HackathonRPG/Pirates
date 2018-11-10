
public class Driver
{

	public static void main(String[] args)
	{
	
		Enemy enemy = Enemy.generateEnemy(1);
		
		Item[] items = new Item[1];
		
		Player player = new Player("Luffy", 20, 0, 0, items);
		
		Combat.startCombat(enemy, player); // argument is number of enemies
	}

}
