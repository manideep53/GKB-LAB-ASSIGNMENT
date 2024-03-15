package com.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private static Connection con = null;

	public static Connection getConnection() throws SQLException {
		if (con != null && !con.isClosed()) {
			return con;
		} else {
			try {
				String driver = "com.mysql.cj.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/gkbLab";
				String user = "root";
				String password = "Manideep@123";
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);

			} catch (ClassNotFoundException cnfe) {
				System.out.println(cnfe);
			} catch (SQLException sqe) {
				System.out.println(sqe);
			}
		}
		return con;
	}

	public static void closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println( e.getMessage());
			}
		}
	}
}
