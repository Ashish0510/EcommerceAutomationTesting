package AllTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PomClass.CreateAccountPage;
import PomClass.CustomerDashBoard;
import PomClass.IndexPage;
import PomClass.LoginPage;
import Utility.AlldataProviders;

public class toVerifySignupAndLoginTest extends BaseClassTest{

	

	@Test(dataProvider  = "signupdetails",dataProviderClass = AlldataProviders.class)
	public void CreateSignup(String userfirstName, String userLastName, String EmailId, String password,
			String confirmpassword) throws InterruptedException {
		
		
		  IndexPage pgIndexPage=new IndexPage(driver);
		  pgIndexPage.ClickcreateAnAccBtn(); 
		  CreateAccountPage accountPage =new CreateAccountPage(driver);
		  accountPage.UserFirstNm(userfirstName);
		  accountPage.UserLastNm(userLastName);  
		  accountPage.UserEmailNm(EmailId); 
		  accountPage.UserPasswordNm(password); 
		  accountPage.UserConfirmPwdNm(confirmpassword);
		  accountPage.UserRegisteredBtn();
		  logger.info("create Account button is clicked");
		  logger.info("Signup verification is started"); 
		  CustomerDashBoard cdb=new CustomerDashBoard(driver);
		  Boolean boolean1 = cdb.DashBoardInfo();
		  Thread.sleep(4000); 
		  logger.info("The verify method Started"); 
		  if(boolean1) {
		  Assert.assertTrue(true); } 
		  else { Assert.assertTrue(false); } cdb.signout();
		  logger.info("The signup method ended");
		 
	}

	@Test(dataProvider = "logindetails",dataProviderClass = AlldataProviders.class)
	public void toVerifyLogin(String Email,String password) throws InterruptedException {
		logger.info("The login method started");
		CustomerDashBoard cdb = new CustomerDashBoard(driver);
		IndexPage ipgIndexPage = new IndexPage(driver);
		LoginPage lg = new LoginPage(driver);
		ipgIndexPage.signinbtnClick();
		lg.LoginEmail(Email);
		lg.LoginPassword(password);
		lg.LoginClick();
		Thread.sleep(3000);
		cdb.signout();
		logger.info("The login method ended");
	}

}
