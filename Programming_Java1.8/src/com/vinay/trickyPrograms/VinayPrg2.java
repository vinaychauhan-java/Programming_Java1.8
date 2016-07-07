package com.vinay.trickyPrograms;

public class VinayPrg2 {
	VinayPrg2(String n) {
		name = n;
	}

	String name;

	public static void main(String[] args) {
		VinayPrg2 m1 = new VinayPrg2("guitar");
		VinayPrg2 m2 = new VinayPrg2("tv");
		System.out.println(m2.equals(m1));
	}

	public boolean equals(Object o) {
		VinayPrg2 m = (VinayPrg2) o;
		if (m.name != null)
			return true;
		return false;
	}
}

// What is the result?
// A) The output is "true" and MyStuff fulfills the Object.equals() contract.
// B) The output is "false" and MyStuff fulfills the Object.equals() contract.
// C) The output is "true" and MyStuff does NOT fulfill the Object.equals()
// contract.
// D) The output is "false" and MyStuff does NOT fulfill the Object.equals()
// contract
// E) Compilation fails
//
// Result: C
