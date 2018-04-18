package com.tech.ninzaz.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {

		List<Integer> i1 = new ArrayList<Integer>();
		List<Integer> i2 = new LinkedList<Integer>();
		long timeTaken;
		int sizeOfLists = 99999999;
		
		timeTaken = loadList(i1, sizeOfLists);
		System.out.printf("Time Taken by ArrayList to add elements %.3f mili seconds %n", timeTaken/1e6  );
		
		timeTaken = loadList(i2, sizeOfLists);
		System.out.printf("Time Taken by LinkedList to add elements %.3f mili seconds %n", timeTaken / 1e6 );
		
		timeTaken = addFirstElementtoList(i1);
		System.out.printf("Time Taken by ArrayList to add first elements %.3f mili seconds %n", timeTaken / 1e6 );
		
		timeTaken = addFirstElementtoList(i2);
		System.out.printf("Time Taken by LinkedList to add first elements %.3f mili seconds %n", timeTaken / 1e6 );
		
		timeTaken = removeFirstElementFromList(i1);
		System.out.printf("Time Taken by ArrayList to remove first elements %.3f mili seconds %n", timeTaken / 1e6 );
		
		timeTaken = removeFirstElementFromList(i2);
		System.out.printf("Time Taken by LinkedList to remove first elements %.3f mili seconds %n", timeTaken / 1e6 );
		
		i1.clear();
		i2.clear();
		
	}



	public static long loadList(List<Integer> i1, int j) {
		long startTime = System.nanoTime();
		for (int i = 0; i <= j; i++) {
			i1.add(i);
		}
		long endTime = System.nanoTime();
		long timeTaken = endTime-startTime;
		return timeTaken;
	}

	private static long addFirstElementtoList(List<Integer> i1) {
		Long startTime = System.nanoTime();
		i1.add(0, 123);
		Long endTime = System.nanoTime();
		Long timeTaken = endTime-startTime;
		return timeTaken;
		
	}
	
	
	private static long removeFirstElementFromList(List<Integer> i1) {
		Long startTime = System.nanoTime();
		i1.remove(0);
		Long endTime = System.nanoTime();
		Long timeTaken = endTime-startTime;
		return timeTaken;
		
	}
}
