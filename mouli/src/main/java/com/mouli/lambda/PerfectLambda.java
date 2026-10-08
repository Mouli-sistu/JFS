package com.mouli.lambda;

import java.util.Scanner;

@FunctionalInterface
interface PerfectNumber {
    boolean check(int n);
}

public class PerfectLambda {
    public static void main(String[] args) {
    	System.out.println("Main Method Started");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        PerfectNumber p = (num) -> {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                }
            }
            return sum == num;
        };
        
        if (p.check(n)) {
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is not a Perfect Number");
        }
        sc.close();
    }
}
