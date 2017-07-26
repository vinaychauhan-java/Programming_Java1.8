package com.vinay.prg2.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Functional Interfaces :: Consumer & Supplier :- These features are functional
 * interfaces (an interface with only one abstract method) which belongs to the
 * java.util.function package.
 * 
 * The supplier does the opposite of the consumer, so it takes no arguments but
 * it returns some value by calling its get() method. Note: This may return
 * different values when it is being called more than once.
 * 
 * -- Source Code --
 * 
 * @FunctionalInterface public interface Supplier { T get(); }
 *
 */

public class VinayPrg3SupplierFI {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();  // Usage of Type Inference
		names.add("Vipin Chauhan");
		names.add("Vinay Chauhan");
		names.add("Ananya Chauhan");

		names.stream().forEach((x) -> {
			printNames(() -> x);
		});

	}

	static void printNames(Supplier<String> arg) {
		System.out.println(arg.get());
	}

}
