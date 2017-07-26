package com.vinay.prg3.optionals;

import java.util.Optional;

/**
 * 
 * (1) What is Optional trying to solve :- Optional is an attempt to reduce the
 * number of null pointer exceptions in Java systems, by adding the possibility
 * to build more expressive APIs considering that sometimes return values are
 * missing. If Optional was there since the beginning, today most libraries and
 * applications would likely deal better with missing return values, reducing
 * the number of null pointer exceptions and the overall number of bugs in
 * general. By using Optional, user is forced to think about the exceptional
 * case and more readability. It forces you to actively think about the absent
 * case if you want your program to compile at all, since you have to actively
 * unwrap the Optional and address that failure cases.
 * 
 * ============================================================================
 * 
 * (2) What is Optional not trying to solve :- Optional is not meant to be a
 * mechanism to avoid all types of null pointers. e.g. The mandatory input
 * parameters of methods and constructors will still have to be tested.
 * 
 * Like when using null, Optional does not help with conveying the meaning of an
 * absent value. So the caller of the method will still have to check the
 * javadoc of the API for understanding the meaning of the absent Optional, in
 * order to deal with it properly.
 * 
 * Please note that Optional is not meant to be used in these below contexts, as
 * possibly it won’t buy us anything:
 * 
 * (a) in the domain model layer (it’s not serializable), (b) in DTOs (it’s not
 * serializable) (c) in input parameters of methods (c) in constructor
 * parameters
 * 
 */
public class VinayPrg1 {
	static Integer value;

	public static Integer getData() {
		value = new Integer(5);
		return value;
	}

	public static void main(String[] args) {
		System.out.println("Integer Value :: " + getData());

		// Case 1 :: Optional.ofNullable
		// It is used to create an Optional object that may hold a
		// null value. If parameter is null, the resulting Optional object would
		// be empty (remember that value is absent; don’t read it null).
		Optional<Integer> couldBeEmpty1 = Optional.ofNullable(getData());
		// couldBeEmpty1.isPresent() // returns true/false
		if (couldBeEmpty1.isPresent()) {
			// couldBeEmpty1.get() will returns the getData()
			System.out.println("Value :: " + couldBeEmpty1.get());
		}

		// Case 2 :: Optional.empty()
		// It is used to create empty optional
		Optional<Integer> couldBeEmpty2 = Optional.empty();
		System.out.println(couldBeEmpty2.isPresent());

		// Case 3 :: Optional.of()
		// It is used to create optional with default non-null value. If you
		// pass null in of(), then a NullPointerException is thrown immediately.
		Optional<Integer> couldBeEmpty3 = Optional.of(getData());
		System.out.println("Value :: " + couldBeEmpty3.get());
	}
}
