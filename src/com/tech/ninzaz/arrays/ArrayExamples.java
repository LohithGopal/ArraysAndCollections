package com.tech.ninzaz.arrays;

import com.tech.ninzaz.model.Employee;

public class ArrayExamples {

	public static void main(String[] args) {

		//int intArr[], int []intArr, int intArr[]
		int[] intArr = new int[5];
		intArr[0] = 100;
		intArr[1] = 200;
		intArr[2] = 300;
		intArr[3] = 400;
		intArr[4] = 500;
		
		displayIntArrayUsingFor(intArr);
		displayArrayUsingForEach(intArr);
		
		int[] intArray2 = new int[5];
		displayArrayUsingForEach(intArray2);
		
		boolean[] boolArray = {true, false, true, false, false};
		displayArrayUsingForEach(boolArray);
		
		//Default value null and demonstrate NPE
		Employee[] employees = new Employee[5];
		Employee e1 = new Employee(100, "Lohith");
		Employee e2 = new Employee(200, "Gopal");
		Employee e3 = new Employee(300, "Rajesh");
		
		employees[0] = e1;
		employees[2] = e2;
		employees[4] = e3;
		
		displayArrayUsingForEach(employees);
		
		String[] strs = new String[5];
		displayArrayUsingForEach(strs);
		String[] str1={"Lohith", "Gopal", "Rajesh", "Vijay", "Ramesh"};
		displayArrayUsingForEach(str1);
	}

	
	public static void displayIntArrayUsingFor(int[] intArr) {
		System.out.println("Iterating using for loop method");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]+ " ");
		}
	}

	public static void displayArrayUsingForEach(int[] intArr) {
		System.out.println("\nIterating using For-Each loop method - Int");	
		for(int a :intArr){
			System.out.print(a + " ");
		}
	}
	
	public static void displayArrayUsingForEach(boolean[] boolArr){
		System.out.println("\nIterating using For-Each loop method - Boolean");	
		for(boolean a :boolArr){
			System.out.print(a + " ");
		}
	}
	
	private static void displayArrayUsingForEach(Employee[] employees) {
		System.out.println("\nIterating using For-Each loop method - Employee");	
		for(Employee e :employees){
			//if(e instanceof Employee){
			System.out.print(e.toString());
			//}else{
			//	System.out.println(e);
			//}
		}
		
	}

	private static void displayArrayUsingForEach(String[] strs) {
		System.out.println("\nIterating using For-Each loop method - String");	
		for(String str :strs){
			System.out.print(str + " ");
		}
	}

	
}
