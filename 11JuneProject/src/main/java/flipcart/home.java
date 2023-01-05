package flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {

	// Step 1 To declare the global variable (Data Member)

	@FindBy(xpath = "(//a[contains(@href,'https://www.flipkart.com/offers-store')])[1]")
	private WebElement store;

	// @FindBy(xpath = "//span[text()='Holdings']")
	// private WebElement holdings;

	// @FindBy(xpath = "//span[text()='Positions']")
	// private WebElement position;

	// @FindBy(xpath = "//span[@class='user-id']")
	// private WebElement profileName;

	// @FindBy(xpath = "//a[@target='_self']")
	// private WebElement logout1;

	// Step 2 Initialization of variable

	public home(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// Step 3 Method create

	public void Store() {
		store.click();
	}

	// public void holdings() {
	// holdings.click();
	// }

	// public void positions() {
	// position.click();
	// }

	// public void logout() throws InterruptedException {
	// profileName.click();
	// Thread.sleep(2000);
	// logout1.click();

	// }

}
