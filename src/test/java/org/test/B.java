package org.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(WithOutKnownFailed.class)
public class B {
	@Test
	private void testB1() {
		System.out.println("Test B1");

	}
	@Test
	private void testB2() {
		Assert.assertTrue(false);
		System.out.println("Test B2");
	}
	@Test
	private void testB3() {
		System.out.println("Test B3");

	}

}
