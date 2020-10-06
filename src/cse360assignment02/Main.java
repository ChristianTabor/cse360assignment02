package cse360assignment02;

public class Main {

    public static void main(String[] args) {

        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add(4);
        myCalculator.subtract(2);
        myCalculator.add(5);
        System.out.print("\n" + myCalculator.getTotal());
        System.out.print(myCalculator.toString());
        myCalculator.clear();
        myCalculator.subtract(7);
        myCalculator.add(3);
        System.out.print("\n" + myCalculator.getTotal());
        System.out.print(myCalculator.toString());

    }

}
