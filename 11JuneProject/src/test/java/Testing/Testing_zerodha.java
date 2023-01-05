package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Zerodha.Home;
import Zerodha.Login;
import Zerodha.Login2;
import Zerodha.Logout;

public class Testing_zerodha {

	WebDriver driver;
	Login login;
	Login2 loginpin;
	Home home;
	Logout logout; 
	@BeforeClass
	public void openbrowser() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\patil\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	
	
	}
	
	@BeforeMethod
	public void logintoApllication() throws InterruptedException {
		
		System.out.println("Before Method");
		
		//driver.get("https://kite.zerodha.com/");
		
		login = new Login(driver);
		login.enterUN();
		login.enterPWD();
		login.login();
		
		Login2 loginpin = new Login2(driver);
		Thread.sleep(2000);
		loginpin.enterpin();
		loginpin.clicksubmit();
		
		home = new Home(driver);
		logout = new Logout(driver);
	}
	
	@Test
	public void test() {
		
		System.out.println("test");
		
		home.order();
		
		String url = driver.getCurrentUrl();// Actual
		if(url.equals("https://kite.zerodha.com/orders")) {
			System.out.println("Test Case Pass");
			}
		else {
			System.out.println("Test Case Fail");
		}
	}
	
	@Test
	public void test1() {
		
		System.out.println("test1");
		
		home.holdings();
		
		String url = driver.getCurrentUrl();// Actual
		if(url.equals("https://kite.zerodha.com/holdings")) {
			System.out.println("Test Case Pass");
			}
		else {
			System.out.println("Test Case Fail");
		}
	}
	
	@Test
	public void test2() {
		
		System.out.println("test2");
		
		home.positions();
		
		String url = driver.getCurrentUrl();// Actual
		if(url.equals("https://kite.zerodha.com/positions")) {
			System.out.println("Test Case Pass");
			}
		else {
			System.out.println("Test Case Fail");
		}
	}
	
	
	
	@AfterMethod
	public void logout() throws InterruptedException {
		
		System.out.println("After Method");
		
		home.logout();
		logout.clickuser();
		
	}
	@AfterClass
	public void afterclass() {
		driver.close();
	}
	
}

