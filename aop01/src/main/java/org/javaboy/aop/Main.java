package org.javaboy.aop;

public class Main {
    public static void main(String[] args) {
        MyCalculatorImpl myCalculator = new MyCalculatorImpl();
        MyCalculator calculator = (MyCalculator) CalculatorProxy.getInstance(myCalculator);
        int add=calculator.add(3,4);
        System.out.println("add = " + add);
    }
}
