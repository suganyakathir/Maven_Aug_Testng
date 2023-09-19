package org.reg;

import java.util.Date;

import org.base.BaseClass;
import org.login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;



public class FbReg extends BaseClass{
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
	  urlLaunch("https://www.facebook.com/");
	  String url = getCurrentUrl();
	  boolean c = url.contains("facebook");
      Assert.assertTrue(c, "verify my url");
}
  @Test(priority=0)
  private void test2() throws InterruptedException {
	  LoginPage l=new LoginPage();
		sendkeys(l.getTxtUsername(),"suganyaraju1991@gmail.com");
		String user = getAttribute(l.getTxtUsername());
		Assert.assertEquals(user, "suganyaraju1991@gmail.com");
		sendkeys(l.getTxtPassword(),"12345");
		String pass = getAttribute(l.getTxtPassword());
		Assert.assertEquals(pass, "1234");
		click(l.getBtnLogin());
		String curl = getCurrentUrl();
		// boolean ct = curl.contains("facebook");
		 boolean ct = curl.contains("lara_product=www_first_passw");
		Assert.assertTrue(ct, "verify login is valid or invalid");
		System.out.println("test2");
		
	 }	
  
  @Test(dependsOnMethods="test2")
  private void test3() {
	    	LoginPage l=new LoginPage();
	        click(l.getClkCreate());
	        sendkeys(l.getTypeFirstname(),"Suganya");
	        Assert.assertEquals(getAttribute(l.getTypeFirstname()), "Suganya");
	        sendkeys(l.getTypeLastname(),"kathiravan");
	        sendkeys(l.getTypeEmail(),"9677747233");
	        sendkeys(l.getTypePassword(),"kathi@M20");
	        selectByIndex(l.getSltDay(),4);
	        selectByIndex(l.getSltMonth(),6);
	        selectByValue(l.getSltYear(),"1991");
	        click(l.getClkFemale());
	        click(l.getClkSubmit());
	        
		}

}

