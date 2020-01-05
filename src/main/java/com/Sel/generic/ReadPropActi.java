package com.Sel.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropActi 
{
	
	@Test
	public void testB()
	{
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String url1= ReadPropGeneric.readData("url");
		driver.get(url1);
		try 
		{
			Thread.sleep(5000);
			
			String user = ReadPropGeneric.readData("un");
			driver.findElement(By.id("username")).sendKeys(user);
			Thread.sleep(5000);
			
			String pd = ReadPropGeneric.readData("pw");
			driver.findElement(By.name("pwd")).sendKeys(pd);
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			Thread.sleep(9000);
			
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
		
		
	}
}
