package com.tech.ninzaz.arrays;

public class MultiDimesionalEx {

	public static void main(String[] args) {
		
		int[][] multiInt = {{10, 20, 30},
							{40, 50, 60}};
		
		for (int i = 0; i < multiInt.length; i++) {
			for (int j = 0; j < multiInt[i].length; j++) {
				System.out.print(multiInt[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
