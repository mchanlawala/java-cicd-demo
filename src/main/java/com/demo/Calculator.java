package com.demo;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }
}
    // Feature: modulo operation
    public int modulo(int a, int b) {
        if (b == 0) throw new ArithmeticException("Modulo by zero");
        return a % b;
    }
