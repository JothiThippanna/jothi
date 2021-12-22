package fileutilitytest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginusingpropertyfileutility {

	public static void main(String[] args) throws IOException {
		propertyutilityfile ref = new propertyutilityfile();
		String URL = ref.readdata("URL");
		String Username=ref.readdata("userName");
		String Password=ref.readdata("Password");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.id("w3loginbtn")).click();
		driver.findElement(By.xpath("//input[@id = 'modalusername']")).sendKeys("jothi");
		driver.findElement(By.className("_lEWNL")).sendKeys("Password");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		

	}

}
