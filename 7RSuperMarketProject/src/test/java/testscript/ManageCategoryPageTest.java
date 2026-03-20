package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePageSuperMarket;
import pages.LoginPageSuperMarket;
import pages.ManageCategoryPage;
import utilities.ExcelUtilities;

public class ManageCategoryPageTest extends Base {
	HomePageSuperMarket homepage;
	ManageCategoryPage managecategory;

	@Test(description = "Verify that a new category can be added to the Manage Page")
	public void VerifyNewManageCategoryAdding() throws IOException {
		LoginPageSuperMarket login = new LoginPageSuperMarket(driver);
		String username = ExcelUtilities.readStringData(1, 0, "AdminUserTest");
		String password = ExcelUtilities.readStringData(1, 1, "AdminUserTest");

		login.enterUsernameAndPassword(username, password);
		homepage = login.signIn();
		managecategory = homepage.moreInfoManageCategory();
		managecategory.newManageCategoryButton();
		managecategory.manageCategoryField(ExcelUtilities.readIntegerData1(1, 2, "AdminUserTest"))
		.discountManageCategory().manageCategoryFileChoose();
		managecategory.manageCategoryScrollDown();
		managecategory.manageCategoryScrollDownToRadioMenus();
		managecategory.manageCategoryTopMenus().manageCategoryLeftMenu().manageCategorySaveButton();
		boolean homepageisdisplayed = login.isHomePageIsDisplayed();
		Assert.assertTrue(homepageisdisplayed, Constant.ERRORMESSAGEFORLOGIN);

	}

}
