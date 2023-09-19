package org.sample;
import org.testng.annotations.Test;

public class Testingssss {
	
	@Test(groups= {"Smoke","Regression"})
	private void test1() {
		System.out.println("test1");
   }
	@Test(groups= {"Smoke","Sanity"})
	private void test2() {
		System.out.println("test2");
   }
	@Test(groups="Smoke")
	private void test3() {
		System.out.println("test3");
   }
	@Test(groups="Smoke")
	private void test4() {
		System.out.println("test4");
   }
	@Test(groups="Sanity")
	private void test5() {
		System.out.println("test5");
   }
	@Test(groups="Sanity")
	private void test6() {
		System.out.println("test6");
   }
	@Test(groups="Regression")
	private void test7() {
		System.out.println("test7");
   }
	@Test(groups="Regression")
	private void test8() {
		System.out.println("test8");
   }
	@Test(groups="Retest")
	private void test9() {
		System.out.println("test9");
   }
	
	
}
