package Zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	// Step 1 To declare the global variable (Data Member)

	@FindBy(xpath = "//input[@type='text']")
	private WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;

	// Step 2 Initialization of variable

	public Login(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	// Step 3 Method create

	public void enterUN() {
		username.sendKeys("IWS376");
	}

	public void enterPWD() {
		password.sendKeys("Sagar@1992");
	}

	public void login() {
		loginButton.click();
	}

}
