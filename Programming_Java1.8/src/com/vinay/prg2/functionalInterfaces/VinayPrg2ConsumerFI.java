package com.vinay.prg2.functionalInterfaces;

import java.util.function.Consumer;

/**
 * Functional Interfaces :: Consumer & Supplier :- These features are functional
 * interfaces (an interface with only one abstract method) which belongs to the
 * java.util.function package.
 * 
 * The Consumer (Functional Interface) accepts a single argument by calling its
 * accept (args) method and does not return any value making it a void method.
 * 
 * -- Source Code --
 * 
 * @FunctionalInterface public interface Consumer { void accept(T t); }
 *
 */
public class VinayPrg2ConsumerFI {

	public static void main(String[] args) {
		Consumer<String> consumer = VinayPrg2ConsumerFI::printNames;

		consumer.accept("Vipin Chauhan");
		consumer.accept("Vinay Chauhan");
		consumer.accept("Ananya Chauhan");

	}

	private static void printNames(String name) {
		System.out.println(name);
	}
}
