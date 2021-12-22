package crm;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {
	@Test (dataProvider ="bookTicketDataProvider")
	public void ticketBooking(String Src, String Dest)
	{
		System.out.println("Ticket booking confirmed from" +Src+ " to " +Dest);
		System.out.println("Have a safe journey");
	}
	
	@DataProvider Object[][] bookTicketDataProvider()
	{
		Object[][] obj = new Object[5][2];
		obj[0][0] ="Chennai";
		obj[0][1]="Banglore";
		
		obj[1][0] ="Chennai";
		obj[1][1]="Mysore";
		
		obj[2][0] ="Chennai";
		obj[2][1]="pune";
		
		obj[3][0] ="Chennai";
		obj[3][1]="Mumbai";
		
		obj[4][0] ="Chennai";
		obj[4][1]="Delhi";
		
		return obj;
		
	}

}
