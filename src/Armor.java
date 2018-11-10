
public class Armor extends Item
{
	private int armorClass;
	
	public Armor()
	{
		
	}
	
	public Armor(String name, int worth, int weight, int armorClass)
	{
		super(name, worth, weight);
		this.armorClass = armorClass;
	}

	public int getArmorClass()
	{
		return armorClass;
	}

	public void setArmorClass(int armorClass)
	{
		this.armorClass = armorClass;
	}

	
}
