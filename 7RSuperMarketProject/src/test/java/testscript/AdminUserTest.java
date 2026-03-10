package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUser;
import pages.HomePageSuperMarket;
import pages.LoginPageSuperMarket;
import utilities.FakerUtility;

public class AdminUserTest extends Base{
	HomePageSuperMarket homepage;
	AdminUser adminpage;
	FakerUtility faker=new FakerUtility();//add faker globally
	
  @Test(description = "verify newuser add to the AdminUser",retryAnalyzer = retry.Retry.class)
  public void verifyAdminMoreInfo() {
	  LoginPageSuperMarket login=new LoginPageSuperMarket(driver);
	  login.enterUsernameAndPassword("admin", "admin");
	  homepage=login.signIn();
	  adminpage=homepage.moreInfo();
	  String newusername=faker.getFakeFirstName();//faker methods added here from faker page
	  String newpassword=faker.getPassword();
	  adminpage.newAdmin().AdminUserInfo(newusername,newpassword).saveButton();//save and run
	
//	  login.signIn();
//	  AdminUser admin=new AdminUser(driver);
//	  admin.moreInfo();
//	  admin.newAdmin();
//	  admin.AdminUserInfo(); 
//	  admin.saveButton();
	  boolean alertdisplayed=adminpage.isAlertMessageDisplayed();
	  Assert.assertTrue(alertdisplayed, "USERADDEDALERTMESSAGE");
	 
	 
  }
 
}

  
