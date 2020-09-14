package csce247decoratorDesignPattern;

/**
 * This class describes skill upgrades for players
 * 
 * @author aniruthsivakumar
 *
 */
public class Skill extends PlayerDecorator {

	private Player player;

	/**
	 * This is the constructor method
	 * 
	 * @param player
	 */
	public Skill(Player player) {
		this.player = player;
	}

	/**
	 * toString that returns designated text
	 */
	public String toString() {
		return player.toString() + "\nGained a skill";
	}

	/**
	 * getPower returns the new power that comes with upgrade
	 */
	public double getPower() {

		return player.getPower() + 2;

	}
}
