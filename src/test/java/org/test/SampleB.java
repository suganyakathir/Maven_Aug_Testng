package org.test;

import org.testng.annotations.Test;

public class SampleB {
	@Test
	private void testB1() {
		System.out.println("TestB1");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void testB2() {
		System.out.println("TestB2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void testB3() {
		System.out.println("TestB3");
		System.out.println(Thread.currentThread().getId());
	}
}
