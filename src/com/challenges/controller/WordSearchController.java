package com.challenges.controller;

import com.challenges.model.WordSearchModel;

public class WordSearchController {

    public boolean search(String input, WordSearchModel model) {
        if (model.getWord().contains(input)) {
            int result = countWord(input, model);
            System.out.println("Found " + result);
            return true;
        }
        else {
            return false;
        }
    }

    private int countWord(String input, WordSearchModel model) {
        int result = 0;
        String[] inputs = model.getWord().split(" ");

        for (String text : inputs) {
            if (text.equalsIgnoreCase(input) || text.contains(input)) {
                result++;
            }
        }
        return result;
    }
}
