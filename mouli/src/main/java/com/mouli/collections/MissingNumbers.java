package com.mouli.collections;

import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9, 10);

        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total = total + i;
        }
        int sum = 0;
        for (Integer num : list) {
            sum = sum + num;
        }
        int missing = total - sum;
        System.out.println("List: " + list);
        System.out.println("Missing Number: " + missing);
    }
}