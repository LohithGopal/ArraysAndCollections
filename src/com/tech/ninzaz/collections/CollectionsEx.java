package com.tech.ninzaz.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsEx {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		l1.add("Lohith");
		l1.add("Gopal");
		l1.add("Lohith");
		System.out.println("Initial List: " + l1);
		
		Collections.addAll(l1, "Java", "Techie", "Works");
		System.out.println("List l1 post addAll: "+ l1);
		
		
		System.out.println("Make L1 a unmodifiable List");
		List<String> l2= Collections.unmodifiableList(l1);
		
		//l2.add("Some Text");
		System.out.println("After making l2 unmodifiable: "+l2);
		
		System.out.println("Frequency of elements in List: "+ Collections.frequency(l1, "Java"));
		
		System.out.println("Search: "+ Collections.binarySearch(l1, "Java"));
		
		Collections.swap(l1, 2, 3);
		System.out.println("Post Swap: "+ l1);
		
		Collections.sort(l1);
		System.out.println("After Sorting: "+ l1);
		
		Collections.reverse(l1);
		System.out.println("Post reverse: "+ l1);
		
		Collections.replaceAll(l1, "Lohith", "Ramesh");
		System.out.println("After Replace All: "+ l1);
		
		System.out.println("MAX: " + Collections.max(l1) + " MIN: " + Collections.min(l1));
		
		List<String> l3 = new ArrayList<String>();
		l3.add("Lohith");
		l3.add("Java");
		//Disjoint nothing in common
		System.out.println("Check if the Collections are DISJOINT: " +Collections.disjoint(l1, l3));
		
		
		
		List<String> l4 = new ArrayList<String>();
		l4.add("RRRR");
		l4.add("SSSSS");
		
		System.out.println("Check if the Collections are DISJOINT: " +Collections.disjoint(l1, l4));
		
		Collections.fill(l1, "Dummy");
		System.out.println("post Fill: "+ l1);
		
		
	}

}
