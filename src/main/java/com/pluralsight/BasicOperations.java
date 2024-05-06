package com.pluralsight;

import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Boolean running = true;

        while (running) {


            System.out.print("Which would you like to do? (add, subtract, divide or multiply? or select X to stop) ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("add")) {
                doAdd(scanner);
            } else if (response.equalsIgnoreCase("subtract")) {
                doSubtract(scanner);

            } else if (response.equalsIgnoreCase("divide")) {
                doDivide(scanner);

            } else if (response.equalsIgnoreCase("multiply")) {
                doMultiply(scanner);

            } else if (response.equalsIgnoreCase("X")) {
                running = false;

            } else if (!response.isEmpty())  {
                System.out.println("Invalid input. Please try again");
            }
        }
    }
    private static void doAdd(Scanner scanner) {
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("The result is " + result);
    }

    private static void doSubtract(Scanner scanner) {
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int result = num1 - num2;
        System.out.println("The result is " + result);
    }

    private static void doDivide(Scanner scanner) {
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int result = num1 / num2;
        System.out.println("The result is " + result);
    }

    private static void doMultiply(Scanner scanner) {
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int result = num1 * num2;
        System.out.println("The result is " + result);
    }
}