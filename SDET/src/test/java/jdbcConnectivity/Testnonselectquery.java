package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Testnonselectquery {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Driver de =new Driver();
		DriverManager.registerDriver(de);
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
		Statement stmt = con.createStatement();
		int Result = stmt.executeUpdate("UPDATE stu1 SET phonenumber=564789412, stuname ='jothithippanna' WHERE stuid = 1");
		con.close();
		
		}

}
