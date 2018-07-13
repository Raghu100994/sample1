package testsuite;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import browsers.Choosebrowser;
import pages.LoginwithPF;

public class TestcasewithPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=Choosebrowser.selectbrowser("firefox", "http://newtours.demoaut.com/");
LoginwithPF rm=PageFactory.initElements(driver, LoginwithPF.class);
rm.login("123", "123");
rm.logout();
	}

}
