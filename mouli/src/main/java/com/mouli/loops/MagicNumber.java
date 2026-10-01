package com.mouli.loops;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		System.out.println("Magic Number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>9) {
			int sum=0;
			while(n>0) {
				int rem=n%10;
				n=n/10;
				sum+=rem;
			}
			n=sum;
		}
		if(n==1) {
			System.out.println("Magic Number");
		}
		else {
			System.out.println("Not a Magic Number");
		}
		sc.close();
		

	}

}
