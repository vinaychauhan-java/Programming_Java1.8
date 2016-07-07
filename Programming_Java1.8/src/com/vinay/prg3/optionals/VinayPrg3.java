package com.vinay.prg3.optionals;

import java.util.Optional;
import java.util.function.Supplier;

class MyClass {
	String message = "Good Evening...";

	// String message;

	String getMessage() {
		return message;
	}
}

public class VinayPrg3 {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();

		// System.out.println(myClass.getMessage().toLowerCase());
		// Will Throw java.lang.NullPointerException

		if (myClass.getMessage() != null) {
			System.out.println("Data-Set :: "
					+ myClass.getMessage().toLowerCase());
		}
		System.out.println("***********************************************");

		// We can get rid of all those null checks by utilizing the Java 8
		// Optional type. The method map accepts a lambda expression of type
		// Function and automatically wraps each function result into an
		// Optional. That enables us to pipe multiple map operations in a row.
		// Null checks are automatically handled under the hood.
		System.out.print("Case 1 :: ");
		Optional.of(new MyClass()).map(MyClass::getMessage)
				.ifPresent(System.out::println);

		System.out.print("Case 2 :: ");
		Optional.of(new MyClass()).flatMap(o -> Optional.ofNullable(o.message))
				.ifPresent(System.out::println);

		// An alternative way to achieve the same behavior is by utilizing a
		// supplier function to resolve the nested path:
		System.out.print("Case 3 :: ");
		resolve(() -> myClass.getMessage()).ifPresent(System.out::println);

	}

	public static <T> Optional<T> resolve(Supplier<T> resolver) {
		try {
			T result = resolver.get();
			return Optional.ofNullable(result);
		} catch (NullPointerException e) {
			return Optional.empty();
		}
	}

}
