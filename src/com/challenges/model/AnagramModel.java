package com.challenges.model;

import com.challenges.main.Anagram;

import java.util.ArrayList;

public class AnagramModel {

    private int numberOfWords;
    private int numberOfWordsWithDifferentLength = 0;
    private String[] words;
    private ArrayList<String[]> diffWords;

    public void instantiateWords(int number) {
        words = new String[number];
    }

    public void instantiateDiffWords() {
        diffWords = new ArrayList<>();
    }

    public void addDiffWords(int i, String[] words) {
        diffWords.add(i, words);
    }

    public ArrayList<String[]> getDiffWords() {
        return diffWords;
    }

    public String[] getDiffWords(int i) {
        return diffWords.get(i);
    }

    public void setWordInArrayList(int i, int j, String word) {
        diffWords.get(i)[j] = word;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    public int getNumberOfWordsWithDifferentLength() {
        return numberOfWordsWithDifferentLength;
    }

    public void incNumberOfWordsWithDifferentLength() {
        numberOfWordsWithDifferentLength++;
    }

    public void setWordsWithDifferentLength(int numberOfWordsWithDifferentLength) {
        this.numberOfWordsWithDifferentLength = numberOfWordsWithDifferentLength;
    }

    public void setWords(int i, String word) {
        this.words[i] = word;
    }

    public String getWords(int i) {
        return words[i];
    }

    public String[] getWords() {
        String[] clone = words.clone();
        return clone;
    }
}
