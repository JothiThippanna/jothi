package dataDrivenTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxLaunchTest 
{
	@Test
	public void fireFoxLaunch()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
	}
    }


    