package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//a[text()='Sign in']")private WebElement HomePageSignInButton;
	
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement MobileNumber;
	
	@FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]")private WebElement LoginWithPWD;
	
	@FindBy(xpath="//input[@name='password']")private WebElement PasswordField;
	
	@FindBy(xpath="//a[@class='cl-btn sr-btn-primary']")private WebElement SignInButton;
	
	@FindBy(xpath="//div[@class='userprofile']")private WebElement MyAccount;
	
	@FindBy(xpath="//span[text()=' My profile ']")private WebElement MyProfile;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void HomePageSignInButton() {
		HomePageSignInButton.click();
	}
	public void MobileNumber() {
		MobileNumber.sendKeys("9850005857");
	}
	public void LoginWithPWD() {
		LoginWithPWD.click();
	}
	public void PasswordField() {
		PasswordField.sendKeys("Policy@6");
		}
	public void SignInButton() {
		SignInButton.click();
	}
	public void MyAccount() {
		MyAccount.click();
	}
	public void MyProfile() {
		MyProfile.click();
	}
}
