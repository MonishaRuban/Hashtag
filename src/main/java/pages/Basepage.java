package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class Basepage {
	public static WebDriver driver;
	String url = "https://www.hashtag-ca.com/careers/apply?jobCode=QAE001";
	
	@BeforeClass(alwaysRun=true)

		public void testsetup()
		
		 {
			 // This suppresses the Severe Timed out receiving messages
			 driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application.chromedriver.exe");
			
			driver.manage().window().maximize();
			driver.get(url);
			
		 }
	@AfterClass(alwaysRun=true)
	public void afterClass()
	{
//	driver.close();
		}


}
