package com.vinay.prg1.forEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer; // Consumer is an Interface

public class VinayPrg1 {

	public static void main(String[] args) {
		// Creating Sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++)
			myList.add(i);

		// Traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iterator Value :: " + i);
		}

		System.out.println("***********************************************");

		// Java 8 has introduced forEach method in java.lang.Iterable interface
		// so that while writing code we focus on business logic only. forEach
		// method takes java.util.function.Consumer object as argument, so it
		// helps in having our business logic at a separate location that we can
		// reuse.
		int tempValue = 1;
		// Traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer val) {
				System.out.println("forEach Anonymous Class Value :: " + val
						+ " || " + (val + tempValue));
			}

		});

	}

}
