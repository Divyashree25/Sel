package com.Sel.svg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class svgcircle 
{
	@Test
	public void testB() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Users/Divya/Advanced%20Selenium1/Sel/html%20files/svgdemo.html");
		Thread.sleep(2000);
		int count =0;
		List<WebElement> allele = driver.findElements(By.xpath("//*"));
		Reporter.log("All elements on webpage:"+allele.size(),true);
		
		for(WebElement ele:allele)
		{
			String tagname = ele.getTagName();
			if(tagname.equals("circle"))
			{
				count++;
				String c = ele.getCssValue("cx");
				String fo = ele.getCssValue("fill-opacity");
				String color = ele.getCssValue("color");
				Reporter.log("CX value:"+c,true);
				Reporter.log("Fill Opacity"+fo,true);
				Reporter.log("Color:"+color,true);
				Reporter.log("*****************",true);
			}
			
		}
		driver.close();
	
	}

}
