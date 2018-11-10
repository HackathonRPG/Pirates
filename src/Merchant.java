
public class Merchant extends Character {
	public Item[] wares;
	
	public Merchant()
	{
		
	}
	
	public Merchant(String name, int health, Item[] wares)
	{
		super(name, health, 0, 0, wares);		// mana and gold irrelevant for merchants
	}
	
	public Item sellItem(int itemIndex)
	{
		if (itemIndex < 0 || itemIndex > this.inventory.length)
		{
			return null;
		} else 
		{
			Item boughtItem = this.inventory[itemIndex];
			this.inventory[itemIndex] = null;
			return boughtItem;
		}
	}
}
