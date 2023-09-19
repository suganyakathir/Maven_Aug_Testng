package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusLogin extends BaseClass {
	public RedBusLogin() {
		  PageFactory.initElements(driver, this);
	  }
	@FindBy(xpath="//span[text()='Account']")
	private WebElement clkAccount;
	public WebElement getClkAccount() {
		return clkAccount;
		}
	@FindBy(xpath="//span[text()='Login/ Sign Up']")
	private WebElement clkLogin;
	public WebElement getClkLogin() {
		return clkLogin;
	}
	@FindBy(xpath="//input[@type='number']")
	private WebElement clkMobile;
	public WebElement getClkMobile() {
		return clkMobile;
	}
	@FindBy(xpath="(//div[@class='recaptcha-checkbox-border'])[8]")
	private WebElement clkRobot;
	public WebElement getClkRobot() {
		return clkRobot;
	}
	@FindBy(id="recaptcha-verify-button")
	private WebElement clkVerify;
	public WebElement getClkVerify() {
		return clkVerify;
	}
	@FindBy(id="otp-container")
	private WebElement clkOtp;
	public WebElement getClkOtp() {
		return clkOtp;
	}
	
}
