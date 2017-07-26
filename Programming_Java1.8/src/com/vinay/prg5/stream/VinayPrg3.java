package com.vinay.prg5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class VinayPrg3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 20; i++)
			list.add(i);

		// Parallel Stream
		Stream<Integer> parallelStream = list.parallelStream();
		// Using Lambda with Stream API, filter example
		Stream<Integer> highestNumbersParallel = parallelStream.filter(val -> val > 15);
		highestNumbersParallel.forEach(val -> System.out.println("High Numbers parallelly = " + val));

		// Notice that parallel processing values are not in order, so parallel
		// processing will be very helpful while working with huge collections.

		// Sequential Stream
		Stream<Integer> sequentialStream = list.stream();
		// Using Lambda with Stream API, filter example
		Stream<Integer> highNumsSeq = sequentialStream.filter(isGreaterThan(15));
		highNumsSeq.forEach(val -> System.out.println("High Numbers sequentially = " + val));

	}

	private static Predicate<Integer> isGreaterThan(int number) {
		return val -> val > number;
	}

}
