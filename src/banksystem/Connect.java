package banksystem;

import java.sql.*;

public class Connect {
	
	Connection c;
	Statement s;
	
	public Connect() {
		try {
		//	Class.forName(com.mysql.cj.jdbc.Driver);
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "ideapad330");
			s = c.createStatement();
			if(c != null)
				System.out.println("connection succesfull");
			else
				System.out.println("unable o connect");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
