package com.tech.ninzaz.sets;

import java.util.Set;
import java.util.TreeSet;

import com.tech.ninzaz.model.TreeEmployee;

/*Lohith Gopal
 * 
 * Demonstrate how Comparable needs to be implemented.
 * */

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeEmployee e1 = new TreeEmployee(1, "Lohith");
		TreeEmployee e2 = new TreeEmployee(2, "Gopal");
		TreeEmployee e3 = new TreeEmployee(3, "Vigneesh");
		
		Set<TreeEmployee> empSet = new TreeSet<TreeEmployee>();
		empSet.add(e1);
		empSet.add(e3);
		empSet.add(e2);
		
		for (TreeEmployee emp : empSet) {
			System.out.println(emp.toString());
		}
		
	}

}
