package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends BasePage {
	
	WebDriver driver;
	
	public homePage(WebDriver driver) {
		super(driver);
	}
	
@FindBy(xpath="(//span[normalize-space()='My Account'])[1]")  WebElement myAccount_Link;
@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")  WebElement login_Link;
@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']") WebElement register_Link;


public void clickMyaccount() {
	myAccount_Link.click();
		
}

public void ClickRegister() {
	register_Link.click();
}

public void clickLogin() {
	login_Link.click();
}
}
