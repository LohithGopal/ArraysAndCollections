package com.tech.ninzaz.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsEx {

	public static void main(String[] args) {
		
		List<String> l2 = new ArrayList<String>();
		l2.add("Rama");
		l2.add("Shama");
		l2.add("Bhama");
		
		System.out.println("Before Sorting: " + l2);
		Collections.sort(l2);
		System.out.println("After Sorting: " + l2);
	}

}
