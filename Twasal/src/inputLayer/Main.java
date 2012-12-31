
package inputLayer;

import java.sql.*;

public class Main {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		String connectionURL = "jdbc:mysql://localhost:3306/twasal";
		// Change the connection string according to your db, ip, username and password
		Connection con = null;
		try {
		 
		    // Load the Driver class.
		    Class.forName("com.mysql.jdbc.Driver");
		    // If you are using any other database then load the right driver here.
		 
		    //Create the connection using the static getConnection method
		    con = DriverManager.getConnection (connectionURL, "twasal", "admin");
		 
		    //Create a Statement class to execute the SQL statement
		    Statement stmt = con.createStatement();
		 
		    //Execute the SQL statement and get the results in a Resultset
		    stmt.executeQuery("show tables;");
		 
		    // Iterate through the ResultSet, displaying two values
		    // for each row using the getString method
		 
//		    while (rs.next())
		        System.out.println("connection done...");
		}
		catch (SQLException e) {
		    e.printStackTrace();
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
		    // Close the connection
		    con.close();
		}
	}
}
