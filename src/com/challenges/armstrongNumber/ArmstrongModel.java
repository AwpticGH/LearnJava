package com.challenges.armstrongNumber;

public class ArmstrongModel {

    private boolean armstrong = false;
    private int number;
    private int result;

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void setArmstrong(boolean armstrong) {
        this.armstrong = armstrong;
    }

    public boolean isArmstrong() {
        return armstrong;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
