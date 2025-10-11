package SeleniumBasics;

import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.logging.FileHandler;
//import java.util.logging.Logger;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class MultiScreenshot {
	WebDriver driver = new ChromeDriver();

	public void f() throws IOException, InterruptedException {

		// /SeleniumAspire/target/Screenshots - updated comment

		driver.get("https://www.google.com");

		ScreenshotUtil.CaptureScreenshot(driver, "GoogleMenu");
		
		Thread.sleep(2999);

		driver.quit();

	}


}
