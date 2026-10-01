package com.mouli.loops;

import java.util.Scanner;

public class PrimeByPosition {

	public static void main(String[] args) {
		System.out.println("To print the prime numbers at prime position");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int primecount=0;
		for(int i=2;primecount<n;i++) {
			boolean isPrime=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
				primecount++;
			}
		}
		sc.close();

	}

}
//2 3 5 7 11 13 17 19 23 29