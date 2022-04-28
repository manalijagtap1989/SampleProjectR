package com.SampleProject.TestCases;

import org.testng.annotations.Test;

import com.SampleProject.Pages.BaseClass;
import com.SampleProject.Pages.LoginPage;

public class LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException{
		
		logger.info("URL is open");
		LoginPage lp= new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Username is entered");
		lp.setPassword(password);
		lp.clickSubmit();
		driver.switchTo().alert().accept();
		logger.info("Login is successful");
		
		
	}
	
	

}
