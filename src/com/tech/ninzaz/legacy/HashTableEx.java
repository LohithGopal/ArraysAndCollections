package com.tech.ninzaz.legacy;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/*
 * 
 * Hashtable no nulls for both key and value, synchronised
 * contains only unique elements.
 * 
 * 
 * */
public class HashTableEx {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new Hashtable<Integer, String>();
		
		hm.put(100, "Lohith");
		hm.put(200, "Gopal");
		//hm.put(null, null);
		
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+ " : " + entry.getValue());
		}
		
		Enumeration e = ((Hashtable<Integer,String>) hm).elements();
	     
		   System.out.println("Enumeration values:");
		     
		    while (e.hasMoreElements()) {
		   System.out.println(e.nextElement());
		   }
		
	}
}
