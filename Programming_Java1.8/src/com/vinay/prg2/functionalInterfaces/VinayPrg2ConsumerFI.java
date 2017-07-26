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

/**
 * Some of the useful java 8 functional interfaces are Consumer, Supplier,
 * Function and Predicate.
 */

public class VinayPrg2ConsumerFI {

	public static void main(String[] args) {
		Consumer<String> empName = VinayPrg2ConsumerFI::printNames;
		empName.accept("Vipin Chauhan");
		empName.accept("Vinay Chauhan");
		empName.accept("Ananya Chauhan");

		Consumer<Integer> empSalary = VinayPrg2ConsumerFI::printSalaries;
		empSalary.accept(1000);
		empSalary.accept(2000);
		empSalary.accept(3000);

	}

	private static void printNames(String name) {
		System.out.println("Accepting Name   : " + name);
	}

	private static void printSalaries(Integer salary) {
		System.out.println("Accepting Salary : " + salary);
	}
}

/**
 * =================== Method and Constructor References =======================
 * 
 * A method reference is used to refer to a method without invoking it; a
 * constructor reference is similarly used to refer to a constructor without
 * creating a new instance of the named class or array type. Examples of method
 * and constructor references:
 * 
 * - System::getProperty
 * 
 * - System.out::println
 * 
 * - "abc"::length
 * 
 * - ArrayList::new
 * 
 * - int[]::new
 */