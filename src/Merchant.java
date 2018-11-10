import java.util.Scanner;

public class Merchant extends Character {
	public Item[] wares;
	
	public Merchant()
	{
		
	}
	
	public Merchant(String name, int health, Item[] wares)
	{
		super(name, health, 0, 0, wares);		// mana and gold irrelevant for merchants
	}
	
	public void merchantInteraction(Player player)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to my shop!\nEnter 1 to see wares\nEnter 2 to sell\nor 0 to leave");
		int menuChoice = input.nextInt();
		if (menuChoice == 1)
		{
			this.printInventory();
			System.out.println("Enter the number of item you would like to buy");
			int desiredItem = input.nextInt();
			if (desiredItem < 0 || desiredItem > this.inventory.length)
			{
				
			} else 
			{
				Item boughtItem = this.inventory[desiredItem];
				this.inventory[desiredItem] = null;
				player.addItem(boughtItem);
			}
		}
		else if (menuChoice == 2)
		{
			player.printInventory();
			System.out.println("Enter the number of the item you would like to sell");
			int desiredItem = input.nextInt();
			if (desiredItem < 0 || desiredItem > this.inventory.length)
			{
				
			} else 
			{
				Item soldItem = player.inventory[desiredItem];
				player.inventory[desiredItem] = null;
				this.addItem(soldItem);
			}
		}
		
	}

}
