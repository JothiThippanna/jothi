package fileutilitytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriverUtilities.WebDriverUtilities;

public class OrganistationPOM extends WebDriverUtilities
{
	WebDriver driver;
	public OrganistationPOM(WebDriver d)
	{
		this.driver=d;
		PageFactory.initElements(driver,this);
		
	}
	
@FindBy (xpath ="(//a[text()='Organizations'])[2]/following::img[1]")
private WebElement plus;

public void ClickPlus()
{
	
	plus.click();
	
}
@FindBy (xpath="//input[@name='accountname']")
private WebElement orgname;

public WebElement getOrgName(String text)
{
	orgname.sendKeys(text);
	return orgname;
}

}
