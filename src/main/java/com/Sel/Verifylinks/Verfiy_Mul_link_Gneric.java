package com.Sel.Verifylinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Verfiy_Mul_link_Gneric 
{
	public static void checkLinks(String turl)
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(turl);
		int count=0;
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		 Reporter.log("Total links:"+alllinks.size(),true);
		 for(WebElement link:alllinks)
		 {
			
			 count++;			 
			 String href = link.getAttribute("href");
			 Reporter.log("count:"+count+"Links:"+href,true);
		 }
		 driver.close();
		 
	}

}
