package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	 public LoginPage() {
		  PageFactory.initElements(driver, this);
	  }
	  
	  @FindBy(id="email")
	  private WebElement txtUsername;
	  
	  @FindBy(id="pass")
	  private WebElement txtPassword;
	  
	  @FindBy(name="login")
	  private WebElement btnLogin;
	  
	  @FindBy(xpath="//a[text()='Create new account']")
	  private WebElement clkCreate;
	  @FindBy(name="firstname")
	  private WebElement typeFirstname;
	  @FindBy(name="lastname")
	  private WebElement typeLastname;
	  @FindBy(name="reg_email__")
	  private WebElement typeEmail;
	  @FindBy(name="reg_passwd__")
	  private WebElement typePassword;
	  @FindBy(name="birthday_day")
	  private WebElement sltDay;
	  @FindBy(name="birthday_month")
	  private WebElement sltMonth;
	  @FindBy(name="birthday_year")
	  private WebElement sltYear;
	  @FindBy(xpath="(//input[@type='radio'])[1]")
	  private WebElement clkFemale;
	  @FindBy(xpath="//button[text()='Sign Up']")
	  private WebElement clkSubmit;

	public WebElement getClkCreate() {
		return clkCreate;
	}

	public WebElement getTypeFirstname() {
		return typeFirstname;
	}

	public WebElement getTypeLastname() {
		return typeLastname;
	}

	public WebElement getTypeEmail() {
		return typeEmail;
	}

	public WebElement getTypePassword() {
		return typePassword;
	}

	public WebElement getSltDay() {
		return sltDay;
	}

	public WebElement getSltMonth() {
		return sltMonth;
	}

	public WebElement getSltYear() {
		return sltYear;
	}

	public WebElement getClkFemale() {
		return clkFemale;
	}

	public WebElement getClkSubmit() {
		return clkSubmit;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	  
}
