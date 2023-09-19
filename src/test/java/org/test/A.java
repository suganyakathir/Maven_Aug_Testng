package org.test;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	@Test
	private void testA1() {
		System.out.println("Test A1");
   }
	@Test(retryAnalyzer=WithKnownFailed.class)
	private void testA2() {
		Scanner s=new Scanner(System.in);
		Assert.assertTrue(s.nextBoolean());
		System.out.println("Test A2");
	}
	@Test
	private void testA3() {
		System.out.println("Test A3");
	}

}
