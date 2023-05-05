package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        View calculator = new View();
        calculator.start(new Scanner(System.in));
    }
}