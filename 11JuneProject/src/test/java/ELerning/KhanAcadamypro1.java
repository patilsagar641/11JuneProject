package ELerning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.Browser;

public class KhanAcadamypro1 {

	WebDriver driver;
	@Test
	public void donateTest() throws InterruptedException {
		
		WebDriver driver=Browser.launchChromedriver();
		//Browser.launchFirefoxdriver();
	driver.findElement(By.xpath("//a[normalize-space()='donate']")).click();
		
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	WebElement oneTime = driver.findElement(By.xpath("//input[@id='donation-amount-recurring__radio-input'"));
	Thread.sleep(2000);
	oneTime.click();
	
	driver.findElement(By.xpath("(//input[@id='D-A25'])[1]")).click();
	WebElement dedicate = driver.findElement(By.xpath("(//span[@class='sc-checkbox_input'])[1]"));
	
	JavascriptExecutor j= (JavascriptExecutor)driver;
	
	j.executeScript("argument[0].click", dedicate);
	
	WebElement memory = driver.findElement(By.xpath("(//span[@class='form_radio-control_input'])[2]"));
	
	j.executeScript("argument[0].click", memory);
	
	driver.findElement(By.xpath("(//input[@name='honoree_first_name']")).sendKeys("Mahatma");
	
	Thread.sleep(2000);
	
	/*WebDriverWait w = WebDriverWait(driver,Duration.ofSeconds(5));
	WebElement lname = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='honoree_last_name'])[1]")));
	*/
	driver.findElement(By.xpath("//input[@placeholder= 'Email Address']")).sendKeys("Patil@gmail.com");
	
	
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Sagar");
	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Patil");
	driver.findElement(By.xpath("//input[@name='ecard_message']")).sendKeys("Happy Birthday");
	driver.findElement(By.xpath("//input[@name='member_first_name']")).sendKeys("Sagar");
	driver.findElement(By.xpath("//input[@name=''member_first_name")).sendKeys("India");
	WebElement hide = driver.findElement(By.xpath("(//span[@class='sc_checkbox_input]'])[2]"));
	
	j.executeScript("argument[0].click",hide );
	
	
	
	
	
	
	
	
	
	
	}
	
	}

