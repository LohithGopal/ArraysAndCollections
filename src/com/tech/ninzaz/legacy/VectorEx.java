package com.tech.ninzaz.legacy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * Vector is synchronised
 * 
 * */

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<String>();
		v1.add("Ramesh");
		v1.add("Sathish");
		v1.addElement("Rakesh");
		
		System.out.println("FOR EACH: ");
		for (String str : v1) {
			System.out.println(str);
		}
		
		System.out.println("\nIterator: ");
		Iterator<String> itr = v1.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println(str);
		}
		
		System.out.println("\nEnumeration: ");
		Enumeration<String> enm = v1.elements();
		while (enm.hasMoreElements()) {
			String str = (String) enm.nextElement();
			System.out.println(str);
		}
		
	}

}
