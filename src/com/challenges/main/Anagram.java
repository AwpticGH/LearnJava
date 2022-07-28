package com.challenges.main;

import com.challenges.controller.AnagramController;
import com.challenges.model.AnagramModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        AnagramModel model = new AnagramModel();
        AnagramController controller = new AnagramController();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many words do you want to input?");
        model.setNumberOfWords(sc.nextInt());
        model.instantiateWords(model.getNumberOfWords());

        for (int i = 1; i <= model.getNumberOfWords(); i++) {
            System.out.print("Input Word " + i + " : ");
            model.setWords(i-1, sc.next());
        }

        boolean found = controller.checkWords(model);
        if (found) {
            model.setWordsWithDifferentLength(controller.countDifferentWords(model));
            if (controller.countDifferentWords(model) != 0) {
                model.instantiateDiffWords();

                ArrayList<String[]> arrays = controller.splitDifferentWords(model);

                for (int i = 0 ; i < arrays.size(); i++) {
                    System.out.println(Arrays.toString(arrays.get(i)));
                }
            }
        }
    }

}
