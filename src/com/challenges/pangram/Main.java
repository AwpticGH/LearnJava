package com.challenges.pangram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PangramController pc = new PangramController();
        PangramModel model = new PangramModel();

        Scanner sc = new Scanner(System.in);

        System.out.println("Input text : ");
        model.setText(sc.nextLine());

        boolean isPangram = pc.checkPangram(model);
        System.out.println(isPangram);
//        int index = 0;
//        for (int i = 0; i < model.getText().length(); i++) {
//            if (model.getText().charAt(i) >= 'A' && model.getText().charAt(i) <= 'Z') {
//                index = model.getText().charAt(i);
//                System.out.println("Without minus : " + index);
//                System.out.println("With minux : " + (int)(index-'A'));
//                System.out.println((char)index);
//            }
//            else if (model.getText().charAt(i) >= 'a' && model.getText().charAt(i) <= 'z') {
//                index = model.getText().charAt(i);
//                System.out.println("Without minus : " + index);
//                System.out.println("With minux : " + (int)(index-'a'));
//                System.out.println((char)index);
//            }
//        }
    }
}
