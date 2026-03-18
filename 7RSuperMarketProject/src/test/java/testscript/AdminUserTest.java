package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUser;
import pages.HomePageSuperMarket;
import pages.LoginPageSuperMarket;
import utilities.ExcelUtilities;
import utilities.FakerUtility;

public class AdminUserTest extends Base {
	HomePageSuperMarket homepage;
	AdminUser adminpage;
	FakerUtility faker = new FakerUtility();// add faker globally

	@Test(description = "verify newuser add to the AdminUserPage", retryAnalyzer = retry.Retry.class)
	public void verifyAdminMoreInfo() throws IOException {
		LoginPageSuperMarket login = new LoginPageSuperMarket(driver);
		String username = ExcelUtilities.readStringData(1, 0, "LoginPageTest");
		String password = ExcelUtilities.readStringData(1, 1, "LoginPageTest");

		login.enterUsernameAndPassword(username, password);
		homepage = login.signIn();
		adminpage = homepage.moreHomePageInfo();

		String newusername = faker.getFakeFirstName();// faker methods added here from faker page
		String newpassword = faker.getPassword();

		adminpage.newAdminUserButton().AdminUserInfo(newusername, newpassword).saveAdminUserButton();// save and run
		boolean alertdisplayed = adminpage.isAlertMessageDisplayed();
		Assert.assertTrue(alertdisplayed, "USERADDEDALERTMESSAGE");

	}

}
