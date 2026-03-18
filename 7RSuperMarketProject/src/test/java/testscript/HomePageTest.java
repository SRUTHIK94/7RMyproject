package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePageSuperMarket;
import pages.LoginPageSuperMarket;

public class HomePageTest extends Base {
	HomePageSuperMarket homepage;
  @Test
  public void verifyHomePageData() 
  {
	  LoginPageSuperMarket login=new LoginPageSuperMarket(driver);
	  login.enterUsernameAndPassword("admin", "admin");
	  homepage=login.signIn();
	  homepage.adminButton().logOutButton();//chaining
	  boolean homepageisdisplayed=login.isHomePageIsDisplayed();
	  Assert.assertTrue(homepageisdisplayed,Constant.ERRORMESSAGEFORLOGIN);

  }
}
