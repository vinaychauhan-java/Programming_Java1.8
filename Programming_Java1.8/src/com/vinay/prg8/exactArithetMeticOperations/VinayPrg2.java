package com.vinay.prg8.exactArithetMeticOperations;

public class VinayPrg2 {

	public static void main(String[] args) {

		// Normal add operation will throw bad results
		System.out.println(Integer.MAX_VALUE + Integer.MAX_VALUE);

		// Using addExact will throw
		// java.lang.ArithmeticException: integer overflow
		System.out.println(Math.addExact(Integer.MAX_VALUE, Integer.MAX_VALUE));

	}

}
