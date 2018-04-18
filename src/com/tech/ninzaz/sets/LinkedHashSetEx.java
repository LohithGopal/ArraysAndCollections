package com.tech.ninzaz.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.tech.ninzaz.model.Employee;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		
		Set<String> set1 = new LinkedHashSet<String>();
		
		set1.add("Lohith");
		set1.add("Gopal");
		set1.add("Lohith");
		
		System.out.println("Hash Set Elements - ForEach");
		for (String string : set1) {
			System.out.println(string);
		}
		
		System.out.println("Hash Set Elements - Iterator");
		Iterator<String> it = set1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		System.out.println("Hash Set Elements - Object");
		Employee e1 = new Employee(100, "Lohith");
		Employee e2 = new Employee(200, "Gopal");
		Employee e3 = new Employee(100, "Lohith");
		
		Set<Employee> empSet = new LinkedHashSet<Employee>();
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		
		for (Employee employee : empSet) {
			System.out.println(employee.toString());
		}
		
		

		
		
		
	}

}
