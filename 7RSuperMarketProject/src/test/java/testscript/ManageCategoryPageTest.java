package testscript;

import org.testng.annotations.Test;

import pages.HomePageSuperMarket;
import pages.LoginPageSuperMarket;
import pages.ManageCategoryPage;

public class ManageCategoryPageTest extends Base {
	HomePageSuperMarket homepage;
	ManageCategoryPage managecategory;
  @Test
  public void VerifyNewCategoryAdding(){
	  LoginPageSuperMarket login=new LoginPageSuperMarket(driver);
	  login.enterUsernameAndPassword("admin", "admin");
	  homepage=login.signIn();
	 
	  managecategory = homepage.moreInfoManageCategory();
	  managecategory.newButton();
	  managecategory.categoryField().discountCategory().fileChoose();

	  managecategory.scrollDown();
	  managecategory.scrollDownToRadioMenus();
	  managecategory.topMenus().leftMenu().saveButton();

	  
  }
 
}
