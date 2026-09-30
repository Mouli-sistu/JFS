package com.mouli.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReplaceEvenIndexes {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		List<Integer> al=new ArrayList<>();
		al.add(33);
		al.add(45);
		al.add(46);
		al.add(67);
		al.add(89);
		al.add(12);
		al.add(23);
		al.add(34);
		al.add(54);
		al.add(56);
		al.add(76);
		al.add(19);
		al.add(27);
		
		for(int i=0;i<al.size();i++) {
			if(i%2==0) {
				al.set(i, 0);
			}
		}
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
