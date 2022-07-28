package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestBox extends CommonHelper {

	public static void sendText(By locator, String value) {
		//ExplicitWait.waitForVisibility(locator);
		//driver.findElement(locator).sendkeys(value);
	}
	
	
	public static void sendText(WebElement locator, String value) {
		//ExplicitWait.waitForVisibility(locator);
		//locator.sendkeys(value);
	}
}
