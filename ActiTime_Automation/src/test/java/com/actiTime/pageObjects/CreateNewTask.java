package com.actiTime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actiTime.Utilities.ReadDataConfiguration;
import com.actiTime.test.Baseclass;


public class CreateNewTask 
{
	ReadDataConfiguration read=new ReadDataConfiguration();
	public WebDriver driver;
	public CreateNewTask(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
//Elements
	@FindBy(xpath="//*[@href='javascript: openAddNewTasksPopup();'][text()='Create new tasks']")
	@CacheLookup
	WebElement createNewTaskLink;

	public void clickCreateNewTaskLink()
	{
		createNewTaskLink.click();
	}
	
}
