package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MyAccountPage;
import pageObjects.homePage;
import pageObjects.loginPage;

public class TC02_Login extends baseclass{
	
	@Test(groups = {"regression","Master"})
	public void verifyLogin() {
		try {
		homePage hp=new homePage(driver);
		
		hp.clickMyaccount();
		hp.clickLogin();
		
		loginPage lp=new loginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("pass"));
		lp.ligin();
		
		MyAccountPage my=new MyAccountPage(driver);
		
boolean	targetPage=	my.isMyAccountExists();
	Assert.assertEquals(targetPage, true);
	Assert.assertTrue(targetPage);
	
		}catch (Exception e) {
			Assert.fail();
			// TODO: handle exception
		}
	}
	

	
}
