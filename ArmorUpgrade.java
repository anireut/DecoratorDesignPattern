package csce247decoratorDesignPattern;
/**
 * This class is used to describe player upgrades
 * @author aniruthsivakumar
 *
 */

public class ArmorUpgrade extends PlayerDecorator {

	private Player player;
	
	/**
	 * Constructor method
	 * @param player
	 */
	
	public ArmorUpgrade(Player player) {
		this.player = player;
	}

	/**
	 * toString that returns designated text 
	 */
	public String toString() {
		return player.toString() + "\nUpgraded armor";
	}

	/**
	 * getPower returns the new power that comes with upgrade
	 */
	public double getPower() {
		return player.getPower() +3;
	
	}

}
