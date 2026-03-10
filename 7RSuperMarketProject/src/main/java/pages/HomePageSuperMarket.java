package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageSuperMarket {
WebDriver driver;
public HomePageSuperMarket(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "(//a[@class='nav-link'])[1]")
WebElement adminbutton;
@FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
WebElement logoutbutton;
@FindBy(xpath ="(//a[@class='small-box-footer'])[1]")//this path is pasted from admin user page
WebElement moreinfoadmin;
@FindBy(xpath ="(//a[@class='small-box-footer'])[9]")
WebElement moreinfo9;
//public void adminButton()
//{
//	adminbutton.click();
//}
public AdminUser moreInfo() {
	moreinfoadmin.click();
	return new AdminUser(driver);
}
public HomePageSuperMarket adminButton()
{
	adminbutton.click();
	return this;
}
//public void logOutButton()
//{
//	logoutbutton.click();
//}
public HomePageSuperMarket logOutButton()
{
	logoutbutton.click();
	return this;
}
public ManageCategoryPage moreInfoManageCategory() {
	moreinfo9.click();
	return new ManageCategoryPage(driver);
	
}

}
