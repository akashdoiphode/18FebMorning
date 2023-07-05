package test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pom.LoginPage;
import pom.MyAccountPage;


public class PolicyBazarUserNameValidate extends Base{
	LoginPage lp;
	MyAccountPage ma;
	
	@BeforeClass
	public void openBrowser1() {
		
		openBrowser();	
		lp=new LoginPage(driver);
		ma=new MyAccountPage(driver);
	}
	@BeforeMethod
	
	public void loginToPolicy() throws InterruptedException {
		
		lp.HomePageSignInButton();
		Thread.sleep(1000);
		lp.MobileNumber();
		Thread.sleep(1000);
		lp.LoginWithPWD();
		Thread.sleep(1000);
		lp.PasswordField();
		Thread.sleep(1000);
		lp.SignInButton();
		Thread.sleep(1000);
		lp.MyAccount();
		Thread.sleep(1000);
		lp.MyProfile();
		Thread.sleep(1000);
		Set<String> aLLWId = driver.getWindowHandles();
		ArrayList<String> aI = new ArrayList<>(aLLWId);
		driver.switchTo().window(aI.get(1));
	}
	
  @Test
  public void f() {
	  
		ma.validateName();
	 	  
  }
  
  
  
}
