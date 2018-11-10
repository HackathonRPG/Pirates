
public class Driver
{

	public static void main(String[] args)
	{
		Enemy[] array = new Enemy[5];
		
		Enemy enemy1 = new Enemy();
		array[0] = enemy1;
		
		Item[] items = new Item[1];
		
		Player player = new Player("Luffy", 20, 0, 0, items);
		
		Combat.startCombat(array, player); // argument is number of enemies
	}

}
