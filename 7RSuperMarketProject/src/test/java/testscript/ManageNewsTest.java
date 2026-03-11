package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePageSuperMarket;
import pages.LoginPageSuperMarket;
import pages.ManageNews;
import utilities.ExcelUtilities;


public class ManageNewsTest extends Base {
	HomePageSuperMarket homepage;
	ManageNewsTest managenews;
	

	@Test
	public void addNews() throws IOException {
		 LoginPageSuperMarket page=new LoginPageSuperMarket(driver);//globally declared driver base class
		  String username=ExcelUtilities.readStringData(1, 0, "LoginPageTest");
		  String password=ExcelUtilities.readStringData(1, 1, "LoginPageTest");
		  page.enterUsernameAndPassword(username, password);
		  homepage=page.signIn();
		  //managenews=homepage.moreNewsInfoButton();
		

		 // managenews =homepage.moreNewsInfoButton();

//		  managenews.newButton();
//		  enterNewsField(ExcelUtilities.readStringData(1, 0, "NewsTest")).saveButton();

	}






}