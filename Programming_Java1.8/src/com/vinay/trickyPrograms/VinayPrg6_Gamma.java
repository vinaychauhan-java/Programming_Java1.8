package com.vinay.trickyPrograms;

class Alpha {
	String getType() {
		return "alpha";
	}
}

class Beta extends Alpha {
	String getType() {
		return "beta";
	}
}

public class VinayPrg6_Gamma extends Beta {
	String getType() {
		return "gamma";
	}

	public static void main(String[] args) {
		// Uncomment the Code for Question Scenario
		// VinayPrg6_Gamma g1 = new Alpha();

		// Uncomment the Code for Question Scenario
		// VinayPrg6_Gamma g2 = new Beta();

		// Uncomment the Code for Question Scenario
		// System.out.println(g1.getType() + " " + g2.getType());
	}
}

// What is the result?
// A) alpha beta
// B) beta beta
// C) gamma gamma
// D) alpha alpha
// E) Compilation fails.
//
// Result : E 