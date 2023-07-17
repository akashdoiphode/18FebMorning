package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.apache.poi.EncryptedDocumentException;
import base.Base;
import dataProvider.DataProviderClass;
import pom.LoginPage;
import pom.MyAccountPage;
import utility.UtilityClass;

@Listeners(listener.Listener.class)
public class PolicyBazarUserNameValidate extends Base {
	LoginPage lp;
	MyAccountPage ma;
	Properties prop;
	FileInputStream fis;

	@BeforeClass
	public void openBrowser1() throws EncryptedDocumentException, IOException {
		
		openBrowser();	
		lp=new LoginPage(driver);
		ma=new MyAccountPage(driver);
	}
	@BeforeMethod
	
	public void loginToPolicy() throws InterruptedException, IOException {
		UtilityClass.imlicitWait(driver,1000);
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
		Thread.sleep(2000);
		lp.MyProfile();
		Thread.sleep(1000);
		Set<String> aLLWId = driver.getWindowHandles();
		ArrayList<String> aI = new ArrayList<>(aLLWId);
		driver.switchTo().window(aI.get(1));
	}
	
  @Test(dataProvider="policyBazarData",dataProviderClass=DataProviderClass.class)
  public void verifyUserName(String ExpUname ) throws EncryptedDocumentException, IOException {

		//String ExpUname=UtilityClass.readData(1,1);
	
	  	/*data provided using properties file
	  	 * prop=new Properties();
	  	fis=new FileInputStream("C:\\Users\\Akash\\eclipse-workspace\\18FebMorning\\loginDetails.properties");
		prop.load(fis);
	   String ExpUname=prop.getProperty("UN");*/
	 	String actuname= ma.validateName();
	 	Assert.assertEquals(actuname,ExpUname,"fail");
		
		
  }
  @AfterMethod
  
  public void afterMethod() {
	  UtilityClass.imlicitWait(driver,3000);
	  ma.logOutButton();
  }
  @AfterClass
  public void aa() throws InterruptedException {
	  Thread.sleep(2000);
	  closeBrowser();
  }
  
  
}
