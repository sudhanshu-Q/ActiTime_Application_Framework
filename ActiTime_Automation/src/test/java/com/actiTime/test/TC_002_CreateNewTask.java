package com.actiTime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actiTime.Utilities.TestUtil;
import com.actiTime.pageObjects.CreateNewTask;
import com.actiTime.pageObjects.LoginPage;

public class TC_002_CreateNewTask extends Baseclass
{
	@Test()
	public void createNewTask() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName();
		lp.setPassword();
		lp.clickSignInBTN();
		System.out.println("Clicking on Create new task link");
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		//Create new customer 
		CreateNewTask createTask=new CreateNewTask(driver);
		createTask.clickCreateNewTaskLink();
		
		//Filling create new customer form
		
	}
}
