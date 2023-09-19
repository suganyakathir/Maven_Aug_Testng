package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailLogin extends BaseClass{
	 public MailLogin() {
		  PageFactory.initElements(driver, this);
	  }
	 @FindBy(xpath="//input[@type='email']")
	 private WebElement txtEmail;
	 @FindBy(xpath="//span[text()='Next']")
	 private WebElement clkNext;
	 @FindBy(xpath="//input[@type='password']")
	 private WebElement txtPassword;
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getClkNext() {
		return clkNext;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	 
}
