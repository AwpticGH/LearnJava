package com.challenges.numberReversal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int[] backwards;

        System.out.println("Input Number : ");
        try {
            number = sc.nextInt();
            backwards = new int[String.valueOf(number).length()];
        }
        catch (Exception e) {
            System.err.println("Put in a number");
            System.out.println("Input Number : ");
            number = sc.nextInt();
            backwards = new int[String.valueOf(number).length()];
        }
        finally {
            for (int i = String.valueOf(number).length() - 1; i >= 0; i--) {
//                System.out.print(backwards[i]);
            }
        }


    }

}
