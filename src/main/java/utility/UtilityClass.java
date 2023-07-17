package utility;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.io.FileHandler;
	import org.testng.Reporter;

	public class UtilityClass {
		public static void thredWait(int time) throws InterruptedException {
			Thread.sleep(time);
		}
		
		public static void imlicitWait(WebDriver driver,long time) {
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		}
		
		
		public static void screenShot(WebDriver driver,String name) throws IOException {
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Akash\\Pictures\\Screenshots\\"+name+".png");
			FileHandler.copy(source,dest);
			Reporter.log("Taking screenshot..",true);
		}

		public static String readData(int row,int col) throws EncryptedDocumentException, IOException {
			FileInputStream myFile=new FileInputStream("E:\\testFile\\testers.xlsx");
			String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(row).getCell(col).getStringCellValue();
			Reporter.log("Reading data from excel sheet",true);
			return value;
			
		}
		
		public static void scrollIntoView(WebDriver driver,WebElement ele) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",ele);
			Reporter.log("scrolling to element",true);
		}
	}



