package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNews {
	WebDriver driver;

	public ManageNews(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(xpath = "//textarea[@id='news']")
	WebElement textarea;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;

	public ManageNews newManageNewsButton() {
		newbutton.click();
		return this;
	}

	public ManageNews enterNewsField(String message) {
		textarea.sendKeys(message);
		return this;

	}

	public ManageNews manageNewsSaveButton() {
		save.click();
		return this;
	}

}