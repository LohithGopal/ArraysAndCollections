package com.tech.ninzaz.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//Run time polymorphism
public class RTPEx {

	public static void main(String[] args) {

		List<String> l1 = new LinkedList<String>();
		l1.add("Lohith");
		l1.add("Gopal");

		List<String> l2 = new ArrayList<String>();
		l2.add("Deepak");
		l2.add("Vigneesh");

		displayUsingIterator(l1);
		displayUsingIterator(l2);

	}

	public static void displayUsingIterator(List<String> l1) {
		Iterator<String> it = l1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
