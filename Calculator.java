package com.Saksham;

import java.util.Scanner;

public class Calculator {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        boolean calculator = false;

        while (!calculator) {

            System.out.println("Welcome to the Calculator \nHere are some instructions for you : \r");
            System.out.println("Press + to ADD ( + ) ");
            System.out.println("Press - to SUBTRACT ( - ) ");
            System.out.println("Press * to MULTIPLY ( * ) ");
            System.out.println("Press / to DIVIDE ( / ) ");
            System.out.println("Press % to find out percentage ( % ) ");
            System.out.println("Press 6 to EXIT ");
            char choice = scan.next().charAt(0);

            switch (choice) {
                case '+':
                    ADD();
                    break;
                case '-':
                    SUBTRACT();
                    break;
                case '*':
                    MULTIPLY();
                    break;
                case '/':
                    DIVIDE();
                    break;
                case '%':
                    PERCENTAGE();
                    break;
                case '6':
                    System.out.println("Thank you for using the calculator ");
                    calculator = true;
                    break;
                default:
                    System.out.println("Please enter entities from above .\nTry again");
                    System.out.println("**********************************************\n");
            }
        }
    }

    public static void ADD() {
        System.out.println("Enter the first number");
        double a = scan.nextDouble();
        System.out.println("Enter the second number");
        double b = scan.nextDouble();
        System.out.println("Sum of " + a + " and " + b + " is = " + (a + b));
    }

    public static void SUBTRACT() {
        System.out.println("Enter the first number");
        double a = scan.nextDouble();
        System.out.println("Enter the second number");
        double b = scan.nextDouble();
        System.out.println("Subtraction of " + a + " and " + b + " is = " + (a - b));
    }

    public static void DIVIDE() {
        System.out.println("Enter the first number");
        double a = scan.nextDouble();
        System.out.println("Enter the second number");
        double b = scan.nextDouble();
        try {
            System.out.println("Division of " + a + " and " + b + " is = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error division with '0' as a denominator is NOT DEFINED .");
        }
    }

    public static void MULTIPLY() {
        System.out.println("Enter the first number");
        double a = scan.nextDouble();
        System.out.println("Enter the second number");
        double b = scan.nextDouble();
        System.out.println("Multiplication of " + a + " and " + b + " is = " + (a * b));
    }

    public static void PERCENTAGE() {
        System.out.println("Enter the Total ");
        double total = scan.nextDouble();
        System.out.println("Enter the entity for percentage");
        double entity = scan.nextDouble();
        System.out.println("Percentage of " + entity + " in a total of " + total + " is =  " + ((entity / total) * 100));
    }
}
