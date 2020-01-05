package com.Sel.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

//@Test
public class ReadExcelNum 
{
	public static void ReadExcelNum(int rn, int cn)
	{
		File f = new File("./TestData/input.xlsx");
		try 
		{
				FileInputStream fis = new FileInputStream(f);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sh = wb.getSheet("Sheet1");
				Row rc = sh.getRow(rn);
				Cell cc = rc.getCell(cn);

				DataFormatter d = new DataFormatter();
				String num = d.formatCellValue(cc);
				
				System.out.println(num);
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (EncryptedDocumentException e) 
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
}

