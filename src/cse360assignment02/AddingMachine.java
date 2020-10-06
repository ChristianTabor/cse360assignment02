/* Christian Tabor
Repository Link : https://github.com/ChristianTabor/cse360assignment02/
 */


package cse360assignment02;

import java.util.ArrayList;

public class AddingMachine {

    private int total;
    private final ArrayList<Operation> operations; //declares a new ArrayList of operations
    public AddingMachine() {
        total = 0;  // not needed - included for clarity
        operations = new ArrayList<>();
    }

    public int getTotal() {
        return total;
    }

    public void add(int value) {
        operations.add(new Operation(value, "+")); //creates a new addition operator and adds it to the ArrayList
        total += value; //adds the value to the total
    }

    public void subtract(int value) {
        operations.add(new Operation(value, "-")); //creates a new subtraction operator and adds it to the ArrayList
        total -= value; //subtracts the value from the total
    }

    public String toString() {
        StringBuilder listOfOps = new StringBuilder("\n0");
        for (Operation operation : operations) { //loops through the ArrayList and appends a string with the number and operation
            listOfOps.append(" ").append(operation.operator).append(" ").append(operation.operand);
        }
        return listOfOps.toString();
    }

    public void clear() {
        operations.clear(); //clears the ArrayList and sets the total to 0
        total = 0;
    }

    private static class Operation { //custom class that contains an operand and operator
        int operand;
        String operator;

        Operation(int operand, String operator) {
            this.operand = operand; //sets the operand and operator to the passed through values
            this.operator = operator;
        }

    }
}

