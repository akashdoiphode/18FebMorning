package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyAccountPage {
	
	@FindBy(xpath="//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")private WebElement validateName;
	@FindBy(xpath="//div[@title='Logout']")private WebElement logout;
	public MyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
 public String validateName() {
	String ActUname = validateName.getText();
	return ActUname;
	}
public void logOutButton() {
	logout.click();
}

}

