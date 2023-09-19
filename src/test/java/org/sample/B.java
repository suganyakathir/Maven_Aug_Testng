package org.sample;

import java.util.Date;

import org.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class B extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		browserLaunch2("edge");
		urlLaunch("https://www.facebook.com/");
		implicitlyWait(10);
		}
		 @AfterClass
		  private void afterclass() {
			quit();
		}
		  @BeforeMethod
		  private void beforemethod() {
			Date d=new Date();
			System.out.println("start time "+d);
		}
		  
		  @AfterMethod
		  private void aftermethod() {
			Date d=new Date();
			System.out.println("end time "+d);
		} 
	
	@Test
	private void test1() {
		Assert.assertTrue(false);
		System.out.println("test1");
   }
	@Test(dataProvider="login")
	private void test2(String user,String pass) {
	  System.out.println(user);
	  System.out.println(pass);
	  
	}
	@DataProvider(name="login")
	private Object[][] datas(){
	 Object [][] obj=new Object[][] {
		 {"Dinesh","888"},
		 {"Green","1111"},
		 {"Raj","3333"}
	 };
	return obj; 
	 }
	
}
