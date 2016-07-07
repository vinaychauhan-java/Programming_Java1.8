package com.vinay.trickyPrograms;

class VinayPrg7_Feline {
	public String type = "f ";

	// public String anotherType = "anotherType ";

	public VinayPrg7_Feline() {
		System.out.print("feline ");
	}
}

public class VinayPrg7_Cougar extends VinayPrg7_Feline {
	public VinayPrg7_Cougar() {
		System.out.print("cougar ");
	}

	public static void main(String[] args) {
		new VinayPrg7_Cougar().go();
	}

	void go() {
		type = "c ";
		System.out.println(this.type + super.type);
		// System.out.println(this.type + super.type + super.anotherType);
	}
}

// What is the result?
// A) cougar c c
// B) cougar c f
// C) feline cougar c c
// D) feline cougar c f
// E) Compilation fails
// F) An exception is thrown at run time.

// Result: C
