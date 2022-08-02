package com.challenges.productMaximizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total;
        int result;
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();

        System.out.print("Input Total Number : ");
        total = sc.nextInt();

        System.out.println("Loops : " + loopCounter(total));

        for (int i = 0; i < total; i++) {
            System.out.print("Input Number : ");
            numbers.add(sc.nextInt());
        }

        for (int number1 : numbers) {
            for (int number2 : numbers) {
                if (number1 != number2 & !results.contains(number1 + number2)) {
                    System.out.println(number1 + " + " + number2 + " = " + (int)(number1+number2));
                    results.add(number1 + number2);
                }
            }
        }

        System.out.println(Arrays.toString(results.toArray()));

        result = results.get(0);

        for (int i = 1; i < results.size(); i++) {
            if (results.get(i) > result) {
                result = results.get(i);
            }
        }

        System.out.println("Max Product : " + result);
    }

    private static int loopCounter(int n) throws StackOverflowError {
        if (n == 0) {
            return 0;
        }
        return loopCounter(n-1) + (n - 1);
    }

}
