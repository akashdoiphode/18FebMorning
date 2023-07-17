package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.UtilityClass;



public class LoginPage {
	Properties prop;
	FileInputStream fis;

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
	public void MobileNumber() throws IOException {
		/*prop=new Properties();
	  	fis=new FileInputStream("C:\\Users\\Akash\\eclipse-workspace\\18FebMorning\\loginDetails.properties");
		prop.load(fis);
		MobileNumber.sendKeys(prop.getProperty("mobNo"));*/
		MobileNumber.sendKeys(UtilityClass.readData(7, 1));
	}
	public void LoginWithPWD() {
		LoginWithPWD.click();
	}
	public void PasswordField() throws EncryptedDocumentException, IOException {
		prop=new Properties();
	  	fis=new FileInputStream("C:\\Users\\Akash\\eclipse-workspace\\18FebMorning\\loginDetails.properties");
		prop.load(fis);
		PasswordField.sendKeys(prop.getProperty("pwd"));
		
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
