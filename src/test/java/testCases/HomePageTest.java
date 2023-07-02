package testCases;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.WebDriverUtils;

public class HomePageTest extends WebDriverUtils {
	@Test 
	void tc001(){
		
		WebDriverUtils utils=new WebDriverUtils();
		utils.setUp("http://183.82.103.245/nareshit/login.php");
        LoginPage login=new LoginPage(driver);
        login.enterUsername("suresh");
		login.enterPassword("suresh123");
		login.clickLoginButton();
		utils.tearDown();
		
	}
}
