package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
import pageObjects.homePage;
import pageObjects.registarationPage;

public class TC01_accountRegTest extends baseclass {
	
	
@Test(groups = {"sanity","Master"})
public	void verifyAccountReg() {

	homePage hp=new homePage(driver);
	hp.clickMyaccount();
	hp.ClickRegister();
	
	registarationPage rg=new registarationPage(driver);
    rg.setFirstname(randomstring().toUpperCase());
    rg.setLastname(randomstring().toLowerCase());
    rg.setEmail(randomstring()+"@gmail.com");
    rg.setMbl(randomNumber());
    rg.setPwd(randomPwd());
    rg.setCfmpwd(randomPwd());
    rg.agree();
    rg.continue_Btn();  
}
	
}
