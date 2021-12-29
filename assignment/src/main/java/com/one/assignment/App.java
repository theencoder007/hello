package com.one.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;



public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
		Statement stmt = con.createStatement();
		
				String sql = "select UPPER(first_name),UPPER(last_name) from worker_table";
				
				
				stmt.execute(sql);
				ResultSet rs = stmt.executeQuery(sql);
				
				
				while(rs.next())
				{
					System.out.println(" Full Name : "+rs.getString(1) +" " +rs.getString(2));
				}

				con.close();

    }
}
