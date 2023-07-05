package com.example.demo.apps;

public class Scan {
    public String[] sum(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter operation in 1 line without spaces");
        String input = sc.nextLine();
        String[] sum = input.split("(?=\\D)|(?<=\\D)");
        return sum;
    }
}
