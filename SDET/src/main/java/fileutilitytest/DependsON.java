package fileutilitytest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DependsON {
		
		Connection con;

		public void dbConnection() throws SQLException 
		{
			Driver d = new Driver();
			DriverManager.registerDriver(d);
			con=DriverManager.getConnection(paths.DBpath,paths.DBname,paths.DBpassword);
			System.out.println("Database connected successfully");
		}

		public void createcustomertest(String Query) throws SQLException
		{
			 int result = con.createStatement().executeUpdate(Query);
		      if(result>=1)
		      {
		    	  System.out.println("row affected");
		      }
		     
		}
		
	public void modifyCustomerTest(String Query) throws SQLException
	{
		int result = con.createStatement().executeUpdate(Query);
		 if(result==0)
	      {
	    	  System.out.println("updated successfully");
	      }
	
	}
	
	public void deleteCustomerTest(String Query) throws SQLException
	{
		int result = con.createStatement().executeUpdate(Query);
		System.out.println("deleted successfully");
	}
	
		public void executeQuery(String Query,String expectedres,int columnIndex ) throws SQLException
		{
			ResultSet result = con.createStatement().executeQuery(Query);

			boolean flag = false;

			while(result.next()) {

				String actualres = result.getString(columnIndex);
				if(expectedres.equalsIgnoreCase(actualres)) {
					flag=true;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println("query executed");
			}
			
			else{

				System.out.println("query not executed");
			}


		}
		
		public void executeUpdate(String Query) throws SQLException
		{
	      int result = con.createStatement().executeUpdate(Query);
	      if(result>=1)
	      {
	    	  System.out.println("row affected");
	      }
	      if(result==0)
	      {
	    	  System.out.println("updated successfully");
	      }
	      
		}

		public void closeconnection() throws SQLException
		{
			con.close();
			System.out.println("Database connection closed successfully");

		}

	}
