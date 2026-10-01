package com.mouli.loops;

public class LowerCaseVowels {

	public static void main(String[] args) {
		System.out.println("To Print Vowels in Lower Case");
		char c='a';
		for(;c>='a' && c<='z';c++) {
			if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u') {
				System.out.println(c);
			}
			
		}

	}

}
