package com.mouli.operators;
import java.util.Scanner;
public class TestLowecase {

	public static void main(String[] args) {
		System.out.println("TO chech a given alphabet is in lowercase or not");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Alphabet:");
		char c=sc.next().charAt(0);
		if(c >= 'a' && c<='z') {
			System.out.println("The entered alphabet is in Lowercase");
		}
		else {
			System.out.println("The enterede alphabet is not in lowecase");
		}
		sc.close();
	}

}
