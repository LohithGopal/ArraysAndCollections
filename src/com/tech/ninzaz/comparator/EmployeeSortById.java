package com.tech.ninzaz.comparator;

import java.util.Comparator;

import com.tech.ninzaz.model.Employee;

public class EmployeeSortById implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {
		//Sort by ASCending order
		return emp1.geteId() - emp2.geteId();
	}

}
