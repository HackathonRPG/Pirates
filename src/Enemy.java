
public class Enemy extends Character
{
	private int armorClass;
	private int attackPower;
	// TODO set to scale with player level 
	public Enemy()
	{
		
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
