package com;

import java.util.Scanner;

public class pluralsight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        double div = num1 / num2;

        System.out.println("The sum is " + sum);

    }
}
