package org.example;

import java.io.IOException;
import java.util.Scanner;

import static org.example.Status.OFF;
import static org.example.Status.ON;

public class View {
    Program prog;
    Logger log;

    public View() {
        this.prog = new Program();
        this.log = new Logger();
    }

    public void start(Scanner scan) throws IOException {
        prog.status = ON;
        log.startLog();
        System.out.println("Введите первое число: ");
        double a = Double.parseDouble(scan.nextLine());
        chooseOp(scan, a);
        while (prog.status == ON)
            chooseOp(scan, prog.calc.res);
    }

    private Double chooseOp(Scanner scan, double a) throws IOException {
        System.out.println("- + / * =");
        String choice = scan.nextLine();
        if (choice.equals("=")){
            prog.status = OFF;
            System.out.println(this.prog.calc.res);
            return null;
        }
        double b = getNumber2(scan);
        switch (choice) {
            case "-":
                return prog.sub(a, b);
            case "+":
                return prog.sum(a, b);
            case "*":
                return prog.mult(a, b);
            case "/":
                return prog.div(a, b);
        }
        return null;
    }

    private double getNumber2(Scanner scan) {
        System.out.println("Введите второе число: ");
        return Double.parseDouble(scan.nextLine());
    }
}
