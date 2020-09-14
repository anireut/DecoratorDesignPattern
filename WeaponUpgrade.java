package csce247decoratorDesignPattern;

/**
 * This class is used to describe player upgrades
 * 
 * @author aniruthsivakumar
 *
 */
public class WeaponUpgrade extends PlayerDecorator {

	private Player player;
	/**
	 * Constructor method
	 * @param player
	 */
	
	public WeaponUpgrade(Player player) {
		this.player = player;
	}
	
	/**
	 * toString that returns designated text 
	 */

	public String toString() {
		return player.toString() + "\nUpgraded weapon";
	}
	/**
	 * getPower returns the new power that comes with upgrade
	 */
	public double getPower() {
		return player.getPower() + 5;

	}

}
