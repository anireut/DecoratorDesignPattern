package csce247decoratorDesignPattern;
/**
 * This is the main class which is abstract. It makes the instance
 * variables that describes the players
 * @author aniruthsivakumar
 */
public abstract class Player {

	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;

	/**
	 * toString that returns designated text 
	 */
	
	public String toString() {
		return name + "\nCarries a " + weapon + ", and wears a " + armor + "";

	}

	/**
	 * This method gets the power of the player 
	 * @return double power
	 */
	
	public double getPower() {
		double power = (attack * 3) + defense + (intellect / 2);
		return power;
	}

}
