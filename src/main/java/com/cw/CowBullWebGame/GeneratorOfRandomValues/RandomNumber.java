package com.cw.CowBullWebGame.GeneratorOfRandomValues;

import java.util.Random;

public class RandomNumber implements RandomNumberInterface{
    final int bottomValue   = 1000;
    final int upperValue    = 10000;
    final int averageValue  = upperValue-bottomValue;

    private int generatedRandomValue;

    @Override
    public int getRandomValue() {
        Random randomValue = new Random();

        do {
            this.generatedRandomValue=randomValue.nextInt(averageValue)+bottomValue;
        } while (isValueGood(this.generatedRandomValue));

        return generatedRandomValue;
    }

    @Override
    public boolean isValueGood(int value) {

        String testedValue = String.valueOf(value);

        for (int i=0; i<4; i++){
            for (int j=i+1; j<4; j++){
                if (testedValue.charAt(i)==testedValue.charAt(j))
                    return true;
            }
        }
        return false;
    }
}
