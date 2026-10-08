package com.mouli.lambda;
@FunctionalInterface
interface Calculator{
	void add(int a,int b);
}
public class CalLambda {
	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Calculator c=(a,b) -> System.out.println("sum:"+(a+b));
		c.add(15, 30);

	}

}
