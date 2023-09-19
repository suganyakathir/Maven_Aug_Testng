package org.reg;

import java.util.Date;

import org.base.BaseClass;
import org.login.demoQaLogin;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoReg extends BaseClass {
	@BeforeClass
	private void beforeClass() {
	browserLaunch2("edge");
	urlLaunch("https://www.toolsqa.com/selenium-training/");
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
		  urlLaunch("https://www.toolsqa.com/selenium-training/");
		  String url = getCurrentUrl();
		  boolean c = url.contains("selenium-training/");
	      Assert.assertTrue(c, "verify my url");
	}
	  @Test
	  private void test2() throws InterruptedException {
		  demoQaLogin l=new demoQaLogin();
		  click(l.getClkReg());
		  sendkeys(l.getTxtFirstname(),"Suganya");
		  Assert.assertEquals(getAttribute(l.getTxtFirstname()), "Suganya");
		  sendkeys(l.getTxtLastname(),"Kathiravan");
		  Assert.assertEquals(getAttribute(l.getTxtLastname()), "Kathiravan");
		  sendkeys(l.getTxtEmail(),"suganya.iniya237@gmail.com");
		  Assert.assertEquals(getAttribute(l.getTxtEmail()), "suganya.iniya23@gmail.com");
		  sendkeys(l.getTxtMobile(),"9677747233");
		  Assert.assertEquals(getAttribute(l.getTxtMobile()), "9677747233");
		  selectByValue(l.getSltCountry(),"4");
		  sendkeys(l.getTxtCity(),"Madurai");
		  Assert.assertEquals(getAttribute(l.getTxtCity()), "Madurai");
		  sendkeys(l.getTxtMsg(),"SeleniumTraining");
		  click(l.getTxtCode());
		  Thread.sleep(5000);
		  click(l.getClkSend());
		  
	  }

}
