package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTestNG {

	WebDriver driver;
	Home home;
	sign_in sign;

	@BeforeClass
	public void beforeclass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\patil\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void beforemethod() throws InterruptedException {

		sign = new sign_in(driver);

		home = new Home(driver);
		Thread.sleep(2000);

		// sign.Account();
		sign.Username();
		sign.Continue();
		sign.Password();
		sign.Submit();

	}

	@Test
	public void test() {

		home.Bestseller();
		String url = driver.getCurrentUrl(); // Actual
		Assert.assertEquals(url, "https://www.amazon.in/alm/storefront?almBrandId=ctnow&ref_=nav_cs_fresh");

	}

	@Test
	//public void test1() {

		//home.sell();
		//String url = driver.getCurrentUrl();
		//Assert.assertEquals(url,
		//		"https://www.amazon.in/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3");

	//}

	@AfterMethod

	public void aftermethod() {

		home.Account();
		home.Signout();
	}

	@AfterClass

	public void afterclass() {
		driver.close();
	}

}
