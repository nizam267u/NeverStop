package never.us.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import never.us.base.BasePage;

public class Waits extends BasePage{
	public static void explicitWaits(WebElement element,long time) {
		WebDriverWait expWait = new WebDriverWait(driver, time);
		expWait.until(ExpectedConditions.elementToBeClickable(element));			
	}
}
