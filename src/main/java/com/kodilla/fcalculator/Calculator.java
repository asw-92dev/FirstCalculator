package com.kodilla.fcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {

    public int Add(int a, int b) {
        return a + b;
    }
    public int Subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        SpringApplication.run(Calculator.class, args);
        Calculator calculator = new Calculator();
        System.out.println(calculator.Add(4,5));
        System.out.println(calculator.Subtract(10,3));
    }

}
