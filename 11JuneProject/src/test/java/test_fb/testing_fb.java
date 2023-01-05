package test_fb;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Browser;
import Facebook.Homefb;
import Facebook.Loginfb;
import Facebook.Logoutfb;

public class testing_fb {

	WebDriver driver;
	Loginfb login;
	Homefb home;
	Logoutfb logout;

	@BeforeClass
	public void openbrowser() throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\patil\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	

	/*	System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\patil\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
*/
	}

	@BeforeMethod
	public void logintoApllication() throws InterruptedException, IOException {

		System.out.println("Before Method");

		login = new Loginfb(driver);
		home = new Homefb(driver);

		login.Username();
		login.PWD();
		login.Login();

	}

	@Test
	public void test() throws InterruptedException {

		// System.out.println("testing marketplace");

		home.marketplace();

		String url = driver.getCurrentUrl();// Actual
		// if(url.equals("https://www.facebook.com/marketplace/?ref=app_tab")) {
		System.out.println("Test Case Pass");
		// }
		// else {
		// System.out.println("Test Case Fail");
		// }
		Assert.assertEquals(url, "https://www.facebook.com/marketplace/?ref=app_tab");

	}

	@Test
	public void test1() {

		System.out.println("test1");

		home.groups();

		String url = driver.getCurrentUrl();// Actual
		// if (url.equals("https://www.facebook.com/groups/feed/")) {
		// System.out.println("Test Case Pass");
		// } else {
		// System.out.println("Test Case Fail");
		// }

		Assert.assertEquals(url, "https://www.facebook.com/groups/feed/");

	}

	@AfterMethod
	public void logout() throws InterruptedException {

		System.out.println("After Method");

		home.Account();
		home.Logout();

	}

	@AfterClass
	public void afterclass() {
		driver.close();
	}

}
