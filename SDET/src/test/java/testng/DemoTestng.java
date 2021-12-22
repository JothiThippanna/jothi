package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestng {
	
@BeforeTest
		public void connectToDatabase()
		{
			System.out.println("Before Test");
		}
@BeforeClass
        public void launchTheBrowser()
        {
        	System.out.println("Before Class");

	    }
@BeforeMethod
       public void loginToTheApplication()
       {
           System.out.println("Before Method");
       }
@Test
      public void createOrg()
      {
	       System.out.println("navigate to create org");
	       System.out.println("create organization");
	       System.out.println("verify the same with assertion");
      }
@Test
     public void createOrgWithIndustry()
     {
     System.out.println("navigate to create org");
     System.out.println("create organization with Industry");
     System.out.println("verify the same with assertion");
     }

@Test
     public void createOrgWithRating()
     {
     System.out.println("navigate to create org");
     System.out.println("create organization with Rating");
     System.out.println("verify the same with assertion");
     }

@AfterTest
	public void closeToDatabase()
	{
		System.out.println("Before Test");
	}
@AfterClass
    public void closeTheBrowser()
    {
    	System.out.println("Before Class");

    }
@AfterMethod
   public void closeTheApplication()
   {
       System.out.println("Before Method");
   }
      }


