package fileutilitytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
public class SignOut extends WebDriverUtilies
{
	WebDriver driver;
	
	public SignOut(WebDriver driver)
    {
		this.driver=driver;
		PageFactory.initElements(driver, this);
    }
@FindBy(xpath="//span[@class='userName']/following::img[1]")
private WebElement mousehover;

public WebElement sOut() {
	return mousehover;
}
public void Adminstration()
{
	SignOut so = new SignOut(driver);
	WebDriverUtilies we1 =new WebDriverUtilies();
	we1.mouseHover(driver, mousehover);
	
}

@FindBy(xpath="//a[text()='Sign Out']")
private WebElement out;

public WebElement Signout()
{
 return out;
}

public void logout()
{
	out.click();
 
}
}

