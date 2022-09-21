package SQLJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Database_Connectivity
{
@Test
public void script() throws SQLException
{
	String host = "localhost";
	String port = "3306";
	Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/vaanibazaar","root","root");
	Statement s = conn.createStatement();
	ResultSet eq = s.executeQuery("select* from Employees;");
	eq.next();
	System.out.println(eq.getString("empname"));
	System.out.println(eq.getString("salary"));
	
}
}
