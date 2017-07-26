package com.vinay.prg5.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class VinayPrg1 {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("Apple", "Orange", "Banana", "Apple", "Mango");

		// Get collection count without duplicate
		System.out.println("Total Distinct Elements : " + list.stream().distinct().count());

		// Get collection without duplicate
		List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());
		System.out.println("  " + distinctElements);

		// Get sorted collection without duplicate
		List<String> sortedElements = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("  " + sortedElements);
	}
}
