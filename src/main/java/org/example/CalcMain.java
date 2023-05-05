package org.example;

public class CalcMain {
    CalcSum sum;
    CalcSub sub;
    CalcDiv div;
    CalcMult mult;
    double res;

    protected CalcMain() {
        this.sum = new CalcSum();
        this.sub = new CalcSub();
        this.div = new CalcDiv();
        this.mult = new CalcMult();
        this.res = 0;
    }

    protected double calcSum(double a, double b) {
        this.res = this.sum.clacSum(a, b);
        System.out.println(a + " + " + b + " = " + this.res);
        return this.res;
    }

    protected double calcSub(double a, double b) {
        this.res = this.sub.calcSub(a, b);
        System.out.println(a + " + " + b + " = " + this.res);
        return this.res;
    }

    protected double calcMult(double a, double b) {
        this.res =  this.mult.calcMult(a, b);
        System.out.println(a + " * " + b + " = " + this.res);
        return this.res;
    }

    protected double calcDiv(double a, double b) {
        this.res = this.div.calcDiv(a, b);
        System.out.println(a + " / " + " = " + this.res);
        return this.res;
    }
}
