package Zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(xpath = "//div[@class='_1gaz _1ga- _50f6']")

	private WebElement AddAccount;

	public Logout(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void clickuser() {
		AddAccount.click();
	}

}
