package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(id="Email")
	private WebElement email; 
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginBtn; 
	
	public void clickLoginLink() {
		this.loginLink.click();
	}
	
	public void sendEmail(String userName) {
		this.email.clear();
		this.email.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}
