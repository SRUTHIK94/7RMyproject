package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pages.ManageCategoryPage;

public class PageUtility {

	public void selectByIndex(WebElement element, int index) {
		// TODO Auto-generated method stub
		Select select=new Select(element);
	    select.selectByIndex(index);
	}
	public void selectByValue(WebElement element, int index) {
		// TODO Auto-generated method stub
		Select select=new Select(element);
	    select.selectByValue(null);
	}
	public void selectByVisibleText(WebElement element, int index) {
		// TODO Auto-generated method stub
		Select select=new Select(element);
	    select.selectByVisibleText(null);
	}
	public void action(WebElement element)
	{
		Actions action=new Actions((WebDriver)element);
		action.moveToElement(element).click();
		action.doubleClick(element).click();
	}
	 
		public void  manageCategoryScrollDownToRadioMenus(WebDriver driver) {
			JavascriptExecutor script = (JavascriptExecutor) driver;
			script.executeScript("window.scrollBy(0,5000)", "");

		}
		public void manageCategoryScrollDown(WebDriver driver) {
			JavascriptExecutor script = (JavascriptExecutor) driver;
			script.executeScript("window.scrollBy(0,5000)", "");

		}



}
