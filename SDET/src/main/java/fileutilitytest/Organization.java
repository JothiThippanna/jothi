package fileutilitytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriverUtilities.WebDriverUtilities;

public class Organization extends WebDriverUtilities
{
	  WebDriver driver;
	public Organization (WebDriver d)
	{
	   this.driver=d;
	   PageFactory.initElements(driver, this);
	}

      @FindBy(xpath=("(//a[text()='Organizations'])[1]"))
      private WebElement OrganizationLink;

}