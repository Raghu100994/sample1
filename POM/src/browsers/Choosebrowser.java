package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Choosebrowser {
static WebDriver driver;
public static WebDriver selectbrowser(String bname, String URL)
{
	if(bname.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(bname.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D://Raghu//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	driver.get(URL);
 return driver;
	
	
}
}
