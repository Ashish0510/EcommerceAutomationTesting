package AllTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import Utility.ReadFiles;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;

public class BaseClassTest {
	public static WebDriver driver;
	public static Logger logger;



	ReadFiles readFiles = new ReadFiles();
	String Basebrowser = readFiles.getBaseBrowser();
	String Baseurl = readFiles.getBaseUrl();

	@BeforeClass
	public void LaunchBrowser() throws IOException {

		switch (Basebrowser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			driver = null;
			break;

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger = LogManager.getLogger(BaseClassTest.class.getName());
		driver.get(Baseurl);
		
		
	}

     @AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
     
   

}
