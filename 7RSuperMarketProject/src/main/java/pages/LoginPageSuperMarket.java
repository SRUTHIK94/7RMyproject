package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPageSuperMarket {
	WebDriver driver;
	WaitUtility wait=new WaitUtility();//globally waitutility object created for calling each methods
	public LoginPageSuperMarket(WebDriver driver)//create constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);//to initialise the elements and  reuse elements
	}
	@FindBy(xpath="//input[@placeholder='Username']")//pagefactory providing annotation is findby
	WebElement username;//webelement elementname
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;

	public LoginPageSuperMarket enterUsernameAndPassword(String usernamefield,String passwordfield)//page chaining in Login
	{
		username.sendKeys(usernamefield);//here username is webelement name and usernamefield is parameter value
		password.sendKeys(passwordfield);
		return this;
	}
	

	public HomePageSuperMarket signIn()// page chaining signin method
	{
		wait.elementToBeClicked(driver, signin);//object wait used to call elementtobeclicked methodfrom waitutility page
		signin.click();
		return new HomePageSuperMarket(driver);
	}
	
	
	
	public boolean isHomePageIsDisplayed() {
		// TODO Auto-generated method stub
		return dashboard.isDisplayed();
	}
	
}
