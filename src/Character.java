
public class Character
{
	private int health;		
	private String name;
	private int mana;
	private int gold;					// currency
	public Item[] inventory = new Item[20];		//inventory capped at 20 items
	private int level;				// enemys scale with level
	
	public Character()		//default constructor
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
	
	/*
	 * decrements health based on damage passed in
	 */
	public void takeDamage(int damage)
	{
		if (this.health - damage <= 0)
		{
			this.health = 0;
		
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

	public int getLevel()
	{
		return level;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}
	
}
