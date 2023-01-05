package zerodha2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	// Step 1 to declare global variable
	
	@FindBy(xpath="//span[text()='Orders']")
	private WebElement orders;
	
	@FindBy(xpath="//span[text()='Holdings']")
	private WebElement holdings;
	
	@FindBy(xpath="//span[text()='Positions']")
	private WebElement positions;
	
	@FindBy(xpath="//span[@class='user-id']")
	private WebElement profilename;
	
	@FindBy(xpath="//a[@target='_self']")
	private WebElement logout1;
	
	
	// Step 2 to Initialization of variable
	
	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	// Step 3 Method Creation
	
	public void orders() {
		
		orders.click();
	}
	
	public void holdings() {
		
		holdings.click();
	}
	
	public void positions() {
		
		positions.click();
	}
	
	public void logout() throws InterruptedException {
		
		profilename.click();
		Thread.sleep(2000);
		logout1.click();
	}
	
	
	
	
	
	
}
