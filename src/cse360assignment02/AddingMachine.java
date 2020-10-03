package cse360assignment02;

import java.util.ArrayList;
import java.util.List;

public class AddingMachine {
  private int total;
  private List<Integer> history = new ArrayList<Integer>();
  private String string = "0";
  
  /**
  * Constructor of the object AddingMachine
  */  
  public AddingMachine () {
	  total = 0;  // not needed - included for clarity
  }
  
  /**
  * Returns the total
  * @return total the total after all the calculations
  */
  public int getTotal () {
	  return total;
  }
  
  /**
  * Adds the value given to the total
  * @param value the number that needs to be added to the total
  */
  public void add (int value) {
	  total = total + value;
	  history.add (value);
  }

  /**
  * Subtracts the value given to the total
  * @param value the number that needs to be subtracted from the total
  */
  public void subtract (int value) {
	  total = total - value;
	  history.add (-1 * value);
  }

  /**
  * Overrides the toString method for System.out.println
  * @return (name of what gets returned *and what it is)
  */
  public String toString () {
	  for (int i = 0; i < history.size (); i++) {
		  if (history.get(i) < 0) {
			  string = string + " - " + (-1 * history.get (i));
		  } else {
			  string = string + " + " + history.get (i);
		  }
	  }
	  
	  return string;
  }

  /**
  * Method that isn't used/defined in assignment
  */
  public void clear () {
  }
  
  /**
  * Main method to implement the object AddingMachine and its functions
  */
  public static void main(String[] args) {
	  AddingMachine adder = new AddingMachine();
	  
	  adder.add(4);
	  adder.subtract(2);
	  adder.add(5);
	  
	  System.out.println(adder);
	  System.out.println("Total: " + adder.getTotal());
  }
}