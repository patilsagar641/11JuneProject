package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	@FindBy(xpath = "(//a[@class='nav-a']")
	private WebElement bestseller;

	//@FindBy(xpath = "(//a[@class='nav-a  '])[2]")
	//private WebElement sell;

	@FindBy(xpath = "(//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute'])")
	private WebElement account;

	@FindBy(xpath = "(//span[@class='nav-text'])[19]")
	private WebElement signout;

	     public Home(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	  public void Bestseller() {
		bestseller.click();
	}

	 // public void Sell() {
	//	sell.click();
	//}
	  public void Account() {
		account.click();
	}

	  public void Signout() {
		signout.click();
		
		
	}
}
