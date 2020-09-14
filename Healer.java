package csce247decoratorDesignPattern;

/**
 * This is the Healer class which sets appropriate variables
 * 
 * @author aniruthsivakumar
 *
 */
public class Healer extends Player {
/**
 * This constructor sets the appropriate instance
 * variables to the appropriate values
 * @param name is passed in
 */
	
	public Healer(String name) {
		this.intellect = 8;
		this.attack = 2;
		this.defense = 3;
		this.weapon = "Staf";
		this.armor = "Robe";
		this.name = name;
	}

	/**
	 * toString which returns the designated text
	 */
	public String toString() {
		return "Healer:" + super.toString();

	}
}
