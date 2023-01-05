package zerodha2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page2 {
	
	// Step 1 To declare the global variable (Data Member)
	
	
	@FindBy(xpath="")
	private WebElement pin;
	
	@FindBy(xpath="")
	private WebElement submit;
	
	
	// step Initialization of variable
	
	
	public Login_page2(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	//step 3 Method Creation
	
	
	public void enterpin() {
		pin.sendKeys("234567");
	}
	
	
	public void clicksubmit() {
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
