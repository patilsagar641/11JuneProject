package flipcart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_flipcart {
	WebDriver driver;
	login log;
	home hom;

	@Beforeclass
	public void beforeclass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\patil\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		hom = new home(driver);
	}

	@BeforeMethod

	public void beforemethod() throws InterruptedException {
		
		Thread.sleep(2000);
		log = new login (driver);
		log.sendUN();
		log.sendPASS();
		log.clickLOGBUTTON();

	}

	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(2000);
		hom.Store();
		

	}

}
