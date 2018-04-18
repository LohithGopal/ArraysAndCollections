package com.tech.ninzaz.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("Lohith");
		l1.add("Gopal");
		l1.add("Lohith");
		l1.add(null);
		l1.add(null);
		//l1.addAll("Name1", "Name2", "Name3"); //Not Possible we need to do this by the way of collections class

		l1.add(0, "Ramesh"); // add at a perticular index.
		
		
		Iterator<String> it = l1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("Traversing a List using listIterator");
		ListIterator<String> it1 = l1.listIterator(6);
/*		while(it1.hasNext()){
			String str = it1.next();
			System.out.println(str);
		}
*/		System.out.println("Reverse traversing using ListIterator");
		while(it1.hasPrevious()){
			System.out.println(it1.previous());
		}
		
	}

}
