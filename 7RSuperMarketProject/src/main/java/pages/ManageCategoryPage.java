package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUploadUtility;
import utilities.WaitUtility;

public class ManageCategoryPage {
	WebDriver driver;
	WaitUtility wait=new WaitUtility();
	FileUploadUtility file=new FileUploadUtility();
	public ManageCategoryPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);		
	}

	@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(xpath ="//input[@id='category']")
	WebElement categoryfield;
	@FindBy(id="134-selectable")
	WebElement discount;
	@FindBy(xpath ="//input[@id='main_img']")
	WebElement choosefile;
	@FindBy(xpath ="(//label[@class='radio-inline'])[1]")
	WebElement topmenu;
	@FindBy(xpath ="(//label[@class='radio-inline'])[3]")
	WebElement leftmenu;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement saveinfo;

	public ManageCategoryPage newButton()
	{
		newbutton.click();
		return this;
	}
	public ManageCategoryPage categoryField()
	{
		categoryfield.sendKeys("diamond jewellery");
		return this;
	}
	public ManageCategoryPage discountCategory()
	{
		discount.click();
		return this;
	}
	public ManageCategoryPage fileChoose()
	{
		file.sendKeysForFileUpload(choosefile, Constant.TESTIMAGE);
		return this;
		//choosefile.sendKeys(null);//Constant value insert
	}
	public ManageCategoryPage scrollDown()
	{
		JavascriptExecutor script=(JavascriptExecutor) driver;
		script.executeScript("window.scrollBy(0,5000)","");
		return this;
		
	}
	public ManageCategoryPage scrollDownToRadioMenus()
	{
		JavascriptExecutor script=(JavascriptExecutor) driver;
		script.executeScript("window.scrollBy(0,5000)","");
		return this;
		
	}
	public ManageCategoryPage topMenus()
	{
		wait.elementToBeClicked(driver, topmenu);
		topmenu.click();
		return this;
		
	}
	public ManageCategoryPage leftMenu()
	{
		wait.elementToBeClicked(driver, leftmenu);
		leftmenu.click();
		return this;
	}
	
	public ManageCategoryPage saveButton()
	{
		saveinfo.click();
		return this;
	}

}
