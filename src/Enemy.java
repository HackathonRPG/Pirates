
public class Enemy extends Character
{
<<<<<<< HEAD
	private int armorClass = 12;
	private int attackPower = 3;
	
=======
	private int armorClass;
	private int attackPower;
	// TODO set to scale with player level 
>>>>>>> ddb1838e10a89cd2bef5e8478075caa526f8cdd2
	public Enemy()
	{
		
	}
	
	public Enemy(String name, int health, int mana, int gold, Item[] inventory)
	{
		super(name, health, mana, gold, inventory);
	}

	public int getArmorClass()
	{
		return armorClass;
	}

	public void setArmorClass(int armorClass)
	{
		this.armorClass = armorClass;
	}

	public int getAttackPower()
	{
		return attackPower;
	}

	public void setAttackPower(int attackPower)
	{
		this.attackPower = attackPower;
	}
	
	@Override
	public String toString()
	{
		return String.format("Armor: %d\nAttack: %d\n", this.armorClass, this.attackPower);
	}
}
