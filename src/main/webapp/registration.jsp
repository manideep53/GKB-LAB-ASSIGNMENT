<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.gskLab.*, java.util.*, java.text.SimpleDateFormat"%>
<%@ page import="java.text.ParseException"%>


<%
UserCrud userCrud = new UserCrud();

User user = new User();
user.setName(request.getParameter("name"));
user.setEmail(request.getParameter("email"));
user.setAge(Integer.parseInt(request.getParameter("age")));

SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

Date dateOfBirth = null;
try {
	dateOfBirth = sdf.parse(request.getParameter("dateOfBirth"));
} catch (ParseException e) {
	e.printStackTrace();
}

user.setDateOfBirth(dateOfBirth);

int rowsAffected = userCrud.insertData(user);

if (rowsAffected > 0) {
	response.sendRedirect("newUser.html");
} else {

	out.println("Failed to register user. Please try again.");
}
%>
