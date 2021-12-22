package dataDrivenTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream Fis = new FileInputStream("./commondata.properties.txt");
		Properties P = new Properties();
		P.load(Fis);
		String URL = P.getProperty("URL");
		String browser=P.getProperty("browser");
		String Username=P.getProperty("UserName");
		String Password=P.getProperty("Password");
		System.out.println(URL);
		System.out.println(browser);
		System.out.println(Username);
		System.out.println(Password);
		WebDriver driver= null;
		if (browser.equals("Chrome"))
		{
			System.out.println("browser is chrome");
		    driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.out.println("browser is Firefox");
			 driver= new FirefoxDriver();
		}
		driver.get(URL);
	}

}
