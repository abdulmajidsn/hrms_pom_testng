package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class WebDriverUtils {
	 protected static WebDriver driver;
	
	  public void setUp(String url) {
		driver =new ChromeDriver();
		driver.get(url);
		System.out.println("Set Up Browser");
	}
	  
	  @SuppressWarnings("deprecation")
	public void waitSt() {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  System.out.println("Given implicitWait of 20sec");
	  }
	  
	public void tearDown() {
		driver.close();
		System.out.println("tear Up Browser");
		
	}
	
	
	
	

}
