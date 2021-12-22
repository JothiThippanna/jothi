package crm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class crmscenario1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
        driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();		
        driver.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::img[1]")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("TS");
		Select SC = new Select(driver.findElement(By.xpath("//select[@name='industry']")));
		SC.selectByVisibleText("Education");
		WebElement WB =driver.findElement(By.xpath("//input[@name='assigntype'][2]"));
		WB.click();
		driver.findElement(By.name("button")).click();
		Thread.sleep(15000);
		driver.close();
	}	
		
	}

