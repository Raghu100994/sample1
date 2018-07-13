package testsuite;

import org.openqa.selenium.WebDriver;

import browsers.Choosebrowser;
import pages.LoginwithoutPF;

public class TestcasewithoutPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=Choosebrowser.selectbrowser("firefox", "http://newtours.demoaut.com/");
LoginwithoutPF tc=new LoginwithoutPF(driver);
tc.login();
tc.logout();
	}

}
