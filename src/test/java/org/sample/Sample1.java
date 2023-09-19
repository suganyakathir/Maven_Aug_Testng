package org.sample;

import java.util.Date;

import org.base.BaseClass;
import org.login.LoginPage;
import org.login.MailLogin;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample1 extends BaseClass{
	@Parameters({"browsername"})
	@BeforeClass
	private void beforeclass(String u) {
		browserLaunch2(u);
		if(u.equals("chrome")) {
		 chromeBrowser(u);
			}
		else
		{
		edgeBrowser(u);
		}
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
			sendkeys(l.getTxtPassword(),"kathi@M20");
			String pass = getAttribute(l.getTxtPassword());
			Assert.assertEquals(pass, "kathi@M20");
			click(l.getBtnLogin());
}
}