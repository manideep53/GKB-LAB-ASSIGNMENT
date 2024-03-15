# README: Setting Up a Dynamic Web Project in Eclipse and Running

This README file provides step-by-step instructions on how to set up a dynamic web project in Eclipse IDE, including adding Apache Tomcat server and MySQL Connector/JAR, as well as JavaServer Pages Standard Tag Library (JSTL) for running the project.

## PREREQUISITES

- Eclipse IDE (Java EE Edition)
- Apache Tomcat Server 9.0 
- MySQL Connector/JAR 8.0.33
- JavaServer Pages Standard Tag Library (JSTL) 1.2

## OPEN ECLIPSE IDE

Launch Eclipse IDE on your system.

## IMPORT PROJECT

1. Go to **File > Import**.
2. Choose **Existing Projects into Workspace** and click "Next".
3. Browse to the project directory.
4. Select the project folder.
5. Click "Finish".

## ADDING APACHE TOMCAT SERVER 9.0

If the Apache Tomcat Server is not configured, follow these steps:

1. Go to **Window > Preferences > Server > Runtime Environments**.
2. Click "Add" and select "Apache Tomcat" from the list.
3. Browse and set the Tomcat installation directory.
4. Click "Finish" to add the server.

## ADDING MYSQL CONNECTOR/JAR 8.0.33

1. Download MySQL Connector/JAR from the MySQL official website.
2. Copy the downloaded JAR file into the **WEB-INF/lib** directory of your project.
3. Right-click on your project in Eclipse, and select **Build Path > Configure Build Path**.
4. In the Libraries tab, click "Add JARs" and select the MySQL Connector/JAR file.
5. Click "Apply and Close" to save the changes.

## ADDING JAVASERVER PAGES STANDARD TAG LIBRARY (JSTL) 1.2

1. Download the JSTL JAR files from the JSTL official website.
2. Copy the JSTL JAR files into the **WEB-INF/lib** directory of your project.
3. Right-click on your project in Eclipse, and select **Build Path > Configure Build Path**.
4. In the Libraries tab, click "Add JARs" and select the JSTL JAR files.
5. Click "Apply and Close" to save the changes.


##SETTING UP THE DATABASE:\

To ensure your dynamic web project functions properly, you need to set up the database. Follow these steps:

Create Database in MySQL:
CREATE DATABASE gkbLab;

Create Table:
CREATE TABLE User (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(255),
    Email VARCHAR(255),
    Age INT,
    DateOfBirth DATE
);

Update Database Connection Details:

In  the project, we have a class named DbConnection under the com.dbConnection package. In this class, make sure to update the database connection details including the database name, username, and password. Replace "your_username" and "your_password" with your MySQL username and password respectively. Also, ensure that the JDBC driver for MySQL is included in your project's dependencies.

## RUNNING THE PROJECT

1. Right-click on your project, select **Run As > Run on Server**.
2. Choose the configured Apache Tomcat server and click "Finish".
3. Eclipse will deploy your web application to Tomcat and open it in the default web browser.
