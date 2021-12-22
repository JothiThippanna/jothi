package fileutilitytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Webut {
    
    public void launchDriver(WebDriver driver)
    {
       driver.get("http://localhost:8888/index.php?action=index&module=Home");
    }
    public void login(WebDriver driver)
    {
    	driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
    }
    public void createOrg(WebDriver driver)
    {
        driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();		
        driver.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::img[1]")).click();
    }
    
    public void signOut(WebDriver driver)
    {
    	WebElement we = driver.findElement(By.xpath("//span[@class='userName']/following::img[1]"));
    	Actions act = new Actions(driver);
    	act.moveToElement(we).click().build().perform();
    	driver.findElement(By.xpath("//a[text()='Sign Out']"));
    }
   
    public void closeBrowser(WebDriver driver)
    {
    	driver.close();
    }

}
