package database;

import java.sql.*;

public class Database {

private Connection connection;

private Statement statement;

public Database() throws Exception {

	String user = "mysql";
	
	String password="prac";
	
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	
	connection=DriverManager.getConnection("jdbc:mysql://localhost/EPAW?user="+user+"&password="+password);
	
	statement=connection.createStatement();
	
	}
	
	//execute queries
	
	public ResultSet executeSQL(String query) throws SQLException{
	
		return statement.executeQuery(query);
	
	}
	
	public int insert(String query) throws SQLException{
		
		return statement.executeUpdate(query);
	
	}
	
	//TODO: code for updates for Assignments 2, 3 and 4.
	
	public void disconnectBD() throws SQLException{
	
		statement.close();
		
		connection.close();
	
	}

}
