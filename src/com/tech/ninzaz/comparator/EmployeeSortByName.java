package com.tech.ninzaz.comparator;

import java.util.Comparator;

import com.tech.ninzaz.model.Employee;

public class EmployeeSortByName implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {
		
		return emp1.geteName().compareTo(emp2.geteName());
	}

}
