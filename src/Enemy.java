import java.util.Random;

public class Enemy extends Character
{
	private int armorClass;
	private int attackPower;
	// TODO set to scale with player level 
	public Enemy()
	{
		
	}
	
	public Item droppedItem(int playerLevel)
	{
		Random rand = new Random();
		switch (playerLevel)
		{
		case 1:
			int randNum = rand.nextInt(3);
			if (randNum == 0)
			{
				return Item.randomPotion();
			} else if (randNum == 1)
			{
				return new Item("Iron Sword", "weapon", 1, 3, 0);
			} else
			{
				return new Item("Tricorne", "armor", 6, 0, 3);
			}
		case 2:
			int randNum1 = rand.nextInt(3);
			if (randNum1 == 0)
			{
				return Item.randomPotion();
			} else if (randNum1 == 1)
			{
				return new Item("Steel Sword", "weapon", 2, 5, 0);
			} else
			{
				return new Item("Leather Coat", "armor", 7, 0, 5);
			}
		case 3:
			int randNum2 = rand.nextInt(3);
			if (randNum2 == 0)
			{
				return Item.randomPotion();
			} else if (randNum2 == 1)
			{
				return new Item("Scimitar", "weapon", 3, 6, 0);
			} else
			{
				return new Item("Steel toe Boots", "armor", 8, 0, 6);
			}
		case 4:
			int randNum3 = rand.nextInt(3);
			if (randNum3 == 0)
			{
				return Item.randomPotion();
			} else if (randNum3 == 1)
			{
				return new Item("Falchion", "weapon", 4, 7, 0);
			} else
			{
				return new Item("Storm Overcoat", "armor", 9, 0, 7);
			}
		case 5:
			int randNum4 = rand.nextInt(3);
			if (randNum4 == 0)
			{
				return Item.randomPotion();
			} else if (randNum4 == 1)
			{
				return new Item("Rapier", "weapon", 5, 8, 0);
			} else
			{
				return new Item("Captains Overcoat", "armor", 10, 0, 8);
			}
		}
		return null;
	}
	public Enemy generateEnemy(int playerLevel)
	{
		Enemy newEnemy = null;
		switch (playerLevel)
		{
		case 1:
			newEnemy = new Enemy("Skeleton", 10, 0, 2);
			newEnemy.setArmorClass(11);
			newEnemy.setAttackPower(5);
			return newEnemy;
		case 2:
			newEnemy = new Enemy("Buccaneer", 13, 0, 4);
			newEnemy.setArmorClass(13);
			newEnemy.setAttackPower(7);
			return newEnemy;
		case 3:
			newEnemy = new Enemy("Buff Skeleton", 15, 0, 6);
			newEnemy.setArmorClass(15);
			newEnemy.setAttackPower(9);
			return newEnemy;
		case 4:
			newEnemy = new Enemy("Ghost", 17, 0, 9);
			newEnemy.setArmorClass(17);
			newEnemy.setAttackPower(11);
			return newEnemy;
		}
		return newEnemy;
	}
	
	public Enemy(String name, int health, int mana, int gold)
	{
		this.setName(name);
		this.setHealth(health);
		this.setMana(mana);
		this.setGold(gold);
		
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
