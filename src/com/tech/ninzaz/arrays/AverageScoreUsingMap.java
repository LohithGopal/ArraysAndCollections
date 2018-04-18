package com.tech.ninzaz.arrays;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AverageScoreUsingMap {

	public static void main(String[] args) {
		String[][] students = {{ "Lohith", "40"}, 
								{"Gopal", "20"}, 
								{"Gopal", "50"}, 
								{"Gopal", "50"}, 
								{"Gopal", "50"}};
		String studentName;
		int studentScore;
		Map<String, Integer> mSum = new HashMap<String, Integer>();
		Map<String, Integer> mCount = new HashMap<String, Integer>();
		
		for (int i = 0; i < students.length; i++) {
			studentName = students[i][0];
			studentScore = Integer.parseInt(students[i][1]);
			
			if(mSum.containsKey(studentName)){
				mSum.put(studentName, mSum.get(studentName) + studentScore );
				mCount.put(studentName, mCount.get(studentName) + 1 );
			}else{
				mSum.put(studentName, studentScore);
				mCount.put(studentName, 1);
			}
		}
		
		calcAverage(mSum, mCount);
		
		

	}

	private static void calcAverage(Map<String, Integer> mSum, Map<String, Integer> mCount) {
		
		for (Entry<String, Integer> e : mSum.entrySet()) {
			
		System.out.println("Student Name: "+ e.getKey() + " Average: " + 	
						e.getValue()/mCount.get(e.getKey()));
		}
		
	}

}
