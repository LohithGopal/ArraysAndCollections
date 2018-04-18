package com.tech.ninzaz.maps;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
	
	 public static void main(String args[]){  
	
	  System.out.println("First MAP ------");
	  Map<Integer,String> map=new HashMap<Integer,String>();  
	  map.put(100,"Lohith");  
	  map.put(101,"Gopal");  
	  map.put(102,"Lohith");  
	 
	  for(Map.Entry m: map.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	  
	  System.out.println("Second MAP ------");
	  Map<Integer, String> map2 = new HashMap<Integer, String>();
	  map2.put(null, "Lohith");
	  map2.put(null, "Gopal");
	  
	  map2.put(1, null);
	  map2.put(2, null);
	  map2.put(3, null);
	  
	  for (Map.Entry m : map2.entrySet()) {
		System.out.println(m.getKey() + " " + m.getValue());
	  }
	  
	  System.out.println(map2.keySet());
	  System.out.println(map2.values());
	  
	  System.out.println("Second Map Display using keySet");
	  
	  for (Integer i : map2.keySet()) {
		System.out.println(i+ " " +map2.get(i));
	  }
	  
	  System.out.println("Second Map remove");
	  
	  map2.remove(2);
	  for (Integer i : map2.keySet()) {
			System.out.println(i+ " " +map2.get(i));
	  }
	  
	}
	 
}