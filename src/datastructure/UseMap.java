package datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		//Adding elements to HashMap
		hmap.put(11, "Peter");
		hmap.put(2, "Bob");
		hmap.put(33, "Milan");
		hmap.put(9, "Henry");
		hmap.put(3, "Samuel");

		//FOR LOOP
		System.out.println("For Loop:");
		for (Map.Entry me : hmap.entrySet()) {
			System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
		}

		//WHILE LOOP & ITERATOR
		System.out.println("While Loop:");
		Iterator iterator = hmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator.next();
			System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
		}
	}
}










