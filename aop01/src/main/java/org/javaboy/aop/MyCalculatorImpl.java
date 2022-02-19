package org.javaboy.aop;

public class MyCalculatorImpl implements MyCalculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
