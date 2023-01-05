package Facebook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.utility;

public class Loginfb {

	@FindBy(xpath = "//input[@type='text']")
	private WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@value='1']")
	private WebElement loginbutton;


	public Loginfb(WebDriver driver) {
	PageFactory.initElements(driver, this);

}

	public void Username () throws IOException {
	//String	data1= utility.getdatafromexcell(Sheet1, 1, 1);
			//utility.getdatafromexcell();
	username.sendKeys("patilsagar641");

}

	public void PWD() {
	password.sendKeys("Sagar@123");
}
	public void Login() {
	 loginbutton.click();
}
}
