package fileutilitytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Test
@Listeners(fileutilitytest.ListenerImplementation.class)
public class ListenerClass 
{
	public void verifyVtigerurl()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		System.out.println(driver.getTitle());
		
		driver.close();
	}
	

}

