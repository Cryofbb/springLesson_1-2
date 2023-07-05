package com.example.demo.beansCalc;

import org.springframework.stereotype.Component;

@Component("multiply")
public class Multiply {
    public void calculate(int num1, int num2) {
        System.out.println(num1 * num2);
    }
}