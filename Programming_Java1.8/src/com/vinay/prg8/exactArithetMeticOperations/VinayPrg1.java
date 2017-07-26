package com.vinay.prg8.exactArithetMeticOperations;

/**
 * The Math class provides these new methods which throws
 * "java.lang.ArithmeticException" exception every-time the result of operation
 * overflows to max limit. All methods
 * {add|substract|multiply|increment|decrement|negate} takes arguments as either
 * int or long primitives.
 * 
 * e.g. Consider multiplication of 100000 * 100000. Normally done, it will give
 * you a wrong return “silently” and in application runtime it’s your
 * responsibility to check every time the max limit to avoid wrong calculations.
 * 
 * In java 8, multiPlyExact method will do the job for you and will throw the
 * exception if result overflow the max limit.
 * 
 */
public class VinayPrg1 {

	public static void main(String[] args) {

		// Normal multiplication which cause invalid results
		System.out.println(100000 * 100000);

		// Using multiPlyExact which will throw
		// java.lang.ArithmeticException: integer overflow
		System.out.println(Math.multiplyExact(100000, 100000));

	}

}
