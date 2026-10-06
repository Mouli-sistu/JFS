package com.mouli.operators;
import java.util.Scanner;
public class Testops {

	public static void main(String[] args) {
//		int m=7;
//		int x=3;
//		int n=m++ + --m + ++m;
//		System.out.println(n);
//		int y=x++ + ++x +x-- + --x;
//		System.out.println(y);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		long y=sc.nextLong();
		if(y>=0 && y%100==0) {
			System.out.println("Entered year is a Leap year");
		}
		else {
			System.out.println("Entered year is not a leap year");
		}
		sc.close();
		
		
		

	}

}
