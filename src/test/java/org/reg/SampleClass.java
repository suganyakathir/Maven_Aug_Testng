package org.reg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleClass {
@BeforeClass
private void beforeclass() {
	System.out.println("before class");
}

@AfterClass
private void afterclass() {
	System.out.println("after class");
}

@BeforeMethod
private void beforemethod() { 
	System.out.println("beforemethod");
}

@AfterMethod
private void aftermethod() {
	System.out.println("aftermethod");
}

@Test(invocationCount=5)
private void test1() {
	System.out.println("test1");
}

@Test(priority=-1)
private void test2() {
	System.out.println("test2");

}
@Test(enabled=false)
private void test3() {
	System.out.println("test3");

}
}
