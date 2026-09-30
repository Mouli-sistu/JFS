package com.mouli.collections.Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Anagram  using Map");
		String[] words={"eat","tea","tan","ate","nat","bat"};
		
		
		Map<String,ArrayList<String>> map=new HashMap<>();
		
		
		for(String word:words ) {
			char[] chars=word.toCharArray();
			
			Arrays.sort(chars);			
			String key=new String(chars);
			
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(word);
			
		}
		System.out.println(map.values());
		

	}

}
