package pageObjects;

import org.apache.commons.collections4.keyvalue.AbstractMapEntry;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	

@FindBy(xpath="//h2[normalize-space()='My Account']")  WebElement MsgHeading;



public boolean isMyAccountExists() {
	 try {
return	MsgHeading.isDisplayed();
	 }catch (Exception e) {
		 return false;
		// TODO: handle exception
	}
}

}
