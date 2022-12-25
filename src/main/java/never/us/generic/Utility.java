package never.us.generic;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import never.us.base.BasePage;




public class Utility extends BasePage {
	
	// Actions class move to element click functionality
	public static void getActionClick(WebElement ele) {
		Actions action = new Actions(driver);
		action.click(ele).build().perform();
	}

	// Actions class click functionality
	public static void getActionMoveToElement(WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
	}
	// JSE click functionality
	public static void getJSEClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
	// JSE Scroll element functionality
	public static void elementScroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}
	public static void getSelectDropDownList(List<WebElement> ele, String text) {
		List<WebElement> option = ele;
		for (WebElement newValue : option) {
			if (newValue.getText().contains(text)) {
				newValue.click();
			}
		}
	}
	// Select value from Drop down
	public static void getSelectValue(WebElement ele, String text) {
		Select sc = new Select(ele);
		//sc.deselectByVisibleText(text);
		sc.selectByVisibleText(text);
	}
	
	//highlight occurances
	public static void Highlighter(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='5px solid yellow'", ele);
	}
	
	public static void getScrollDownWithActionClass() {
    	Actions a = new Actions(driver);
    	a.sendKeys(Keys.PAGE_DOWN).build().perform();

    }
	
	public static void selectRadioButton(WebElement ele){
		boolean isSelected= ele.isSelected();
		if(!isSelected) {
			ele.click();
		}
	}
}
