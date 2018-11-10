
public class Item {

	private String itemName;
	private String itemType; //weapon, armor, or potion
	private int itemIdNum;
	private int attack; //armor gives 0
	private int defense; //weapon gives 0
	/*if (itemType == potion)
	{
		if(used from the combat screen)
		{
			attack = character.attack + attack;
			defense = character.defense + defense;
		} //note: may need to limit the amount of potions that can be used in one battle
	}*/
	/*if (itemType == potion)
	 {
	 	if(battle ends)
	 	{
	 		attack = attack - potion attack;
	 		defense = defense - potion defense;
	 	}
	 }
	 */
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public int getItemIdNum() {
		return itemIdNum;
	}
	public void SetItemIdNum(int itemIdNum) {
		this.itemIdNum = itemIdNum;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
}

public void itemGenerate(){
	Item ironSword = new Item();
	itemName = "Iron Sword";
	itemType = "weapon";
	itemIdNum = 1;
	attack = 3;
	defense = 0;
	
	Item steelSword = new Item();
	itemName = "Steel Sword";
	itemType = "weapon";
	itemIdNum = 2;
	attack = 5;
	defense = 0;
	
	Item scimitar = new Item();
	itemName = "Scimitar";
	itemType = "weapon";
	itemIdNum = 3;
	attack = 6;
	defense = 0;
	
	Item falchion = new Item();
	itemName = "Falchion";
	itemType = "weapon";
	itemIdNum = 4;
	attack = 7;
	defense = 0;
	
	Item rapier = new Item();
	itemName = "Rapier";
	itemType = "weapon";
	itemIdNum = 5;
	attack = 8;
	defense = 0;
	
	Item tricorne = new Item();
	itemName = "Tricorne";
	itemType = "armor";
	itemIdNum = 6;
	attack = 0;
	defense = 3;
	
	Item leatherCoat = new Item();
	itemName = "Leather Coat";
	itemType = "armor";
	itemIdNum = 7;
	attack = 0;
	defense = 5;
	
	Item steelToeBoots = new Item();
	itemName = "Steel-Toe Boots";
	itemType = "armor";
	itemIdNum = 8;
	attack = 0;
	defense = 6;
	
	Item stormOvercoat = new Item();
	itemName = "Storm Overcoat";
	itemType =  "armor";
	itemIdNum = 9;
	attack = 0;
	defense = 7;
	
	Item CaptainsOvercoat = new Item();
	itemName = "Captain's Overcoat";
	itemType = "armor";
	itemIdNum = 10;
	attack = 0;
	defense = 8;
	
	Item strengthPotion = new Item();
	itemName = "Strength Potion";
	itemType = "potion";
	itemIdNum = 11;
	attack = 4;
	defense = 0;
	
	Item defensePotion = new Item();
	itemName = "Defense Potion";
	itemType = "potion";
	itemIdNum = 12;
	attack = 0;
	defense = 4;
	
	Item mixedPotion = new Item();
	itemName ="Mixed Potion";
	itemType = "potion";
	itemIdNum = 13;
	attack = 3;
	defense = 3;
	
	Item ultimatePotion = new Item();
	itemName = "Ultimate Potion";
	itemType = "potion";
	itemIdNum = 14;
	attack = 4;
	defense = 4;
	
	Item speedPotion = new Item();
	itemName = "Speed Potion";
	itemType = "potion";
	itemIdNum = 15;
	attack = 0;
	defense = 0;
}