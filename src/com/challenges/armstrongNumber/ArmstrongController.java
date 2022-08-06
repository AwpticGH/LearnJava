package com.challenges.armstrongNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class ArmstrongController {

    public boolean isArmstrong(ArmstrongModel model) {
        String[] numbers = String.valueOf(model.getNumber()).split("");
        model.setResult(0);

        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            for (int j = 0; j < numbers.length-1; j++) {
                number = number * Integer.parseInt(numbers[i]);
            }
            model.setResult(model.getResult() + number);
            model.setArmstrong(i == numbers.length - 1 && model.getResult() == model.getNumber());
        }
        return model.isArmstrong();
    }

    public int countNumberOfArmstrong(ArmstrongModel model) {
        boolean[] armstrong = new boolean[model.getNumber()];
        ArrayList<Integer> numbers = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < armstrong.length; i++) {
            model.setNumber(i + 1);
            armstrong[i] = isArmstrong(model);
            if (armstrong[i]) {
                numbers.add(model.getNumber());
                counter++;
            }
        }
        System.out.println(Arrays.toString(numbers.toArray()));
        return counter;
    }
}
