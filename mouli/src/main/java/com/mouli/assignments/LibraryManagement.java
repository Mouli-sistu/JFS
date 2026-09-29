package com.mouli.assignments;

import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args) {
		System.out.println("---------------Library Management System-------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Vivekananda Library \nDo you have a Library Card(YES/NO):");
		String libCard=sc.next();
		if(libCard.equals("YES") || libCard.equals("yes")) {
			System.out.println("Since you have an library card how many books do you borrowed from the library:");
			int booksBorrow=sc.nextInt();
			int rem=3-booksBorrow;
			if(booksBorrow>=3) {
				System.out.println("Borrowing limit reached. You cannot borrow another Book.");
			}
			else {
				System.out.println("since you've borrowed "+booksBorrow+" Books, you can borrow "+ rem+" books");
				System.out.println("Choose a Book Category: \n1-> Fiction\n2->Science\n3->History ");
				System.out.println("Enter your Choice(1-3):");
				int choice=sc.nextInt();
				switch(choice) {
				case 1 -> System.out.println("Borrowing Period for Fiction : 7 days");
				case 2 -> System.out.println("Borrowing Period for Science : 14 days");
				case 3 -> System.out.println("Borrowing Period for History : 21 days");
				default -> System.out.println("Entered a wrong Choice");
				}
			}
		}
		else {
			System.out.println("Library card required to borrow books");
		}
		sc.close();

	}

}
