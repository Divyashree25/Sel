package com.Sel.Verifylinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verify_Multiple_links 
{
	@Test
	public void testA()
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://selenium.dev/downloads/");
		
		 List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		 Reporter.log("Total links:"+alllinks.size(),true);
		 int count=0,count1=0;
		 for(WebElement link:alllinks)
		 {
			 String href = link.getAttribute("href");
			 Reporter.log("Links:"+href,true);
			 
			 
			try 
			{
				URL url = new URL(href);
				HttpURLConnection httpconnection = (HttpURLConnection) url.openConnection(); 
				httpconnection.setConnectTimeout(2000);
				httpconnection.connect();
				
				if(httpconnection.getResponseCode()==200)
				{
					count++;
					Reporter.log(count+"count"+httpconnection.getURL()+"Url is working fine and resonse code is:"+httpconnection.getResponseCode()+"and message is:"+httpconnection.getResponseMessage(),true);
					Reporter.log("************",true);
				}
				else
				{
					count1++;
					Reporter.log(count1+"count1"+httpconnection.getURL()+"Url is broken and resonse code is:"+httpconnection.getResponseCode()+"and message is:"+httpconnection.getResponseMessage(),true);
					Reporter.log("************",true);
				}
			} 
			catch (MalformedURLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		 }	
		driver.close();
	}

}
