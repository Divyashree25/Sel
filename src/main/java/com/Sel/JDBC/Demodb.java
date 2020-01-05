package com.Sel.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demodb 
{
	@Test
	public void testA() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/sel";
		String un = "j2ee";
		String pw = "root";
		
		//connect to db
		Connection con = DriverManager.getConnection(url, un, pw);
		
		//To send the querry to db(path)
		Statement stmt = con.createStatement();
		
		//Send the query to db to get the record
		ResultSet res = stmt.executeQuery("select * from EmpInfo where Name='Divya';");
		
		while(res.next())
		{
			String name = res.getString("Name");
			Reporter.log("Name is:"+name,true);

			String id = res.getString("Id");
			Reporter.log("Id is:"+id,true);
			
			String dept = res.getString("Dept");
			Reporter.log("Dept is:"+dept,true);
			
			String g = res.getString("Gender");
			Reporter.log("Gender is:"+g,true);
			
			String name1 = res.getString(1);
			Reporter.log("name1 is:"+name1,true);
		
		
		}
		con.close();
	}
	

	}
