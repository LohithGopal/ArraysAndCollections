package com.tech.ninzaz.lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.tech.ninzaz.model.Employee;

public class LinkedListEx {

	public static void main(String[] args) {
	
	List<String> l1 = new LinkedList<String>();
		
		l1.add("Lohith");
		l1.add("Gopal");
		l1.add("Lohith");
		l1.add(null);
		l1.add(null);
		
		
		System.out.println("Iterating using For-Each Loop");
		displayListUsingForEach(l1);
		
		System.out.println("Iterating using Iterator");
		displayListUsingIterator(l1);
		
		l1.remove(2);
		System.out.println("After remove at second index");
		displayListUsingIterator(l1);
		
		System.out.println("Objects inside ArrayList");
		//Objects into Lists
		Employee e1 = new Employee(100, "Ramesh");
		Employee e2 = new Employee(200, "Rajesh");
		Employee e3 = new Employee(300, "Venakatesh");
		
		List<Employee> lstEmp = new LinkedList<Employee>();
		lstEmp.add(e1);
		lstEmp.add(e3);
		lstEmp.add(e2);
		
		dspEmpListUsingIterator(lstEmp);
		
		System.out.println("ADDALL Method");
		Employee e4 = new Employee(400, "Parmesh");
		Employee e5 = new Employee(500, "Chandresh");
		
		List<Employee> lstEmp2 = new LinkedList<Employee>();
		lstEmp2.add(e4);
		lstEmp2.add(e5);
		
		lstEmp.addAll(lstEmp2);
		dspEmpListUsingIterator(lstEmp);
		
		System.out.println("REMOVE ALL METHOD");
		
		lstEmp.removeAll(lstEmp2);
		dspEmpListUsingIterator(lstEmp);
		

		
	}

	public static void displayListUsingForEach(List<String> l1) {
		for (String string : l1) {
			System.out.println(string);
		}
	}

	public static void displayListUsingIterator(List<String> l1) {
		Iterator<String> it = l1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	private static void dspEmpListUsingIterator(List<Employee> lstEmp) {
		Iterator<Employee> it = lstEmp.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}

	
}
