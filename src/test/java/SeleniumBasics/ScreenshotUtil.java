package SeleniumBasics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ScreenshotUtil {
	@Test

	public static void CaptureScreenshot(WebDriver driver, String filename) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Define screenshot name with timestamp
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String destFile = System.getProperty("user.dir") + "/Screenshots/" + filename + "_" + timestamp + ".png";

		try {

			FileUtils.copyFile(src, new File(destFile));

			System.out.println("Screenshot saved: " + destFile);
		}

		catch (IOException e) {
			// TODO: handle exception

			System.out.println("Unable to save screenshot: " + e.getMessage());
		}
	}
}
