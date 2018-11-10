
public class Driver
{

	public static void main(String[] args)
	{
		Enemy[] array = new Enemy[5];
		
		Enemy enemy1 = new Enemy();
		array[0] = enemy1;
		
		Player player = new Player();
		
		Combat.startCombat(1, array); // argument is number of enemies
	}

}
