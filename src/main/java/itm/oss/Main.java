package itm.oss;

import itm.oss.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("This is mycalculator. 5 + 5 = " + calc.add(5, 5));
    }
}