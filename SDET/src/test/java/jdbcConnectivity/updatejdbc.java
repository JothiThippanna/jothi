package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class updatejdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
		Statement stmt = con.createStatement();
		int result = stmt.executeUpdate("update stu1 set phonenumber = 8541273 where stuid=2");
		con.close();
		
		}

}
