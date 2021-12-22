package fileutilitytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Baseclass
    {
		 WebDriver driver;
		 public Login (WebDriver d)
		 {
		    this.driver=d;
		    PageFactory.initElements(driver, this);
		 }
		 
@FindBy(name="user_name")
private WebElement US;

public WebElement getUserName()
{
	return US;
}

@FindBy(name="user_password")
private WebElement PWD;

public WebElement getPassword()
{
	return PWD;
}

@FindBy(id="submitButton")
private WebElement SB;

public WebElement getSubmit()
{
	return SB;
}

public void login(String user,String pass)
{
	US.sendKeys(user);
	PWD.sendKeys(pass);
	SB.click();
}



}
