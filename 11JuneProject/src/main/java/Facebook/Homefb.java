package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homefb {

	@FindBy(xpath = "//a[@aria-label='Marketplace']")

	private WebElement marketplace;

	@FindBy(xpath = "//a[@aria-label='Groups']")

	private WebElement groups;
	
	@FindBy(xpath = "(//span[@class='x4k7w5x x1h91t0o x1h9r5lt x1jfb8zj xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j'])[7]")

	private WebElement account;
	
	
	@FindBy(xpath ="//span[text()='Log Out']")
	private WebElement logout;


	public Homefb(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void marketplace() throws InterruptedException {
		marketplace.click();
	
	Thread.sleep(2000);
	}

	public void groups() {
		groups.click();
		
	}
	
	public void Account() throws InterruptedException {
		
		account.click();
		Thread.sleep(2000);
	}
	
	public void Logout() {
		logout.click();
	}
	
	

}
