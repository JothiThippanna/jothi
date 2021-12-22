package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Selectjdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Driver d =new Driver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery("Select * from stu1");
		while (set.next())
		{
		System.out.println(set.getString(1));
		}
		con.close();

	}

}
