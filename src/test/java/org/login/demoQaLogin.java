package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoQaLogin extends BaseClass{
	public demoQaLogin() {
		  PageFactory.initElements(driver, this);
	  }
	@FindBy(xpath="//a[text()='Go To Registration ']")
	private WebElement clkReg;
	@FindBy(id="first-name")
	private WebElement txtFirstname;
	@FindBy(id="last-name")
	private WebElement txtLastname;
	@FindBy(id="email")
	private WebElement txtEmail;
	@FindBy(id="mobile")
	private WebElement txtMobile;
	@FindBy(id="country")
	private WebElement sltCountry;
	@FindBy(id="city")
	private WebElement txtCity;
	@FindBy(id="message")
	private WebElement txtMsg;
	@FindBy(id="code")
	private WebElement txtCode;
	@FindBy(xpath="//button[text()='Send']")
	private WebElement clkSend;
	public WebElement getClkReg() {
		return clkReg;
	}
	public WebElement getTxtFirstname() {
		return txtFirstname;
	}
	public WebElement getTxtLastname() {
		return txtLastname;
	}
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtMobile() {
		return txtMobile;
	}
	public WebElement getSltCountry() {
		return sltCountry;
	}
	public WebElement getTxtCity() {
		return txtCity;
	}
	public WebElement getTxtMsg() {
		return txtMsg;
	}
	public WebElement getTxtCode() {
		return txtCode;
	}
	public WebElement getClkSend() {
		return clkSend;
	}
	
	
}
