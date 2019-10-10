/*
Name : Kunal Sharma
CSE 360 Assignment - 2
*/
package cse360assign2;

public class AddingMachine {

	private int total;
        private String transaction;
	
        /*
        This is constructor of class AddingMachine
        */
	public AddingMachine () {
		total = 0;  // initialise total to 0
                transaction = String.valueOf(total); // initialise string with "0"
	}
	
        /*
        getTotal Function provides total value after operations.
        */
	public int getTotal () {
		return total; // returns total value after operatons are performed.
	}
        
	/*
        add function performs addtion.
        */
	public void add (int value) {
            
	 total = total + value;	                     // adds value to the total value
         transaction = transaction + " + " + value;
	}
        
	/*
        subtract function performs subtraction
        */
        
	public void subtract (int value) {
		total = total - value;// subtracts value from the total value.
                transaction = transaction + " - " + value;
        }
        
	/*
        toString function keeps track of transction. 
        */	
	public String toString () {
		return transaction; // returns history of the transactions in the form of string.
	}

        /*
        clear function clears total value and transaction history.
        */
	public void clear() {
	    total= 0;
            transaction = "";// clears total value and history of transactions.
	}
}
