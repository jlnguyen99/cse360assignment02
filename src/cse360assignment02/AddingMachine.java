package cse360assignment02;

import java.util.ArrayList;
import java.util.List;

public class AddingMachine {
  private int total;
  private List<Integer> history = new ArrayList<Integer>();
  private String string = "0";
  
  public AddingMachine () {
	  total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
	  return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  history.add (value);
  }

  public void subtract (int value) {
	  total = total - value;
	  history.add (-1 * value);
  }

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

  public void clear () {
  }
  
  public static void main(String[] args) {
	  AddingMachine adder = new AddingMachine();
	  
	  adder.add(4);
	  adder.subtract(2);
	  adder.add(5);
	  
	  System.out.println(adder);
	  System.out.println("Total: " + adder.getTotal());
  }
}