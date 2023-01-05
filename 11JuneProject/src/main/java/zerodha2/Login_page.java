package zerodha2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	// Step 1 To declare the global variable (Data Member)
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='passward']")
	private WebElement passward;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginbutton;
	
	// step 2 Initialization of variable
	
	public Login_page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	// step 3 Method Creation
	
	public void enterUN() {
		username.sendKeys("OKP335");
	}
	
	public void enterPWD() {
		passward.sendKeys("ZAQ1234567");
	}
	
	public void login() {
		loginbutton.click();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
