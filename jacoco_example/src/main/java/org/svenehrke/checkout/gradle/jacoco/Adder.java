package org.svenehrke.checkout.gradle.jacoco;

public class Adder {
	public int add(int a1, int a2) {
		if (a1 > a2) { // just to checkout jacoco
			return a1 + a2;
		}
		else {
			return a2 + a1;
		}
	}
}
