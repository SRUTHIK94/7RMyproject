package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePageSuperMarket;
import pages.LoginPageSuperMarket;

public class HomePageTest extends Base {
	HomePageSuperMarket homepage;
  @Test(description = "Verify that the user can logout successfully after logging in")
  public void verifyHomePageData() 
  {
	  LoginPageSuperMarket login=new LoginPageSuperMarket(driver);
	  login.enterUsernameAndPassword("admin", "admin");
	  homepage=login.signIn();
	  homepage.adminHomePageButton().homePageLogOutButton();//chaining
	  boolean homepageisdisplayed=login.isHomePageIsDisplayed();
	  Assert.assertTrue(homepageisdisplayed,Constant.ERRORMESSAGEFORLOGIN);

  }
}
