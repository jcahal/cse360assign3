package cse360assign3;

/**
 * This Class implements a simple arithmetic machine
 * 
 * 
 * @author JonathanCahal<br>
 * CSE 360<br>
 * Assignment 3
 * 
 * @since 1.0
 * @version 1.0
 * 
 * @param total The int total after calculations on an AddingMachine instance
 * @param history The String history of calculations on an AddingMachine instance
 *
 */

public class AddingMachine {
	
	protected int total;
	protected String history = "0 "; // 0 added to match initial total
	
	/**
	 * Default  for the AddingMachine Class.
	 * 
	 */
	public AddingMachine () {
		
		total = 0;  // not needed - included for clarity
	
	}
	
	/**
	 * getTotal function for the result of calculation.
	 * 
	 * @return the result of the calculation.
	 */
	public int getTotal () {
		
		return this.total;
	
	}
	
	/**
	 * Basic add function for the AddingMachine Class. Adds value given to the
	 * 	total member of the AddingMachine instance.
	 * 
	 * @param value the int value to be added.
	 */
	public void add (int value) {
		
		this.total = this.total + value;
		
		this.history = this.history + "+ " + value + " "; // must add trailing space
	}
	
	/**
	 * Basic subtract function for the AddingMachine Class. Subtracts value given from the
	 * 	total member of the AddingMachine instance.
	 * 
	 * @param value the int value to be subtracted.
	 */
	public void subtract (int value) {
		
		this.total = this.total - value;
		
		this.history = this.history + "- " + value + " "; // must add trailing space
	}
	
	/**
	 * Displays the history member of the AddingMachine instance.
	 * 
	 * @return The history member of the AddingMachine instance.
	 */
	public String toString () {

		return this.history;
		
	}
	
	/**
	 * Clears the contents of total and history of an AddingMachine instance.
	 * 
	 */
	public void clear() {
		
		this.total = 0;
		
		this.history = "0";
	}
}