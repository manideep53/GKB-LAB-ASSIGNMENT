<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.gskLab.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>AllUsers</title>

<style>
body {
	background-color: aliceblue;
}

table {
	width: 100%;
	border-collapse: collapse;
}

h1 {
	text-align: center;
	font-size: 50px;
}

h2 {
	text-align: center;
	font-size: 30px;
}

th, td {
	padding: 8px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

th {
	background-color: #f2f2f2;
}

tr:hover {
	background-color: #f5f5f5;
}

.exit-btn {
	display: block;
	margin: 20px auto;
	padding: 10px 20px;
	text-decoration: none;
	color: #fff;
	background-color: #007bff;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	transition: background-color 0.3s ease;
	width: 150px;
	text-align: center;
}

.exit-btn:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>

	<%
	UserCrud userCrud = new UserCrud();
	List<User> userList = userCrud.retrieveAllData();
	request.setAttribute("userList", userList);
	%>

	<main>
		<section>
			<h1>-------*GKB LABS*--------</h1>
			<h2>List of Users</h2>
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Age</th>
						<th>Date of Birth</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="user" items="${userList}">
						<tr>
							<td>${user.id}</td>
							<td>${user.name}</td>
							<td>${user.email}</td>
							<td>${user.age}</td>
							<td>${user.dateOfBirth}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</section>
	</main>

	<a href="welcome.html" class="exit-btn">Exit</a>

</body>
</html>

