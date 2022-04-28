package com.SampleProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="uid")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement btnLogout;
	
	
	public void setUsername(String uname){
		
		txtUsername.sendKeys(uname);
	}
	
	public void setPassword(String pwd){
		txtPassword.sendKeys(pwd);
		
	}
	
	public void clickSubmit(){
		
		btnLogin.click();
		
	}
	public void clickLogout(){
		
		btnLogout.click();
	}

}
