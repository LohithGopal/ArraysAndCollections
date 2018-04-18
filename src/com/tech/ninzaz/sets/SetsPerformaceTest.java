package com.tech.ninzaz.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsPerformaceTest {

	public static void main(String[] args) {
		
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		Set<Integer> set3 = new TreeSet<Integer>();
		long timeTaken;
		int count = 10000;
		
		timeTaken= loadSet(set1, count);
		System.out.printf("Time Taken by Hashset to add elements %.3f mili seconds %n", timeTaken/1e6  );
		timeTaken = loadSet(set2, count);
		System.out.printf("Time Taken by LinkedHashSet to add elements %.3f mili seconds %n", timeTaken/1e6  );
		timeTaken = loadSet(set3, count);
		System.out.printf("Time Taken by TreeSet to add elements %.3f mili seconds %n", timeTaken/1e6  );
		
		
		set1.clear();
		set2.clear();
		set3.clear();
	}

	private static long loadSet(Set<Integer> set1, int count) {
		long start = System.nanoTime();
		for (int i = 0; i <=count; i++) {
			set1.add(i);
		}
		long end = System.nanoTime();
		
		long timeTaken = end-start;
		
		return timeTaken;
		
	}

}
