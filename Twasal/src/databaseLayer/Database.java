package databaseLayer;


public class Database implements Database_Interface {

	private DbConnection con;
	
	public Database() {
		DatabaseAttributes att = new DatabaseAttributes("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/", "twasal", "twasal", "admin");
		con = new DbConnection (att);
	}
	
	@Override
	public boolean checkWord(String word) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getTranslation(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Parameters prams) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String word) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Parameters prams) {
		// TODO Auto-generated method stub
		return false;
	}

}
