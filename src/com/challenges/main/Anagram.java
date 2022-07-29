package com.challenges.main;

import com.challenges.controller.AnagramController;
import com.challenges.model.AnagramModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class Anagram {

    public static void main(String[] args) {
        AnagramModel model = new AnagramModel();
        AnagramController controller = new AnagramController();

        ArrayList<Integer> wordLength = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many words do you want to input?");
        model.setNumberOfWords(sc.nextInt());
        model.instantiateWords(model.getNumberOfWords());

        boolean different = false;
        int counter = 0;

        for (int i = 0; i < model.getNumberOfWords(); i++) {
            System.out.print("Input Word " + (int)(i+1) + " : ");
            model.setWords(i, sc.next());
            counter++;
            System.out.println("Counter : " + counter);
            if (i != 0) {
                if (model.getWords(i).length() != model.getWords(i-1).length()) {
                    System.out.println("Counter : " + counter);
                    wordLength.add(counter-1);
                    counter = 1;
                }
                if (i == model.getNumberOfWords()-1) {
                    System.out.println("Counter : " + counter);
                    wordLength.add(counter);
                    counter = 1;
                }
            }
        }

        boolean found = controller.checkWords(model);
        System.out.println("word lengths : " + wordLength);
        if (found) {
            model.setWordsWithDifferentLength(controller.countDifferentWords(model));

            System.out.println("Default : " + Arrays.toString(model.getWords()));


            if (controller.countDifferentWords(model) != 0) {
                model.instantiateDiffWords();

                for (int i = 0; i < wordLength.size(); i++) {
                    model.addDiffWords(i, new String[wordLength.get(i)]);
                }

                counter = 0;
                for (int i = 0; i < wordLength.size(); i++ ) {
                    for (int j = 0; j < wordLength.get(i); j++) {
                        model.setWordInArrayList(i, j, model.getWords(counter));
                        counter++;
                    }
                }
                for (int i = 0; i < wordLength.size(); i++) {
                    System.out.println("Dynamic : " + Arrays.toString(model.getDiffWords(i)));
                }
//
//                ArrayList<String[]> arrays = controller.splitDifferentWords(model);
//
//                for (int i = 0 ; i < arrays.size(); i++) {
//                    System.out.println(Arrays.toString(arrays.get(i)));
//                }
            }
        }
    }

}
