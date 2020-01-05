package com.Sel.Headless;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessPhantomjs 
{
	static
	{
		WebDriverManager.phantomjs().setup();
	}
	@Test
	public void testA()
	{
		
	}

}
