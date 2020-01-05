package com.Sel.svg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SVGlink 
{
	@Test
	public void testA() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		int count=0;
		driver.get("file:///E:/Users/Divya/Advanced%20Selenium1/Sel/html%20files/SVG.html");
		List<WebElement> allele = driver.findElements(By.xpath("//*"));
		Reporter.log("All elements present on webpage"+allele.size(),true);
		Actions act = new Actions(driver);
		for(WebElement ele:allele)
		{
			String tagname = ele.getTagName();
			if(tagname.equals("line"))
			{
				String bcolor = ele.getCssValue("color");
				Reporter.log("Before Mouse Hoverover the Color is :"+bcolor,true);
				Thread.sleep(2000);
				act.moveToElement(ele).perform();
				Thread.sleep(2000);
				
				WebElement tootTip = ele.findElement(By.xpath("./following-sibling::*[1]/*[2]"));
				//WebElement tootTip = driver.findElement(By.xpath("./following-sibling::*[1]/*[2]"));
				String text = tootTip.getText();
				Reporter.log("Tool Tip Text is :"+text,true);
				
				
				String acolor = ele.getCssValue("stroke");
				Reporter.log("After Mouse Hoverover the Color is :"+acolor,true);
				Reporter.log("--------------------------------------------------------",true);
			}
		}
		Reporter.log("No of Lines are :"+count,true);
		driver.close();
	}

}
