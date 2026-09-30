package com.mouli.collections;

import java.util.*;

public class RemoveDupliactes {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40);

        List<Integer> result = new ArrayList<>();

        for (Integer num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }

        System.out.println("Original List: " + list);
        System.out.println("After Removing Duplicates: " + result);
    }
}
