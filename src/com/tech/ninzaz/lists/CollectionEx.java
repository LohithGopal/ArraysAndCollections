package com.tech.ninzaz.lists;

import java.util.ArrayList;
import java.util.List;

import com.tech.ninzaz.model.Employee;

public class CollectionEx {

	public static void main(String[] args) {
		
		/*Arrays are type safe by default
		 * Collections are not type safe by default we need to implement generics to provide type safe
		 * */
		Employee e1 = new Employee(100, "Kumar");
		
		List l1 = new ArrayList();
		l1.add("Lohith");
		l1.add(50);
		l1.add(e1);
		
		for (Object object : l1) {
			if (object instanceof String) {
				String new_name = (String) object;
				System.out.println(new_name);
			}else if (object instanceof Integer){
				Integer ints = (Integer) object;
				System.out.println(ints);
			}else if(object instanceof Employee ){
				Employee e2 = (Employee) object;
				System.out.println(e2.toString());
			}else{
				System.out.println("Un handled Data type");
			}
		}
		
		List<String> l2 = new ArrayList<String>();
		l2.add("Lohith");
		l2.add("Gopal");
		//l2.add(20);
		for (String string : l2) {
			System.out.println(string);
		}
		
		
		
	}
}
