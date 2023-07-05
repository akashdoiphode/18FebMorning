package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	@FindBy(xpath="//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")private WebElement validateName;

	public MyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
public void validateName() {
	String ActUName = validateName.getText();
	String ExUName="Akash Doiphode";
	if(ActUName.equals(ExUName)) {
		System.out.println("Tc is passed");
		}
	else {
		System.out.println("Tc is failed");
	}
}
}
