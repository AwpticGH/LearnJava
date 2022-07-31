package com.challenges.productMaximizer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target;
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Input Target : ");
        target = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            System.out.print("Input Number : ");
            numbers.add(sc.nextInt());
        }
        countProduct(target, numbers);

    }

    private static void countProduct(int target, ArrayList<Integer> numbers) {
        if (target == 0) ;

    }

}
