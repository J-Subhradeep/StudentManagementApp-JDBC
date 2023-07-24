package com.student.manage;
import java.sql.*;

public class CP {
	static Connection con;
	public static Connection createC() {
		// load the driver
		try {
			
			Class.forName("org.postgresql.Driver");
			String user = "postgres";
			String password  = "admin";
			con = DriverManager
		            .getConnection("jdbc:postgresql://localhost:5432/students",
		            user, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
