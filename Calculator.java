package cse360assign3;

/**
 * This Class implements a calculator layer that extends the functionality of the
 *  AddingMachine class.
 * 
 * 
 * @author JonathanCahal<br>
 * CSE 360<br>
 * Assignment 3
 * 
 * @since 1.0
 * @version 1.0
 *
 */

public class Calculator extends AddingMachine {

	/**
	 * Basic multiply function for the Calculator Class. Multiplies value given to the
	 * 	total member of the Calculator instance.
	 *  
	 * @param value
	 */
	
	public void multiply(int value) {
		
		this.total = this.total * value;
		
		this.history = this.history + "* " + value + " ";
	}
	
	/**
	 * Basic divide function for the Calculator Class. Divides total member of Calculator
	 *  instance by the value given.
	 *  
	 * @param value
	 */
	
	public void divide(int value) {
		
		/*
		 * Check for division by 0 and set total appropriately.
		 */
		if(value == 0) {
			
			this.total = 0;
			
		} else {
			
			this.total = this.total / value;
			
		}
		
		this.history = this.history + "/ " + value + " ";
	}
	
	/**
	 * Basic power to function for the Calculator Class. Raises total member of Calculator
	 *  instance to the power of the value given.
	 *   
	 * @param value
	 */
	
	public void power(int value) {
		
		/*
		 * Check for negative exponent and set total appropriately.
		 */
		if(value < 0) {
			
			this.total = 0;
			
		} else {
			
			this.total = (int)Math.pow(this.total, value);
			
		}
		
		this.history = this.history + "^ " + value + " ";
		
	}
}
