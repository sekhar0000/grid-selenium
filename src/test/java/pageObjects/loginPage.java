package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage {
	
	public loginPage(WebDriver driver) {
		super(driver);
	}
	


@FindBy(xpath="//input[@id='input-email']")  WebElement txt_email;
@FindBy(xpath="//input[@id='input-password']")  WebElement txt_password;
@FindBy(xpath="//input[@value='Login']")  WebElement login_btn;



public void setEmail(String email ) {
	txt_email.sendKeys(email);
}
public void setPassword(String pwd) {
	txt_password.sendKeys(pwd);
}
public void ligin() {
	login_btn.click();
}
}
