package base;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utility.UtilityClass;

public class Base {
	static protected WebDriver driver;
	public  static void openBrowser() throws EncryptedDocumentException, IOException {
		
		  driver =new ChromeDriver();	
		  driver.manage().window().maximize();
		  driver.get(UtilityClass.readData(4,1));
		 Reporter.log("launching browser",true);
		 }	
	public static void closeBrowser() {
		 
		 driver.close();
	}

}
