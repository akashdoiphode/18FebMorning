package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	static protected WebDriver driver;
	public  static void openBrowser() {
		ChromeOptions opt = new ChromeOptions();
		 opt.addArguments("disable notification");
		  driver =new ChromeDriver(opt);	
		 driver.manage().window().maximize();
		 driver.get("https://www.policybazaar.com/");
		 
	}	
	public static void closeBrowser() {
		 
		 driver.close();
	}

}
