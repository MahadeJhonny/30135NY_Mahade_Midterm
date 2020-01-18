package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		PriorityQueue <String> queue=new PriorityQueue<String>();
		queue.add("Peter");
		queue.add("Bob");
		queue.add("Sam");
		queue.add("Jhon");
		queue.add("Samuel");

		System.out.println("head:"+queue.element());

		System.out.println("head:"+queue.peek());

		System.out.println("iterating the queue elements:");
		Iterator itr=queue.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		queue.remove();

		queue.poll();

		System.out.println("after removing two elements:");

		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}
}







