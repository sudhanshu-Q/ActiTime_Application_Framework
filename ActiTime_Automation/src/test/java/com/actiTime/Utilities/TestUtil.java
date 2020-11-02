package com.actiTime.Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.actiTime.test.Baseclass;

public class TestUtil extends Baseclass
{
//	public  WebDriver driver;
//	ReadDataConfiguration read=new ReadDataConfiguration();
	
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
		
//	public void takeScreebshot(String testName)
//	{
////		Baseclass b=new Baseclass();
////		WebDriver driver=b.driver;
//		TakesScreenshot screenshots=(TakesScreenshot)driver;
//		File source=screenshots.getScreenshotAs(OutputType.FILE);
//		try
//		{
//			System.out.println("Taking screenshot for failed Test case");
//			String filePath="D:\\GitLocalRepo\\ActiTime_Automation\\Screenshots\\";
//			new File(filePath);
//			FileUtils.copyFile(source,new File("D:\\GitLocalRepo\\ActiTime_Automation\\Screenshots\\"));
//			
//			
//		} 
//		catch (Exception e) 
//		{
//			System.out.println(e.getMessage());
//		}
//	}
	}
	