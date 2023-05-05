package org.example;

import java.io.IOException;

import static org.example.Logger.addToLog;

public class Program {
    CalcMain calc;
    Status status;
    public Program() {
        this.calc = new CalcMain();
    }

    public double sum(double a, double b) throws IOException {
        addToLog(a + " + " + b);
        return this.calc.calcSum(a, b);
    }

    public double sub(double a, double b) throws IOException {
        addToLog(a + " - " + b);
        return this.calc.calcSub(a, b);
    }

    public double div(double a, double b) throws IOException {
        addToLog(a + " / " + b);
        return this.calc.calcDiv(a, b);
    }

    public double mult(double a, double b) throws IOException {
        addToLog(a + " * " + b);
        return this.calc.calcMult(a, b);
    }

}
