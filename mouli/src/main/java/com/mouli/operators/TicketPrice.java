package com.mouli.operators;

import java.util.Scanner;

public class TicketPrice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Movie Ticket Booking");
		System.out.println("Enter the Movie Name:");
		String movie=sc.next();
		System.out.println(movie+" Movie Tickets");
		System.out.println("Enter the Movie Category( G , V , P):");
		char cat=sc.next().charAt(0);
        String rupee = "\u20B9";
		
		if(cat == 'G' || cat == 'g') {
			System.out.println("Price for the Gold Ticket:"+rupee+"150");
		}
		else if(cat == 'P' || cat == 'p') {
			System.out.println("Price for the Premium Ticket:"+rupee+"250");
		}
		else if(cat == 'V' || cat == 'v') {
			System.out.println("Price for the VIP Ticket:"+rupee+"400");
		}
		else {
			System.out.println("Invalid Category");
		}
		sc.close();
	}

}
