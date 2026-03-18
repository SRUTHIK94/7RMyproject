package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUser {
	WebDriver driver;
	PageUtility utility=new PageUtility();
	public AdminUser(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger']")
		WebElement newadmin;
		@FindBy(xpath ="//input[@id='username']")
		WebElement username;
		@FindBy(xpath ="//input[@id='password']")
		WebElement password;
		@FindBy(xpath = "//select[@id='user_type']")
		WebElement dropdown;
		@FindBy(xpath = "//button[@name='Create']")
		WebElement saveinfo;
		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		WebElement alertmsg;
		
	

	public AdminUser newAdminUserButton()
	{
		newadmin.click();
		return this;
	}
	public AdminUser AdminUserInfo(String usernameadmin,String passwordadmin)
	{
		username.sendKeys(usernameadmin);
		password.sendKeys(passwordadmin);
		utility.selectByIndex(dropdown,1);
	    return this;	
	}
	
		

	public AdminUser saveAdminUserButton()
	{
		saveinfo.click();
		return this;
	}
	public boolean isAlertMessageDisplayed() {
		// TODO Auto-generated method stub
		return alertmsg.isDisplayed();
	}


}
