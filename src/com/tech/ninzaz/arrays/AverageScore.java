package com.tech.ninzaz.arrays;


public class AverageScore {
	
	static String[][] student = {{ "Lohith", "40"}, {"Gopal", "20"}, {"Gopal", "50"}};
	static String[] names = new String[student.length];
	static int row=0;

	public static void main(String[] args) {
		
		String studentName = "";
		String studentMarks = "";
		
		for (int i = 0; i < student.length; i++) {
			studentName = student[i][0];
			studentMarks= student[i][1];
			calcAverage(studentName, studentMarks);
		}
	}
	

	private static void calcAverage(String studentName, String studentMarks) {
		String tmpStName = "";
		String tmpStMarks = "";
		int totalMarks=0;
		int count=0;
		
		for (int j = 0; j < names.length; j++) {
			if(names[j] instanceof String && names[j].equals(studentName)){
				return;
			}
		}
		
		for (int i = 0; i < student.length; i++) {
			tmpStName = student[i][0];
			tmpStMarks = student[i][1];
			if(tmpStName == studentName){
				totalMarks +=   Integer.parseInt(tmpStMarks);
				count++;
			}
		}
		int average = totalMarks/count;
		names[row] = studentName;
		row++;
		System.out.println("Student Name: "+ studentName + "  Average: " + average);
	}


			
		
}

	

