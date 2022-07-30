package com.challenges.numberReversal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        double decimal = 0;
        StringBuilder backward;
        String[] backwards;

        System.out.println("Input Number or Decimal : ");
        System.out.println("1. Number");
        System.out.println("2. Decimal");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Input Number : ");
                number = sc.nextInt();
                backward = new StringBuilder(String.valueOf(number));
                number = Integer.parseInt(backward.reverse().toString());
                System.out.println(number);
            }
            case 2 -> {
                System.out.print("Input Decimal : ");
                decimal = sc.nextDouble();
                backward = new StringBuilder(String.valueOf(decimal));
                System.out.print("Result : ");
                backward.reverse();
                backward.deleteCharAt(2);
                backward.insert(backward.length()-2, '.');
                decimal = Double.parseDouble(backward.toString());
                System.out.println(decimal);
            }
            default -> System.out.println("Not an option");
        }


    }

}
