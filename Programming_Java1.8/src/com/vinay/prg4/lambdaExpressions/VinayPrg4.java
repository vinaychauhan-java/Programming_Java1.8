package com.vinay.prg4.lambdaExpressions;

import java.util.Arrays;
import java.util.Iterator;

public class VinayPrg4 {

	public static void main(String[] args) {
		Iterable<String> fruitNames = Arrays.asList("Mango", "Apple", "Orange", "PineApple");
		for (String fruitName : fruitNames) {
			System.out.print(fruitName + " ");
		}

		System.out.println("\n============== Usage of Lamda Expression =======================");
		fruitNames.forEach(value -> System.out.print(value + " "));

		System.out.println("\n============== Usage of Method References =====================");
		fruitNames.forEach(System.out::println);

		System.out.println("\n============== Combining Iterator with Lamda ======================");
		Iterator<String> fruitIterator = fruitNames.iterator();
		while (fruitIterator.hasNext()) {
			String next = fruitIterator.next();
			if (next.startsWith("Apple"))
				break;
		}
		fruitIterator.forEachRemaining(System.out::println);

	}
}
