package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sign_in {
	
	//@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	//	private WebElement account;


	@FindBy(xpath = "//input[@type='email']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continu;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement submit;

	public sign_in(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	
	//public void Account() {
	//	account.click();
		//}
		
	public void Username() {
		username.sendKeys("918605287117");

	}

	public void Continue() {
		continu.click();

	}

	public void Password() {
		password.sendKeys("Sagar@123");

	}

	public void Submit() {
		submit.click();
	}

}
