package com.tech.ninzaz.stacks;

import java.util.Stack;

public class StacksEx {

	public static void main(String[] args) {
		
		Stack<String> s1 = new Stack<String>();
		s1.push("Plate 1");
		s1.push("Plate 2");
		s1.push("Plate 3");
		
		for (String str : s1) {
			System.out.println(str);
		}
		System.out.println();
		System.out.println("Look at the object without removing: "+ s1.peek());
		System.out.println("Search the Stack: "+ s1.search("Plate 2")); //returns the index
		System.out.println("Take the Top of the stack: " + s1.pop());
		System.out.println("Take the Top of the stack: " + s1.pop());
		System.out.println("Take the Top of the stack: " + s1.pop());
		//System.out.println("Take the Top of the stack: " + s1.pop());
		

		/*
		 * Try writing a Stack of Integer.
		 * Explore on Iterating on the Stack.
		 * */
	}

}
