package fileutilitytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriverUtilities.WebDriverUtilities;

public class HomePage extends WebDriverUtilities
{
  WebDriver driver;
public HomePage (WebDriver d)
{
   this.driver=d;
   PageFactory.initElements(driver, this);
}

@FindBy(xpath=("(//a[text()='Organizations'])[1]"))
private WebElement OrganizationLink;

@FindBy(xpath=("//a[text()='Calendar']"))
private WebElement CalendarLink;

@FindBy (xpath=("//a[text()='Leads']"))
private WebElement LeadsLink;

@FindBy (xpath=("//a[text()='Contacts']"))
private WebElement ContactLink;

@FindBy (xpath=("//a[text()='Opportunities']"))
private WebElement OpportunitiesLink;

@FindBy (xpath=("//a[text()='Products']"))
private WebElement ProductsLink;

@FindBy (xpath=("//a[text()='Documents']"))
private WebElement DocumentsLink;

@FindBy (xpath=("//a[text()='Email']"))
private WebElement EmailLink;

@FindBy (xpath=("//a[text()='Trouble Tickets']"))
private WebElement TroubleTicketsLink;

@FindBy (xpath=("//a[text()='Dashboard']"))
private WebElement DashboardLink;

public WebElement getOrganizationLink()
{
	OrganizationLink.click();
	return OrganizationLink;
}

public void clikOnOrganizations(WebElement org)
{
	org.click();
}

}