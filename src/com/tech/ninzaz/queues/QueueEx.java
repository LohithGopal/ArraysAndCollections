package com.tech.ninzaz.queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import com.tech.ninzaz.model.TreeEmployee;

public class QueueEx {

	public static void main(String[] args) {
		/*Queue is a Sub type of Collection hence all the methods of lists/sets are also available in queue
		 * Linked list is nothing but a queue.
		 * Queue was introduced in java 1.5 version
		 * */

		Queue<String> queueA = new LinkedList<String>();
		
		queueA.add("Item 0");
		queueA.add("Item 1");
		queueA.add("Item 2");
		queueA.add(null);
		queueA.offer("Item 4");
		
		//We can also implement while on the iterator and foreach for queues.
		
		System.out.println("Head Element 1 " + queueA.peek());
		System.out.println("Head Element 2 " + queueA.element());
		
		System.out.println("Lets remove two elements");
		queueA.remove();
		queueA.poll();
		
		displayQueue(queueA);
		
		System.out.println("\nPRIORITY Queue:");
		//Orders in Natural order and based on comparable/comparator
		Queue<String> queueB = new PriorityQueue<String>();
		queueB.add("Lohith");
		queueB.add("Gopal");
		queueB.add("Deepak");
		queueB.add("Vigneesh");
		
		displayQueue(queueB);
		
		System.out.println("\nPRIORITY Queue: Employee Object: ");
		TreeEmployee e1 = new TreeEmployee(120, "Lohith");
		TreeEmployee e2 = new TreeEmployee(125, "Ramesh");
		TreeEmployee e3 = new TreeEmployee(25, "Rakesh");
		TreeEmployee e4 = new TreeEmployee(104, "Suresh");
		TreeEmployee e5 = new TreeEmployee(50, "Rakesh");
		
		Queue<TreeEmployee> qEmp = new PriorityQueue<TreeEmployee>();
		qEmp.add(e1);
		qEmp.add(e2);
		qEmp.add(e3);
		qEmp.add(e4);
		qEmp.add(e5);
		qEmp.offer(e5); //Offer method
		
		displayQueueForObject(qEmp);
		
		System.out.println("\nPRIORITY Queue: Employee Object:After Removing ");
		qEmp.remove();
		displayQueueForObject(qEmp);
		
	}


	public static void displayQueue(Queue<String> queueB) {
		for (String elements : queueB) {
			System.out.println(elements);
		}
	}

	private static void displayQueueForObject(Queue<TreeEmployee> qEmp) {
		for (TreeEmployee emp : qEmp) {
			System.out.println(emp.toString());
		}
	}

}
