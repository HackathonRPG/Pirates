
public class Character
{
	private int health;
	private String name;
	private int mana;
	private int gold;
	public Item[] inventory = new Item[20];
	
	public Character()
	{
		
	}
	
	public Character(String name, int health, int mana, int gold, Item[] inventory)
	{
		this.name = name;
		this.health = health;
		this.mana = mana;
		this.gold = gold;
		this.inventory = inventory;
	}
	
	public void takeDamage(int damage)
	{
		if (this.health - damage <= 0)
		{
			this.health = 0;
			System.out.println(String.format("%s has died", this.name));
		}
		this.health = this.health - damage;
	}

	public int getHealth()
	{
		return health;
	}

	public void setHealth(int health)
	{
		this.health = health;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getMana()
	{
		return mana;
	}

	public void setMana(int mana)
	{
		this.mana = mana;
	}

	public int getGold()
	{
		return gold;
	}

	public void setGold(int gold)
	{
		this.gold = gold;
	}
	
}
