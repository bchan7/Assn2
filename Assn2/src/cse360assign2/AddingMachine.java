// Name: Brandon Chan
// Assignment #: 2
// Class ID: 70641
// Description: This file does several mathematical operations such as
//				adding and subtracting and also keeping track of the total.

package cse360assign2;

public class AddingMachine 
{

	private int total;
	private String opString = "0";
		
	/**
	 * Initializes total and opString
	 * @param total will be the result after all mathematical operations
	 */

	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Gives the current total
	 * @return total, the current total after all operations
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Adds value to the total and then adds the addition operation to the opString
	 * @param value, Will be added to the total
	 */
	public void add (int value) 
	{
		total += value;
		opString = opString + " + " + value;
	}
	
	/**
	 * Subtracts the value from the total and then adds the subtraction operation to the opString
	 * @param value, Will be subtracted from the total
	 */
	public void subtract (int value) 
	{
		total -= value;
		opString = opString + " - " + value; 
	}
		
	/**
	 * 
	 */
	public String toString () 
	{
		return opString;
	}

	/**
	 * Sets the total and and opString back to 0
	 */
	public void clear() 
	{
		total = 0;
		opString = "0";
	}
}
