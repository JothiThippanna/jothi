package fileutilitytest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import genericjavaUtilities.JavaUtilities;
import webDriverUtilities.WebDriverUtilities;

public class Baseclass 
{
	public static WebDriver d;
	public WebDriver driver;	
	public WebDriverUtilities wu = new WebDriverUtilities();
	public JavaUtilities jw =new JavaUtilities();
	propertyutilityfile pfile = new propertyutilityfile();
	
	
	@Parameters("browser")
	@BeforeClass
	public void launchTheBrowser(String browser) throws IOException
	{
		HomePage hp = new HomePage(driver);
		System.out.println("launch the browser");
		driver = new ChromeDriver();
		//
		if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			 driver = new ChromeDriver();
		}
		d=driver;
		driver.manage().window().maximize();
		driver.get(pfile.readdata("URL"));
		
	
	}
	
	@BeforeMethod
	public void createLogin() throws Exception
	{
		Login in = new Login(driver);
		String un=pfile.readdata("username");
		String pwd=pfile.readdata("Password");
		in.login(un, pwd);
		
	}	
	
	@AfterMethod
	public void logout()
	{
		SignOut so = new SignOut(driver);
		so.Adminstration();
		so.logout();
	}
	
	@AfterClass
	public void closeBrowser()
	{
      driver.close();
	}
}
	
