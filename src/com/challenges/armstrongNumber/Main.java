package com.challenges.armstrongNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArmstrongModel model = new ArmstrongModel();
        ArmstrongController ac = new ArmstrongController();
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Number : ");
        model.setNumber(sc.nextInt());
        boolean isArmstrong = ac.isArmstrong(model);

        System.out.println(isArmstrong);

        System.out.print("Input Number for Counting Total of Armstrong Number : ");
        model.setNumber(sc.nextInt());
        int result = ac.countNumberOfArmstrong(model);
        System.out.println("Total Armstrong Number : " + result);
    }

}
