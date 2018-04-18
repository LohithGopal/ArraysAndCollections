package com.tech.ninzaz.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConverterEx {

	public static void main(String[] args) {
		
		System.out.println("Arrays to Lists");
		String[] names = {"Lohith", "Gopal", "Vigneesh", "Deepak"};
		List<String> l1 = new ArrayList<String>(Arrays.asList(names));
		displayListUsingIterator(l1);
		
		
		System.out.println("Lists to Arrays");
		List<String> l2 = new ArrayList<String>();
		l2.add("Rama");
		l2.add("Shama");
		l2.add("Bhama");
		
		
		Object[] empNames =  l2.toArray();
		for (Object str : empNames) {
			System.out.println(str.toString());
		}
	
	}

	public static void displayListUsingIterator(List<String> l1) {
		Iterator<String> it = l1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

	
}
