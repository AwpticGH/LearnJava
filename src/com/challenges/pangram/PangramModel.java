package com.challenges.pangram;

public class PangramModel {

    private String text;
    private boolean perfect;
    private boolean pangram;

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isPangram() {
        return pangram;
    }

    public void setPangram(boolean pangram) {
        this.pangram = pangram;
    }

    public boolean isPerfect() {
        return perfect;
    }

    public void setPerfect(boolean perfect) {
        this.perfect = perfect;
    }
}
