package com.actiTime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.actiTime.Utilities.ReadDataConfiguration;
import com.actiTime.Utilities.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass

{
	// WebDriver driver;
	ReadDataConfiguration readconfig=new ReadDataConfiguration();
	public WebDriver driver;
	//@Parameters("browser")

	@BeforeClass
	//Accessing different browser
	//public void setUp(String br)
	public void setUp()
	{
		//		if (br.equals("Chrome"))
		//		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("get url");
		System.out.println(readconfig.getUrl());
		driver.get(readconfig.getUrl());
		System.out.println(readconfig.getUrl());
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		//		}
		//		else if(br.equals("Firefox"))
		//		{
		//		WebDriverManager.firefoxdriver().setup();
		//		WebDriver driver=new FirefoxDriver();
		//		System.out.println("get url");
		//		System.out.println(readconfig.getUrl());
		//		driver.get(readconfig.getUrl());
		//		System.out.println(readconfig.getUrl());
		//		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		//		}
	}
	@AfterClass
	public void shutDown()
	{
		//driver.quit();
	}
}

