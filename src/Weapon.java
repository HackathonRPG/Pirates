
public class Weapon extends Item
{
	private int attackPower;
	
	public Weapon()
	{
		
	}
	
	public Weapon(String name, int worth, int weight, int attackPower)
	{
		super(name, worth, weight);
		this.attackPower = attackPower;
	}

	public int getAttackPower()
	{
		return attackPower;
	}

	public void setAttackPower(int attackPower)
	{
		this.attackPower = attackPower;
	}
	
	

}
