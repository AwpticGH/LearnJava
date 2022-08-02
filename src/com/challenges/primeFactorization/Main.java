package com.challenges.primeFactorization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(Arrays.toString(getPrimeFactors(i).toArray()));
        }


    }

    private static ArrayList<Integer> getPrimeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            if (number % (i + 1) == 0) {
                factors.add(i+1);
            }
        }
        return factors;
    }
}
