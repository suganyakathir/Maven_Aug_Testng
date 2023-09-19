package org.sample;

import org.base.BaseClass;
import org.login.FlipLogin;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipChrome extends BaseClass {
	@BeforeClass
	  private void beforeclass() {
		 
		browserLaunch2("chrome");
		urlLaunch("https://www.flipkart.com/account/login\r\n" + 
				"");
		implicitlyWait(20);
	}
	@Test
	private void test1() {
		FlipLogin l=new FlipLogin();
		sendkeys(l.getClkLogin(), "suganya.iniya23@gmail.com");
      click(l.getClkOtp());
	}

}
