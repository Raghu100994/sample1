package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginwithPF {
@FindBy(how=How.NAME, using="userName")
@CacheLookup
WebElement user;
@FindBy(how=How.NAME, using="password")
@CacheLookup
WebElement pwd;
@FindBy(how=How.NAME, using="login")
@CacheLookup
WebElement lin;
@FindBy(how=How.LINK_TEXT, using="SIGN-OFF")
@CacheLookup
WebElement lout;
public void login(String usern, String pass)
{
	user.sendKeys(usern);
	pwd.sendKeys(pass);
	lin.click();
	
}
public void logout()
{
	lout.click();
}
}
