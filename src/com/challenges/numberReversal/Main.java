package com.challenges.numberReversal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Number or Decimal : ");
        System.out.println("1. Number");
        System.out.println("2. Decimal");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Input Number : ");
                int number = sc.nextInt();
//                simple(number);
                notSimple(number);
            }
            case 2 -> {
                System.out.print("Input Decimal : ");
                double number = sc.nextDouble();
                simple(number);
//                notSimple(number);
            }
            default -> System.out.println("Not an option");
        }
    }

    private static void simple(int number) {
        StringBuilder reverse = new StringBuilder(String.valueOf(number));

        System.out.print("Result : ");

        number = Integer.parseInt(reverse.reverse().toString());
        System.out.println(number);
    }

    private static void simple(double number) {
        StringBuilder reverse = new StringBuilder(String.valueOf(number));

        System.out.print("Result : ");

        reverse.reverse();
        reverse.deleteCharAt(2);
        reverse.insert(reverse.length()-2, '.');
        number = Double.parseDouble(reverse.toString());
        System.out.println(number);
    }

    private static int reverseInt = 0;

    private static void notSimple(int number) {
        while (number != 0) {
            int remainder = number % 10;
            reverseInt = (reverseInt*10) + remainder;
            number = number/10;
        }
        System.out.println("Reverse : " + reverseInt);
    }
}
