package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testreaddatafrompropertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("./test.properties");
		Properties p = new Properties();
		p.load(fis);
		String browser = p.getProperty("browser");
		String Username = p.getProperty("Username");
		String Password = p.getProperty("Password");
		System.out.println("browser");
		System.out.println("Username");
		System.out.println("Password");
		if(browser.equals("Chrome"))
		{
		System.out.println("Browser is chrome");
		WebDriver driver = new ChromeDriver();
		
		}
		else if (browser.equals("firefox"))
		{
			System.out.println("Browser is firefox");
			WebDriver driver = new FirefoxDriver();
		}
	}

}
