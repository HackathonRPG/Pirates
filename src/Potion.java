import java.util.Random;

public class Potion extends Item
{
	public Potion()
	{
		
	}
	
	public static Potion randomPotion()
	{
		Random rand = new Random();
		int seed = rand.nextInt(4);
		switch (seed)
		{
		case 0:
			return new Potion("Potion of speed", 10, 0);
		case 1:
			return new Potion("Potion of Strength", 10, 0);
		case 2:
			return new Potion("Potion of Protection", 10, 0);
		case 3:
			return new Potion("Potion of Luck", 10, 0);
		}
		return null;
	}
	public Potion(String name, int worth, int weight)
	{
		super(name, worth, weight);
	}

}
