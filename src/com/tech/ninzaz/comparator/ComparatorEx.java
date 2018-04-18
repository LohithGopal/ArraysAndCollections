package com.tech.ninzaz.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tech.ninzaz.model.Employee;

public class ComparatorEx {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(100, "Ramesh");
		Employee e2 = new Employee(200, "Gopal");
		Employee e3 = new Employee(300, "Venakatesh");
		
		List<Employee> lstEmp = new ArrayList<Employee>();
		lstEmp.add(e1);
		lstEmp.add(e3);
		lstEmp.add(e2);
		System.out.println("Display before sort: ");
		for (int i = 0; i < lstEmp.size(); i++) {
			System.out.println(lstEmp.get(i));
		}
		
		System.out.println("\nDisplay: After List is sorted using EmployeeSortById ");
		Collections.sort(lstEmp, new EmployeeSortById());

		for (int i = 0; i < lstEmp.size(); i++) {
			System.out.println(lstEmp.get(i));
		}
		
		System.out.println("\nDisplay: After List is sorted using EmployeeSortById ");
		Collections.sort(lstEmp, new EmployeeSortByName());

		for (int i = 0; i < lstEmp.size(); i++) {
			System.out.println(lstEmp.get(i));
		}

		
		
	}

}
