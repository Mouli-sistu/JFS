package com.mouli.lambda;

import java.util.Scanner;

@FunctionalInterface
interface PrimeNumber {
    boolean check(int n);
}

public class PrimeLambda {
    public static void main(String[] args) {
    	System.out.println("Main Method Started");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        PrimeNumber p = (num) -> {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };

        if (p.check(n)) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
        sc.close();
    }
}
