package crm;

import java.sql.SQLException;

import org.testng.annotations.Test;

import fileutilitytest.DependsON;

public class DependsOnMethods {
	
	DependsON d =new DependsON();
	
	@Test(priority = 1)
	public void connect() throws SQLException 
	{
	 d.dbConnection();
	}
	@Test (dependsOnMethods="connect")
	public void createCustomerTest() throws SQLException 
	{
		d.executeUpdate("CREATE TABLE BET1 (name varchar(4) not null, id int, phoneno int not null, primary key (id) ) ");
	}
	@Test 
    public void modifyCustomerTest() throws SQLException 
    {
    	d.executeUpdate("INSERT INTO BET1 Values('samithra',04,8952642, 'law')");
    }
    @Test (dependsOnMethods="createCustomerTest")
    public void deleteCustomerTest() throws SQLException
    {
    	d.executeUpdate("Drop stu1");
    }
    @Test (dependsOnMethods="deleteCustomerTest")
    public void close() throws SQLException {
		d.closeconnection();
	}

}
