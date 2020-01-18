package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		PriorityQueue < String > queue = new PriorityQueue < String >();
		queue.add("Smith");
		queue.add("Milan");
		queue.add("Shawn");

		System.out.println("head :" + queue.element());
		System.out.println("head :" + queue.peek());

		Iterator iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		queue.remove();
		queue.poll();
		Iterator<String> iterator1=queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());


		}

	}
}
