package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipLogin extends BaseClass{
	public FlipLogin() {
		  PageFactory.initElements(driver, this);
	  }
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement clkLogin;
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement clkOtp;
	public WebElement getClkLogin() {
		return clkLogin;
	}
	public WebElement getClkOtp() {
		return clkOtp;
	}
	
}
