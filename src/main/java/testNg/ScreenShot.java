package testNg;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ScreenShot {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void setUp() throws Exception {
		// ChromeOptions chromeOption = new ChromeOptions();
		// chromeOption.setHeadless(true);
		// chromeOption.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/how-to-use-soft-asserts-in-testng/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("browser SetUp");
		String expected = "How to Use Soft Asserts in TestNG? - GeeksforGeeks";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(driver.getTitle(), expected);
		System.out.println("Tite matched");
		
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//li[@class='header-main__list-item selected']//span[contains(text(),'Practice')]"))).perform();
Thread.sleep(4000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 500)");

		String Parent_id = driver.getWindowHandle();
		System.out.println(Parent_id);
		
		
		WebElement scnhalf=driver.findElement(By.xpath("//img[@alt='geeksforgeeks']"));		
		File src=scnhalf.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("test-output/test2.png"));
		System.out.println("Screen shoted");

		driver.close();
	}
}
