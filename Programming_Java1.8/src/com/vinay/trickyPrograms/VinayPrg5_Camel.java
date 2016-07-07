package com.vinay.trickyPrograms;

interface Rideable {
	String getGait();
}

public class VinayPrg5_Camel implements Rideable {
	int weight = 2;

	public static void main(String[] args) {
		new VinayPrg5_Camel().go(8);
	}

	void go(int speed) {
		++speed;
		weight++;
		int walkrate = speed * weight;
		System.out.print(walkrate + getGait());
	}

	// Remove the public from method signature for the question scenario.
	public String getGait() {
		return " mph, lope";
	}
}

// What is the result?
// A) 16 mph, lope
// B) 18 mph, lope
// C) 24 mph, lope
// D) 27 mph, lope
// E) Compilation fails.
// F) An exception is thrown at run time.
//
// Result : E
