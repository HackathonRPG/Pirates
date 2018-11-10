
public class Item
{
	private String name;
	private int worth;
	private int weight;
	
	public Item()
	{
		
	}
	
	public Item(String name, int worth, int weight)
	{
		this.name = name;
		this.worth = worth;
		this.weight = weight;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getWorth()
	{
		return worth;
	}

	public void setWorth(int worth)
	{
		this.worth = worth;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
}
