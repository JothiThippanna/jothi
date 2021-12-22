package genericjavaUtilities;

import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;

public class JavaUtilities {
	@Test
	public int getRandomNumber()
	{
		Random rm = new Random();
		int ran = rm.nextInt(100);
		System.out.println(ran);
		return ran;
	
	}
	
	/**public String getSystemDate()
	{
		Date date = new Date();
		String ref =date.toString();
		return ref;
		
	}**/
	
	public String getSystemDate()
	{
		Date date = new Date();
		String ref =date.toString().replace(" ", "_").replace(":", "_");
		return ref;
		
	}

}
