
public class Enemy extends Character
{
	private int armorClass;
	private int attackPower;
	// TODO set to scale with player level 
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
