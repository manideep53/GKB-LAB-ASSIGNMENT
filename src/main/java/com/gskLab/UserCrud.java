package com.gskLab;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbConnection.DbConnection;

public class UserCrud {

	private static final String INSERT_DATA = "INSERT INTO user (name, email, age, dateOfBirth) VALUES (?, ?, ?, ?)";
	private static final String SELECT_ALL = "SELECT * FROM user";

	private Connection con;

	public UserCrud() throws SQLException {
		con = DbConnection.getConnection();
	}

	public List<User> retrieveAllData() throws SQLException {
		List<User> users = new ArrayList<User>();

		PreparedStatement st = con.prepareStatement(SELECT_ALL);
		st.clearParameters();

		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			int age = rs.getInt("age");
			Date dateOfBirth = rs.getDate("dateOfBirth");

			users.add(new User(id, name, email, age, dateOfBirth));
		}

		rs.close();
		st.close();
		DbConnection.closeConnection(); 

		return users;
	}

	public int insertData(User user) throws SQLException {
		PreparedStatement st = con.prepareStatement(INSERT_DATA);
		st.clearParameters();

		st.setString(1, user.getName());
		st.setString(2, user.getEmail());
		st.setInt(3, user.getAge());

		st.setDate(4, new java.sql.Date(user.getDateOfBirth().getTime())); 

		int insert = st.executeUpdate();

		st.close();
		DbConnection.closeConnection(); 

		return insert;
	}
}
