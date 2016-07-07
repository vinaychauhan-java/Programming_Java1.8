package com.vinay.trickyPrograms;

import java.util.ArrayList;
import java.util.List;

public class VinayPrg3 {
	public static void main(String[] args) {
		List<Integer> p = new ArrayList<Integer>();
		p.add(7);
		p.add(2);
		p.add(5);
		p.add(2);
		// p.sort(); // Uncomment it for the question scenario.
		System.out.println(p);
	}
}

// What is the result?
// A) [2, 5, 7]
// B) [2, 2, 5, 7]
// C) [7, 2, 5, 2]
// D) [7, 5, 2, 2]
// E) Compilation fails
//
// Result: E 