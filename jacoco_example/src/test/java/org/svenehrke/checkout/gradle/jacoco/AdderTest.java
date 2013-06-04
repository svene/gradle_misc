package org.svenehrke.checkout.gradle.jacoco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdderTest {
	@Test
	public void test_1() throws Exception {
		assertEquals(3, new Adder().add(1, 2));
//		assertEquals(3, new Adder().add(2, 1)); // uncomment to get full coverage
	}
}
