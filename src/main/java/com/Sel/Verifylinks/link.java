package com.Sel.Verifylinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class link 
{
	@Test
	public void testC() throws IOException
	{
		try 
		{
			//Specify url to be tested
			URL url = new URL("https://selenium.dev/downloads/");
			HttpURLConnection httpconnection = (HttpURLConnection) url.openConnection();
			
			//to get the connection
			httpconnection.connect();
			 
			//to get the response code
			int code = httpconnection.getResponseCode();
			
			//to get the response tag
			String msg = httpconnection.getResponseMessage();
			
			URL url1 = httpconnection.getURL();
			
			Reporter.log("Response code:"+code,true);
			Reporter.log("Response message:"+msg,true);
			Reporter.log("URL is:"+url,true);
			
		} 
		catch (MalformedURLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
