package org.sample;

import java.util.Date;

import org.base.BaseClass;
import org.login.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class C extends BaseClass {
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
	
	@Test(dataProvider="login",dataProviderClass=DataProviderrr.class)
	private void test1(String user,String pass) {
		urlLaunch("https://www.facebook.com/");
		LoginPage l=new LoginPage();
		sendkeys(l.getTxtUsername(),user);
		sendkeys(l.getTxtPassword(),pass);
		click(l.getBtnLogin());
		
   }
	
}
