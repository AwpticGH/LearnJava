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
    }
}
