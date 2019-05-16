package utilities;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;

public class TestBase {

	static String applicationURL = "http://staybeta.bluee.net/login?username=staycbegbcbg&password=cbeuser";

	

	public static String url;
	
	
	
	
	 
	
	@BeforeTest
	@Parameters({"param"})
	public static void Test(String param) {
		 url=param;
	}
	
	// This method is used to Launch the application
	

	public void openUrl() {
		System.out.println(url);
		
		

        } 
	
	
  
	
	
	
	@Test(dataProvider = "intiDriver(String param)")
	public void launchApplication() {
		
		//System.out.println("Param:"+ param);
			//if (value.equalsIgnoreCase("Google")) {
			//	STAXDriver.navigate().to("https://www.google.com");
			//	STAXDriver.navigate().to(url);	            
		//}
		System.out.println("Try Again");
		
	}
	
	

	// This method is used to close the driver
	public void quitDriver() {
		//STAXDriver.quit();
	}

}
