package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Calculator calculator = new Calculator();
        int result = calculator.add(111, -11);
        System.out.println("The result is: " + result + " !");

    }
}