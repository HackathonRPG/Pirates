
public class Player extends Character
{
	
	public Weapon activeWeapon;
	public Player()
	{
		
	}
	
	public Player(String name, int health, int mana, int gold, Item[] inventory)
	{
		super(name, health, mana, gold, inventory);
	}
	
	public void setActiveWeapon(int inventoryIndex)
	{ 
		if (inventoryIndex > this.inventory.length - 1)
		{
			System.out.println("Index given is not in inventory");
		} else if (inventoryIndex < 0)
		{
			System.out.println("Index given is not in inventory");
		}
		
		if (this.inventory[inventoryIndex] instanceof Weapon)
		{
			this.activeWeapon = (Weapon) this.inventory[inventoryIndex];
		}
	}
}
