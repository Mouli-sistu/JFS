package com.mouli.collections;

import java.util.ArrayList;
import java.util.List;

public class EvenPrimeList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(7);
        numbers.add(15);
        numbers.add(2);
        numbers.add(13);
        numbers.add(20);
        numbers.add(9);
        numbers.add(17);
        numbers.add(8);
        numbers.add(11);
        System.out.println("Numbers in the List:");
        System.out.println(numbers);

        System.out.println("\nEven Numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        
        System.out.println("\nPrime Numbers:");
        for (int num : numbers) {

            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(num);
            }
        }

	}

}
