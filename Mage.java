package csce247decoratorDesignPattern;

/**
 * This is the Mage class which sets appropriate variables
 * 
 * @author aniruthsivakumar
 *
 */

public class Mage extends Player {
	/**
	 * This constructor sets the appropriate instance
	 * variables to the appropriate values
	 * @param name is passed in
	 */
	public Mage(String name) {
		this.intellect = 7;
		this.attack = 3;
		this.defense = 4;
		this.weapon = "Staf";
		this.armor = "Robe";
		this.name = name;
		
	}
	
	/**
	 * toString which returns the designated text
	 */

	public String toString() {
		return "Mage:" + super.toString();

	}
}
