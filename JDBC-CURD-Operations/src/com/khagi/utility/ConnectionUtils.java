package com.khagi.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	
	
	public static void main(String[] args) {
		getConnection();
	}

	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:VIS", "system", "system");
			System.out.println("Connection Established Successfully....");
			System.out.println("Testing Commit");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
		}		
		return connection;
		
	}
}
