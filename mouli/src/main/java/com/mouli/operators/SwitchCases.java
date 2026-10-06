package com.mouli.operators;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		System.out.println("Main method statred");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Category:");
		
		String catg=sc.next();
		switch(catg) {
		case "veg" -> {
			System.out.println("Enter vegetable item:");
			String item=sc.next();
			switch(item) {
			case "tomato" -> System.out.println("Tamato and the price is 50 for 2kg");
			case "potato" -> System.out.println("Potato and the price is 30 for 1kg");
			case "carrot" -> System.out.println("Carrot and the price is 60 for 1kg");
			case "mirchi" -> System.out.println("Mirchi and the price is 40 for 1kg");
			default -> System.out.println("Entered item is out of stock");
			}
		}
		case "fruit" ->{
			System.out.println("Enter fruit item:");
			String fru=sc.next();
			switch(fru) {
			case "apple" -> System.out.println("Apple and the price is 300 for 2kg");
			case "orange" -> System.out.println("Orange and the price is 100 for 1kg");
			case "grape" -> System.out.println("Grape and the price is 100 for 1kg");
			case "banana" -> System.out.println("Banana and the price is 120 for 1kg");
			}
		}
		}
		sc.close();
	}

}
