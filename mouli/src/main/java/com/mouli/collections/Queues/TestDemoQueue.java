package com.mouli.collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class TestDemoQueue {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Queue<Integer> q=new LinkedList<>();
		q.offer(1);
		q.offer(2);
		q.offer(4);
		q.offer(5);
		q.offer(3);
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.poll());
		System.out.println(q);
	}

}
