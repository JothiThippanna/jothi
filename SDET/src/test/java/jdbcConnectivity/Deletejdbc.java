package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Deletejdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Driver d =new Driver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
		Statement stmt = con.createStatement();
		int Result= stmt.executeUpdate("DELETE FROM STU1 WHERE stuid = 02");
		if (Result==1)
		System.out.println("row deleted successfully");
		else
			System.out.println("row not deleted");
		con.close();
	}

}
