package com.cw.CowBullWebGame.NumberComparison;

public class Comparison implements ComparisonInterface{

    @Override
    public String compareValues(String userValue, String randomValue) {
        int bull=0,cow=0;
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if (userValue.charAt(i)==randomValue.charAt(j)){
                    if (i==j)
                        bull++;
                    else
                        cow++;
                }
            }
        }
        if (bull==4)
            return "you won";
        else
            return bull+"B"+cow+"C";
    }
}
