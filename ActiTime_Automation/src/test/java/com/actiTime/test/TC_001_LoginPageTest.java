package com.actiTime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
		String TitlePrelogin=driver.getTitle();
		System.out.println(TitlePrelogin);
		SoftAssert titleVerify=new SoftAssert();
		titleVerify.assertEquals(TitlePrelogin,"actiTIME - Login");
		System.out.println("Enter the username please");
		initLogin.setUserName();
		System.out.println("Enter password");
		initLogin.setPassword();
		initLogin.clickSignInBTN();
		System.out.println("User is Logged in state");
		titleVerify.assertAll();
		System.out.println("Login test completed !");
	}
}
