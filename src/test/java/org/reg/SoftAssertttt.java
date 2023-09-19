package org.reg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.util.Date;

import org.base.BaseClass;
import org.login.LoginPage;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.asserts.SoftAssert;

public class SoftAssertttt extends BaseClass {
	@BeforeClass
	  private void beforeclass() {
		browserLaunch2("edge");
		urlLaunch("https://www.facebook.com/");
		implicitlyWait(20);
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
	  
	  
	  @Test(priority=-4)
	  private void test1() {
         	 //to verify my url
		  SoftAssert s= new SoftAssert();
		  urlLaunch("https://www.facebook.com/");
    s.assertTrue(getCurrentUrl().contains("facebook"), "verify my url");
	}
	   @Test(enabled=false)
	//  @Test(priority=0)
	  private void test2() {
		  SoftAssert s= new SoftAssert();
	  LoginPage l=new LoginPage();
	sendkeys(l.getTxtUsername(),"suganya.iniya23@gmail.com");
	s.assertEquals(getAttribute(l.getTxtUsername()), "suganya.iniya23@gmail.com");
	sendkeys(l.getTxtPassword(),"12345");
	AssertJUnit.assertEquals(getAttribute(l.getTxtPassword()), "1234");
	click(l.getBtnLogin());
	AssertJUnit.assertTrue(getCurrentUrl().contains("?lara_product=www_first_password"));
	 System.out.println("test2");
	// s.assertAll();
	  
  }
	  @Test
	  private void test3() {
		  SoftAssert s= new SoftAssert();
		  LoginPage l=new LoginPage();
	
		  click(l.getClkCreate());
	        sendkeys(l.getTypeFirstname(),"Suganya");
	        AssertJUnit.assertEquals(getAttribute(l.getTypeFirstname()), "Suganya");
	        sendkeys(l.getTypeLastname(),"kathiravan");
	        sendkeys(l.getTypeEmail(),"9677747233");
	        sendkeys(l.getTypePassword(),"kathi@M20");
	        selectByIndex(l.getSltDay(),4);
	        selectByIndex(l.getSltMonth(),6);
	        selectByValue(l.getSltYear(),"1991");
	        click(l.getClkFemale());
	        click(l.getClkSubmit());
	        s.assertAll();
	
	
	
	
	
	  }	
	
}
