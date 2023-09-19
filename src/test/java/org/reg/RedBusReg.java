package org.reg;

import java.util.Date;

import org.base.BaseClass;
import org.login.LoginPage;
import org.login.RedBusLogin;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedBusReg extends BaseClass {
	@BeforeClass
	private void beforeClass() {
	browserLaunch2("edge");
	urlLaunch("https://www.redbus.in/");
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
	 //to verify my url
		  urlLaunch("https://www.redbus.in/");
		  String url = getCurrentUrl();
		  boolean c = url.contains("redbus");
	      Assert.assertTrue(c, "verify my url");
	}
	  @Test
	  private void test2() throws InterruptedException {
		  RedBusLogin l=new RedBusLogin();
		  click(l.getClkAccount());
		  
		 click(l.getClkLogin());
		  
		  click(l.getClkMobile());
		  Thread.sleep(5000);
		  sendkeys(l.getClkMobile(),"9677747233");
		   Assert.assertEquals(getAttribute(l.getClkMobile()), "9677747233");
		  click(l.getClkRobot());
		  
	}
	  

}
