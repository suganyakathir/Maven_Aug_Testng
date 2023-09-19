package org.reg;

import java.util.Date;

import org.base.BaseClass;
import org.login.MailLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MailReg extends BaseClass{
	@BeforeClass
	private void beforeClass() {
//		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
	//  WebDriver driver=new ChromeDriver();
		browserLaunch2("edge");
	urlLaunch("https://mail.google.com/");
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
		  urlLaunch("https://mail.google.com/");
		  String url = getCurrentUrl();
		  boolean c = url.contains("google");
	      Assert.assertTrue(c, "verify my url");
	}
	  
	  @Test
	  private void test2() throws InterruptedException {
		MailLogin l=new MailLogin();
		sendkeys(l.getTxtEmail(),"suganya.iniya23@gmail.com");
		Assert.assertEquals(getAttribute(l.getTxtEmail()), "suganya.iniya23@gmail.com");
	    l.getClkNext().click();
		//click(l.getClkNext());
	    sendkeys(l.getTxtPassword(),"9500839952");
		Assert.assertEquals(getAttribute(l.getTxtPassword()), "9500839952");
		click(l.getClkNext());
		Assert.assertTrue(getCurrentUrl().contains("AGEVcSTWtAIlQ-GtItt98GVXd99"), "verify login is valid or not");
	}
}
