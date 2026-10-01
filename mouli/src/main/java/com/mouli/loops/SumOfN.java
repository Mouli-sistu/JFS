package com.mouli.loops;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		System.out.println("--------------Sum of first N numbers--------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			
			sum+=i;
		}
		System.out.println(sum);
		sc.close();

	}

}
