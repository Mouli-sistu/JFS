package com.mouli.lambda;

import java.util.Arrays;

public class CorrectPattern {
    public static void main(String[] args) {
        String input = "ACEBD534FG12";
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } 
            else if (Character.isDigit(ch)) {
                numbers.append(ch);
            }
        }

        char[] letterArray = letters.toString().toCharArray();
        char[] numberArray = numbers.toString().toCharArray();
        Arrays.sort(letterArray);
        Arrays.sort(numberArray);
        System.out.println("Output: "+ new String(letterArray)+ new String(numberArray));
    }
}