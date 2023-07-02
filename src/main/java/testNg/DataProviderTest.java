package testNg;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
WebDriver driver;
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
            {"suresh", "suresh123"},
            {"username2", "password2"},
            {"username3", "password3"}
            // Add more test data as needed
        };
    }

    @SuppressWarnings("deprecation")
	@Test(dataProvider = "loginData" , enabled=true)
    public void testLogin(String username, String password) {
    	driver =new ChromeDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		System.out.println("Set Up Browser");
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		System.out.println("Entered Username & Password");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("Submit")).click();
		driver.close();
    	
    }
}

//1--@Test(enabled=false)  not executed 
//2--Testng.xml  --<method> <exclude name="method_name"> </exclude>  </method>
//    <method> <include name="method_name"> </include>  </method>
//<method> <include name="regular expression start with mobile only "mobile.*"> </include>  </method>
	



	