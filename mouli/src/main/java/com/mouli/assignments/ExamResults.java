package com.mouli.assignments;

import java.util.Scanner;

public class ExamResults {

	public static void main(String[] args) {
		System.out.println("Welcome to ABC School");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students:");
		int n=sc.nextInt();
		int[] marks=new int[n];
		int pass=0,fail=0;
		int high,low;
		int sum=0;
		System.out.println("Enter the marks of "+n+" students");
		
		for(int i=0;i<n;i++) {
			System.out.println("Student "+(i+1)+": ");
			marks[i]=sc.nextInt();
		}
		
		high=marks[0];
		low=marks[0];
		
		for(int i=0;i<n;i++) {
			if(marks[i]>=35) {
				pass++;
			}
			else {
				fail++;
			}
			
			if(marks[i]>high) {
				high=marks[i];
			}
			
			if(marks[i]<low) {
				low=marks[i];
			}
			
			sum+=marks[i];
		}
		double average=(double) sum/n;
		
		System.out.println("Results of "+n+" Students:");
		System.out.println("Number of Passed Students:"+pass);
		System.out.println("Number of Failed Students:"+fail);
		System.out.println("Highest Marks:"+high);
		System.out.println("Lowest Marks:"+low);
		System.out.println("Average Marks of the class:"+average);
		
		sc.close();
	}

}
