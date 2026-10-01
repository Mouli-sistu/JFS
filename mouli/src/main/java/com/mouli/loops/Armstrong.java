package com.mouli.loops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Armstrong Number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		
		while(n!=0) {
			int val=n%10;
			sum=sum+val*val*val;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
		sc.close();
	}

}
