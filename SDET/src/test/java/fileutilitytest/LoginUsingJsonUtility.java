package fileutilitytest;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingJsonUtility {
	
	public static void main(String[] args) throws IOException, ParseException	{
		Jsonpropertyfile ref = new Jsonpropertyfile();
		String url = ref.readData("URL");
		String un = ref.readData("Username");
		String pwd = ref.readData("Password");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("w3loginbtn")).click();
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.className("_lEWNL")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		
		
	}
}
