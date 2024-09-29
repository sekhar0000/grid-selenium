package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registarationPage extends BasePage {
	
	WebDriver driver;
	
	public registarationPage(WebDriver driver) {
		super(driver);
	}
	

@FindBy(xpath="//input[@id='input-firstname']")  WebElement txt_firstName;
@FindBy(xpath="//input[@id='input-lastname']")  WebElement txt_lastName;
@FindBy(xpath="//input[@id='input-email']")  WebElement txt_email;
@FindBy(xpath="//input[@id='input-telephone']")  WebElement telephone;
@FindBy(xpath="//input[@id='input-password']")  WebElement txt_password;
@FindBy(xpath="//input[@id='input-confirm']")  WebElement txt_passwordConfirm;
@FindBy(xpath="//input[@name='agree']")  WebElement agree;

@FindBy(xpath="//input[@id='input-telephone']")  WebElement continueBtn;

public void setFirstname(String Fname) {
	
	txt_firstName.sendKeys(Fname);
}

public void setLastname(String Lname) {
	txt_lastName.sendKeys(Lname);
}

public void setEmail(String email) {
	txt_email.sendKeys(email);
}
public void setMbl(String mbl) {
	telephone.sendKeys(mbl);
}
public void setPwd(String pwd) {
	txt_password.sendKeys(pwd);
}
public void setCfmpwd(String Cpwd) {
	txt_passwordConfirm.sendKeys(Cpwd);
}
public void agree() {
	agree.click();
}
public void continue_Btn() {
	continueBtn.click();
}
}
