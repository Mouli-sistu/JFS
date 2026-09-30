package com.mouli.collections.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyByMap {

	public static void main(String[] args) {
		System.out.println("Count the frequency of each character using Map");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		
		char[] ch=str.toCharArray();
		Map<Character,Integer> mp=new HashMap<>();
		for(char c:ch) {
			if(mp.containsKey(c)) {
				mp.put(c, mp.get(c)+1);
			}
			else{
				mp.put(c, 1);
			}
		}
		for(Map.Entry<Character,Integer> entry:mp.entrySet()) {
			System.out.println(entry.getKey()+ ": "+ entry.getValue());
		}
		System.out.println(mp);
		
		
		sc.close();
	}

}
