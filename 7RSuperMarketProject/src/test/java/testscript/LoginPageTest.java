package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePageSuperMarket;
import pages.LoginPageSuperMarket;
import utilities.ExcelUtilities;

public class LoginPageTest extends Base {
	HomePageSuperMarket homepage;//globally homepagesupermarket created for page chaining with variable name homepage
 
  @Test(dataProvider = "credentials",groups = "smoke")
  public void verifyValidUsernameAndValidPassword(String username,String password)
  {
	  LoginPageSuperMarket page1=new LoginPageSuperMarket(driver);//globally declared driver base class
	  page1.enterUsernameAndPassword(username, password);
	  homepage=page1.signIn();//here globally declared homepage variable applied
	  boolean homepageisdisplayed=page1.isHomePageIsDisplayed();
	  Assert.assertTrue(homepageisdisplayed,Constant.ERRORMESSAGEFORLOGIN);  
  }
  
  @Test
  @Parameters({"username","password"})
  public void verifyInValidUsernameAndValidPassword(String username,String password)//parameters only passes through xml
  {
	  LoginPageSuperMarket page2=new LoginPageSuperMarket(driver);//globally declared driver base class
	  page2.enterUsernameAndPassword(username, password);
	  homepage=page2.signIn();
	  boolean homepageisdisplayed=page2.isHomePageIsDisplayed();
	  Assert.assertTrue(homepageisdisplayed,Constant.ERRORMESSAGEFORLOGIN);  
  }
  @Test
  @Parameters({"username","password"})
  public void verifyInValidUsernameAndInValidPassword(String usernamefield,String passwordfield)
  {
	  LoginPageSuperMarket page3=new LoginPageSuperMarket(driver);//globally declared driver base class
	  page3.enterUsernameAndPassword(usernamefield, passwordfield);
	  homepage=page3.signIn();
	  boolean homepageisdisplayed=page3.isHomePageIsDisplayed();
	  Assert.assertTrue(homepageisdisplayed,Constant.ERRORMESSAGEFORLOGIN);  
	  
  }

  @Test(groups = "smoke")
  public void verifyValidUsernameAndInValidPassword() throws IOException//excel utilities coding applied
  {
	  LoginPageSuperMarket page4=new LoginPageSuperMarket(driver);//globally declared driver base class
	  String username=ExcelUtilities.readStringData(1, 0, "LoginPageTest");
	  String password=ExcelUtilities.readStringData(1, 1, "LoginPageTest");
	  page4.enterUsernameAndPassword(username, password);
	  homepage=page4.signIn();
	  boolean homepageisdisplayed=page4.isHomePageIsDisplayed();
	  Assert.assertTrue(homepageisdisplayed,Constant.ERRORMESSAGEFORLOGIN);  
	  
  }
  @DataProvider(name="credentials")
  public Object testData()
  {
	  Object data[][]= {{"admin","admin"},{"sruthi","admin"},{"sruthik","12345"},{"admin","67891"}};
	  return data;
  }
 
}
