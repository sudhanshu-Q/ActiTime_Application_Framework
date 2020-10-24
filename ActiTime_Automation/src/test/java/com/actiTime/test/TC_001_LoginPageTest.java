package com.actiTime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actiTime.Utilities.ReadDataConfiguration;
import com.actiTime.Utilities.TestUtil;
import com.actiTime.pageObjects.LoginPage;

public class TC_001_LoginPageTest extends Baseclass
{
	ReadDataConfiguration readLogin=new ReadDataConfiguration();
	@Test()
	public void loginTest()
	{
		LoginPage initLogin=new LoginPage(driver);

		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		System.out.println("Enter the username");
		initLogin.setUserName();
		System.out.println("Enter the password");
		initLogin.setPassword();
		initLogin.clickSignInBTN();
		System.out.println("User is Logged in");
	}
}
