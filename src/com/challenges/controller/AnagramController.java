package com.challenges.controller;

import com.challenges.model.AnagramModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class AnagramController {

    public boolean checkWords(AnagramModel model) {
        ArrayList<char[]> dynamicChar = new ArrayList<>();

        for (String text : model.getWords()) {
            dynamicChar.add(text.toLowerCase().toCharArray());
        }
        Consumer<char[]> sort = Arrays::sort;
        dynamicChar.forEach(sort);

        boolean checked = false;
        for (int i = 0; i < dynamicChar.size() - 1; i++) {
            if (Arrays.equals(dynamicChar.get(i), dynamicChar.get(i + 1))) {
                checked = true;
                break;
            }
        }
        return checked;
    }

    public int countDifferentWords(AnagramModel model) {
        for (int i = 0; i < model.getWords().length - 1; i++) {
            if (model.getWords(i).length() != model.getWords(i+1).length()) {
                model.incNumberOfWordsWithDifferentLength();
            }
        }
        return model.getNumberOfWordsWithDifferentLength();
    }

    public ArrayList<String[]> splitDifferentWords(AnagramModel model) {
        int counter = 0;
        for (int i = 0; i < model.getNumberOfWordsWithDifferentLength(); i++) {
            for (int j = 0; j < model.getNumberOfWords(); j++) {
                if (i == 0) {
                    if (model.getDiffWords().isEmpty()) {
                        if (model.getWords(j).length() != model.getWords(j + 1).length()) { // +1 to compare with next word
                            model.addDiffWords(i, new String[j+1]);
                            j = -1;
                        }
                    }
                    else {
                        model.setWordInArrayList(i, j, model.getWords(j));
                        if (model.getWords(j).length() != model.getWords(j + 1).length()) {
                            break;
                        }
                    }
                }
                else {

                }
                /*
                if (!model.getDiffWords().isEmpty()) {
                    model.setWordInArrayList(i, j, model.getWords(j));
                }
                if (model.getWords(j).length() != model.getWords(j + 1).length()) { // +1 to compare with next word
                    if (i == 0) {
                        if (model.getDiffWords().isEmpty()) {
                            model.addDiffWords(i, new String[j + 1]); // +1 because index starts at 0
                            j = 0;
                        }
                        counter = 0;
                        break;
                    }
                    if (i != 0) {
                        counter++;
                        model.addDiffWords(i, new String[counter]);
                    }
                }

                 */
            }
        }
        return model.getDiffWords();
    }
}
