package org.example;

public class CalcDiv {
    protected double calcDiv(double a, double b) {
        if (b == 0) {
            System.out.println("Нельзя делить на ноль");
            return 0;
        }
        return a/b;
    }
}
