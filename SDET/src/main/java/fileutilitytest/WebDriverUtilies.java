package fileutilitytest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilies {
	
	/**
	 * This method wait until the page get loads
	 * @param driver
	 */
	
	public void pageUntilLoads(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}
	
	/**
	 *This method waits until the element is visible.
	 * @param driver
	 * @param element
	 */
	 
	public void waitForElementVisibility(WebDriver driver, WebElement element)
	{
	WebDriverWait wait = new WebDriverWait(driver,60);
	}
	
	/**
	 * This method wait until the page get loads
	 * @param driver
	 * @param value
	 */
	
	public void waitUntilPageLoad(WebDriver driver, int value)
	{
	driver.manage().timeouts().pageLoadTimeout(value,TimeUnit.SECONDS);
	}
	
	/**
	 * This method is used to take screenshot and save
	 * @param driver
	 * @param Filename
	 * @throws IOException 
	 */
	
	public void takeScreenshot(WebDriver driver, String fileLocation, String fileExtension) throws IOException
	{
	
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File(fileLocation + System.currentTimeMillis() + fileExtension));
		
	}

	/**
	 * This method perform double click 
	 * @param driver
	 * @param ele
	 */
	
    public void doubleClick(WebDriver driver, WebElement ele)
    {
	   Actions act = new Actions(driver);
	   act.doubleClick(ele).perform();
	   
    }
    
    /**
     * This method perform mouse hover
     * @param driver
     * @param ele
     */
    
    public void mouseHover(WebDriver driver, WebElement ele)
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(ele).perform();
    }
    
   /**
    * This method will select the drop down text value
    * @param ele
    * @param text
    */
    
    public void selectDropDownUsingVisibleText(WebElement ele, String text)
    {
    	Select SelRef =new Select(ele);
    	SelRef.selectByVisibleText(text);
    }
    
    /**
     * This method will select the drop down values by index
     * @param ele
     * @param index
     */
    
    public void selectDropDownUsingIndex(WebElement ele, int index)
    {
        Select Sel = new Select(ele);
        Sel.selectByIndex(index);
    }
    
    /**
     * This method will select the drop down values 
     * @param ele
     * @param value
     */
    
    public void selectDropDownUsingValue(WebElement ele, String value)
    {
    	Select s = new Select(ele);
    	s.selectByValue(value);
    }
    
    /**
     * This method will accept the alert pop up
     * @param driver
     */
    
    public void acceptAlert(WebDriver driver)
    {
    	Alert alert = driver.switchTo().alert();
    	alert.accept();	
    }
    
    /**
     * This method will cancel the alert pop up
     * @param driver
     */
    
    public void cancelAlert(WebDriver driver)
    {
    	Alert alert =driver.switchTo().alert();
    	alert.dismiss();
    }
    
    /**
     * This method will perform right click
     * @param driver
     */
    
    public void rightClick(WebDriver driver)
    {
    	Actions act = new Actions(driver);
    	act.contextClick();
    }
    
    /**
     * This method will Scroll the web element
     * @param driver
     * @param text
     * @param ele
     */
    
    public void scrollWebElement(WebDriver driver,String text, WebElement ele)
    {
     	JavascriptExecutor js = (JavascriptExecutor)driver;
     	js.executeScript(text,ele);
     	
    }

 }