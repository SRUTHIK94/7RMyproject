package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePageSuperMarket;
import pages.LoginPageSuperMarket;
import utilities.ExcelUtilities;

public class HomePageTest extends Base {
	HomePageSuperMarket homepage;

	@Test(description = "Verify that the user can logout successfully after logging in")
	public void verifyHomePageData() throws IOException {
		LoginPageSuperMarket login = new LoginPageSuperMarket(driver);
		String username = ExcelUtilities.readStringData(1, 0, "AdminUserTest");
		String password = ExcelUtilities.readStringData(1, 1, "AdminUserTest");

		login.enterUsernameAndPassword(username, password);
		homepage = login.signIn();
		homepage.adminHomePageButton().homePageLogOutButton();// chaining
		boolean homepageisdisplayed = login.isHomePageIsDisplayed();
		Assert.assertTrue(homepageisdisplayed, Constant.ERRORMESSAGEFORLOGIN);

	}
}
