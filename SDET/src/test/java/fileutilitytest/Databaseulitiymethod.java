package fileutilitytest;

import java.sql.SQLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Databaseulitiymethod {
	Databaseutility ref = new Databaseutility();

	@BeforeTest
	public void connect() throws SQLException {
		ref.dbConnection();
	}

	@Test
	public void execute() throws SQLException {
		ref.executeQuery("select * from stu1", "raju", 1);
	}
    @Test
	public void executeUpdate() throws SQLException
	{
		ref.executeUpdate("insert into stu1 values('shanu',3,4587965,'COM')");
	}
	@AfterTest
	public void close() throws SQLException {
		ref.closeconnection();
	}

}
