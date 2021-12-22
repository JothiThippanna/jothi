package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Insertjdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Driver d =new Driver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
		Statement stmt = con.createStatement();
		int Result= stmt.executeUpdate("INSERT INTO STU1 Values('raju',02,123456789, 'computer')");
		if (Result==1)
		System.out.println("table created successfully");
		else
			System.out.println("table not created");
		con.close();
	}

}
