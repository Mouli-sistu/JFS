package com.mouli.lambda;

@FunctionalInterface
interface Message{
	void printMessage();
}
public class FunLambda {

	public static void main(String[] args) {
		System.out.println("Main Method satrted");
		
		Message msg= ()-> System.out.println("Hello Java");
		
		msg.printMessage();

	}

}
