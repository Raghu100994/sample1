package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginwithoutPF {
WebDriver driver;
By user=By.name("userName");
By pass=By.name("password");
By lin=By.name("login");
By lout=By.linkText("SIGN-OFF");
public LoginwithoutPF(WebDriver d)
{
	this.driver=d;
}
public void login()
{
	driver.findElement(user).sendKeys("123");
	driver.findElement(pass).sendKeys("123");
	driver.findElement(lin).click();
}
public void logout()
{
	driver.findElement(lout).click();
}
}
