package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePageSuperMarket;
import pages.LoginPageSuperMarket;
import pages.ManageNews;
import utilities.ExcelUtilities;


public class ManageNewsTest extends Base {
	HomePageSuperMarket homepage;
	ManageNews managenews;
	

	@Test
	public void addNews() throws IOException {
		 LoginPageSuperMarket page=new LoginPageSuperMarket(driver);//globally declared driver base class
		  String username=ExcelUtilities.readStringData(1, 0, "LoginPageTest");
		  String password=ExcelUtilities.readStringData(1, 1, "LoginPageTest");
		  page.enterUsernameAndPassword(username, password);
		  homepage=page.signIn();
		  managenews=homepage.moreNewsInfoButton().newButton().saveButton();
		  boolean homepageisdisplayed=page.isHomePageIsDisplayed();
		  Assert.assertTrue(homepageisdisplayed,Constant.ERRORMESSAGEFORLOGIN);  

	}






}