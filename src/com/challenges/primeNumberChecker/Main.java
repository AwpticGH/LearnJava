package com.challenges.primeNumberChecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> primeList = new ArrayList<>();
        System.out.print("Input Number : ");

//        int number = sc.nextInt();
//        if (number > 1) {
//            System.out.println(isPrime(number, primeList));
//        }
//        if (number <=0) {
//            System.out.println("Really?");
//        }
//        if (number == 1) {
//            System.out.println("1 Is The PRIME");
//        }

        int total = sc.nextInt();

        for (int i = 2; i <= total; i++) {
            if (isPrime(i, primeList)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number, ArrayList<Integer> primes) {
        boolean isPrime = false;
        int counter = 0;

        if (primes.isEmpty()) {
            primes.add(2);
            primes.add(3);
        }

        int[] remainders = new int[primes.size()];

        if (number > 1 && number <= 3) {
            isPrime = true;
        }
        else if (number <= 0) {
            return false;
        }
        else {
            while (!isPrime) {
                remainders[counter] = number % primes.get(counter);

                if (counter == primes.size()-1) {
                    for (int remainder : remainders) {
                        if (remainder != 0) {
                            if (!primes.contains(number)) {
                                primes.add(number);
                            }
                            isPrime = true;
                            break;
                        }
                    }
                }
                if (remainders[counter] == 0) {
                    break;
                }
                counter++;
            }
        }
        return isPrime;
    }
}
