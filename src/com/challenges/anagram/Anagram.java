package com.challenges.anagram;

import com.challenges.anagram.AnagramController;
import com.challenges.anagram.AnagramModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        AnagramModel model = new AnagramModel();
        AnagramController controller = new AnagramController();

        ArrayList<Integer> wordLength = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many words do you want to input?");
        model.setNumberOfWords(sc.nextInt());
        model.instantiateWords(model.getNumberOfWords());

        int counter = 0;

        for (int i = 0; i < model.getNumberOfWords(); i++) {
            System.out.print("Input Word " + (int)(i+1) + " : ");
            model.setWords(i, sc.next());
            counter++;
            if (i != 0) {
                if (model.getWords(i).length() != model.getWords(i-1).length()) {
                    wordLength.add(counter-1);
                    counter = 1;
                }
                if (i == model.getNumberOfWords()-1) {
                    wordLength.add(counter);
                    counter = 1;
                }
            }
        }

        boolean found = controller.checkWords(model);

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
            }
        }
    }

}
