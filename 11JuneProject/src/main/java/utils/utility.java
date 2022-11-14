package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class utility {

	public static void captureScreenshot(WebDriver driver, int testID) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\patil\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();

		// driver.get("https://www.flipkart.com/mobiles-accessories/signup~brand/pr?sid=tyy");

		driver.get("https://facebook.com/");

		// Thread.sleep(2000);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String demo = RandomString.make();

		try {
			File des = new File("D:\\screenshot" + demo + ".jpg");

			FileHandler.copy(src, des);
		}

		catch (IOException e) {
			System.out.println(e);
		}

		Calendar cal = Calendar.getInstance();
		java.util.Date Time = cal.getTime();
		String timestamp = Time.toString().replace("/", "").replace(" ", "");
		System.out.println(Time);
		System.out.println(timestamp);

	}

	public static void getdatafromexcell() throws IOException {
		// String data;
		//double data;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {

				FileInputStream file = new FileInputStream("D:\\selenium\\Parameterization\\Book1.xlsx");

				String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
				System.out.print(data + "  ");
				System.out.println();

			}
		}

	}

}
