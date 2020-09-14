package csce247decoratorDesignPattern;
/**
 * Class for any possible player upgrades. It is abstract.,
 * @author aniruthsivakumar
 *
 */
public abstract class PlayerDecorator extends Player{
	
	/**
	 * toString that returns designated text 
	 */
	
	public String toString() {
		return super.toString();
	}
	
	/**
	 * getPower returns the new power that comes with upgrade
	 */
	
	public double getPower() {
		return super.getPower();
	}

}
