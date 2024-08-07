package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test {
public static void main(String[] args) {
	System.out.println("Test");
//	JDBC - Java Database Connection
	try {
	Class.forName("com.microsoft.sqlserver");
	String connectionString = "jdbc:oracle:thin:@localhost:4200";
		try {
			Connection conn = DriverManager.getConnection(connectionString);
			Statement statement = conn.createStatement();
			ResultSet set = statement.executeQuery("Select * from TableName");
			int int1 = set.getInt("columnName");
			String string = set.getString("StringColumnName");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
