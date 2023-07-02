package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WebDriverUtils;

public class LoginPage extends WebDriverUtils {
	
	public LoginPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "txtUserName")
	 WebElement usernameInput;

	@FindBy(name = "txtPassword")
	 WebElement passwordInput;

	@FindBy(name = "Submit")
	 WebElement loginButton;

	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
		System.out.println("username Entered");
	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
		System.out.println("Password Entered");
	}

	public void clickLoginButton() {
		loginButton.click();
		System.out.println("Clicked on Sumbit");
	}
}