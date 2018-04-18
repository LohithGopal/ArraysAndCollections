package com.tech.ninzaz.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DqueueEx {

	public static void main(String[] args) {
		
		Deque<String> dqueue = new ArrayDeque<String>();
		dqueue.add("Lohith");
		dqueue.offer("Gopal");
		dqueue.offerFirst("Vignesh");
		dqueue.offerLast("Deepak");
		
		for (String str : dqueue) {
			System.out.println(str);
		}
		
		System.out.println("\nAfter Removal");
		dqueue.pollFirst(); //poll() and pollFirst() are same
		dqueue.pollLast();
		
		for (String str : dqueue) {
			System.out.println(str);
		}
		
	}

}
