package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver launchChromedriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\patil\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.khanacademy.org/profile/me/courses");
		Thread.sleep(2000);
		return driver;
		
		
	}
	
	public static WebDriver launchFirefoxdriver() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\patil\\Downloads\\geckodriver-v0.31.0-win32 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.khanacademy.org/profile/me/courses");
		return driver;
}
}