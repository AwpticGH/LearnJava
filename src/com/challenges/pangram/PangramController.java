package com.challenges.pangram;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.text.CharacterIterator;
import java.util.ArrayList;

public class PangramController {

    public boolean checkPangram(PangramModel model) {
        String text = model.getText();

        boolean[] alphabets = new boolean[26];
        int index = 0;

        int[] alphaCounter = new int[26];

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                index = text.charAt(i) - 'A';
                alphabets[index] = true;
                alphaCounter[index]++;
            }
            else if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                index = text.charAt(i) - 'a';
                alphabets[index] = true;
                alphaCounter[index]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!alphabets[i]) {
                model.setPangram(false);
            }
            else {
                model.setPangram(true);
            }
            if (alphaCounter[i] != 1) {
                model.setPerfect(false);
            }
            System.out.println(alphaCounter[i]);
        }

        if (model.isPangram()) {
            if (model.isPerfect()) {
                System.out.println("perpek");
                return model.isPerfect();
            }
            else {
                System.out.println("not perpek");
                return model.isPangram();
            }
        }
        else {
            System.out.println("not pangram");
            return model.isPangram();
        }
    }

}
