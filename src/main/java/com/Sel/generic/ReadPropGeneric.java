package com.Sel.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropGeneric 
{
	public static String readData(String key)
	{
		File f = new File("./TestData/input.properties");
		try 
		{
			FileInputStream fis = new FileInputStream(f);
			Properties p = new Properties();
			p.load(fis); 
			String value = p.getProperty(key);
			System.out.println(value);
			return value;
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return " ";
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return " ";
		}
		
	}

}
