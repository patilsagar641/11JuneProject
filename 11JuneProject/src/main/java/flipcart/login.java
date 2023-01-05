package flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	@FindBy(xpath="//a[@class='_1_3w1N']") 
	private WebElement login;
	@FindBy (xpath="//input[@class='_2IX_2- VJZDxU']") 
	private WebElement username;
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginclick;
	
	public  login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendUN() {
		username.sendKeys("ganeshgholap4884@gmail.com");
	}
	public void sendPASS() {
		password.sendKeys("Ganesh@4488");
	}
	public void clickLOGBUTTON() {
	loginclick.click();
}
}
	
	
