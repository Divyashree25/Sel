package com.Sel.Verifylinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class linkif 
{
	@Test
	public void testA() throws IOException
	{
		URL url = new URL("https://selenium.dev/downloads/");
		HttpURLConnection httpconnection = (HttpURLConnection) url.openConnection();
		httpconnection.setConnectTimeout(2000);
		//to get the connection
		httpconnection.connect();
		
		if(httpconnection.getResponseCode() == 200)
		{
			Reporter.log(httpconnection.getURL()+"URL is working fine and Response code is :"+httpconnection.getResponseCode()+"and message is:"+httpconnection.getResponseMessage(),true);
		}
		else
		{
			Reporter.log(httpconnection.getURL()+"URL is broken and Response code is :"+httpconnection.getResponseCode()+"and message is:"+httpconnection.getResponseMessage(),true);
		}
	}

}
