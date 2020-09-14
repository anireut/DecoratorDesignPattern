package csce247decoratorDesignPattern;
/**
 * This is the Warrior class which sets appropriate variables
 * 
 * @author aniruthsivakumar
 *
 */
public class Warrior extends Player {
	/**
	 * This constructor sets the appropriate instance
	 * variables to the appropriate values
	 * @param name is passed in
	 */
	public Warrior(String name) {
		this.intellect = 2;
		this.attack = 8;
		this.defense = 5;
		this.weapon = "Sword";
		this.armor = "Breast Plate";
		this.name = "";
	}
	/**
	 * toString which returns the designated text
	 */

	public String toString() {
		return "Warrior:" + super.toString();
	}

}
