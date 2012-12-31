package databaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {

	private DatabaseAttributes db;
	private Connection con;
	
	public DbConnection(DatabaseAttributes db_att) {
		db = db_att;		
		init();
	}
	
	private void init(){
		try {
		    // Load the Driver class.
		    Class.forName(db.getDriver());
		    // If you are using any other database then load the right driver here.
		 
		    //Create the connection using the static getConnection method
		    con = DriverManager.getConnection (db.getHost()+db.getDatabase(), db.getUsername(), db.getPassword());
		        
		    System.out.println("connection done...");
		}
		catch (SQLException e) {
		    e.printStackTrace();
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	public boolean excute(String query){
		return true;
	}
	
	public ResultSet excuteQuery (String query){
		return null;
	}
	
}
