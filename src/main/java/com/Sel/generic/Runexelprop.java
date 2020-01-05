package com.Sel.generic;

import org.testng.annotations.Test;


public class Runexelprop 
{
	
	@Test
	public void run()
	{
	System.out.println("*****Reading data from Property file*****");	
	ReadPropGeneric.readData("un");
	ReadPropGeneric.readData("pw");
	ReadPropGeneric.readData("url");
	
	System.out.println("*****Reading String data from Excel file*****");
	ReadExcelGeneric.ReadExcel(1, 0);
	ReadExcelGeneric.ReadExcel(1, 1);
	System.out.println("*****Reading Number Num from Excel file*****");
	ReadExcelNum.ReadExcelNum(2, 0);
	System.out.println("********************************");
	}
}
