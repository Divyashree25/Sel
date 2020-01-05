package com.Sel.Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HeadlessHtmlUnit 
{
	@Test
	public void testA() 
	{

		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		Reporter.log("Title is:"+title,true);
		Reporter.log("url is:"+url,true);
		driver.close();
	}
	
	

}
