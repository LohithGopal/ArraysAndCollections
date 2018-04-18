package com.tech.ninzaz.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CountOccurences {
	
	public static void main(String[] args){
		String inputString = "Java J2EE Java JMS JSP J2EE Java";
		charCountOccurences(inputString);
		
	}
	
	
	public static void charCountOccurences(String inputString){
		
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		String[] strArr = inputString.split(" ");
		
		for (String str : strArr) {
			
			if(countMap.containsKey(str.toLowerCase())){
				countMap.put(str, countMap.get(str)+1);
			}else{
				countMap.put(str, 1);
			}
			
		}
		
		

		  for (Map.Entry m : countMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		  }
		
	}

}
