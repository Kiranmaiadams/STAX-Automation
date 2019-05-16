package cucumberOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Test(threadPoolSize = 100)
@CucumberOptions(features = "src/test/java/TestCaseResources", glue = "StepDefinitions", plugin = {
		"pretty", "html:target/generated-report", "json:target/cucumber-report/cucumber.json" })

public class TestRunner extends AbstractTestNGCucumberTests {

	public static WebDriver STAXDriver = null;

	public static String url;

	@BeforeTest(alwaysRun=true)
	@Parameters("Application")
	public static synchronized void Test(String Application) throws IOException, InterruptedException {
		File file = new File("C:\\Automation\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--headless");
		STAXDriver = new ChromeDriver(options);
		STAXDriver.manage().window().maximize();
		STAXDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		url = Application;

		//InputStream input = new FileInputStream("utilities.properties");
		
		InputStream input = new FileInputStream("UtilitiesProd.properties");

		Properties prop = new Properties();

		prop.load(input);

		
		if (url.equalsIgnoreCase("Contiki_au")) {

			STAXDriver.navigate().to(prop.getProperty("Contiki_au"));
		}
		if (url.equalsIgnoreCase("Contiki_nz")) {

			STAXDriver.navigate().to(prop.getProperty("Contiki_nz"));
		}

		if (url.equalsIgnoreCase("Contiki_uk")) {

			STAXDriver.navigate().to(prop.getProperty("Contiki_uk"));
		}

		if (url.equalsIgnoreCase("Contiki_us")) {

			STAXDriver.navigate().to(prop.getProperty("Contiki_us"));
		}

		if (url.equalsIgnoreCase("GAdventures_au")) {

			STAXDriver.navigate().to(prop.getProperty("GAdventures_au"));
		}
		if (url.equalsIgnoreCase("GAdventures_nz")) {

			STAXDriver.navigate().to(prop.getProperty("GAdventures_nz"));
		}

		if (url.equalsIgnoreCase("GAdventures_uk")) {

			STAXDriver.navigate().to(prop.getProperty("GAdventures_uk"));
		}

		if (url.equalsIgnoreCase("GAdventures_us")) {

			STAXDriver.navigate().to(prop.getProperty("GAdventures_us"));
		}
		
		if (url.equalsIgnoreCase("Dragoman_au")) {

			STAXDriver.navigate().to(prop.getProperty("Dragoman_au"));
		}
		if (url.equalsIgnoreCase("Dragoman_nz")) {

			STAXDriver.navigate().to(prop.getProperty("Dragoman_nz"));
		}
		
		if (url.equalsIgnoreCase("Dragoman_uk")) {

			STAXDriver.navigate().to(prop.getProperty("Dragoman_uk"));
		}
		
		if (url.equalsIgnoreCase("Dragoman_us")) {

			STAXDriver.navigate().to(prop.getProperty("Dragoman_us"));
		}

		if (url.equalsIgnoreCase("1Source_au")) {

			STAXDriver.navigate().to(prop.getProperty("1Source_au"));
		}
		if (url.equalsIgnoreCase("1Source_nz")) {

			STAXDriver.navigate().to(prop.getProperty("1Source_nz"));
		}
		
		if (url.equalsIgnoreCase("1Source_uk")) {

			STAXDriver.navigate().to(prop.getProperty("1Source_uk"));
		}
		
		if (url.equalsIgnoreCase("1Source_us")) {

			STAXDriver.navigate().to(prop.getProperty("1Source_us"));
		}

		if (url.equalsIgnoreCase("TrekAmerica_au")) {

			STAXDriver.navigate().to(prop.getProperty("TrekAmerica_au"));
		}
		if (url.equalsIgnoreCase("TrekAmerica_nz")) {

			STAXDriver.navigate().to(prop.getProperty("TrekAmerica_nz"));
		}
		
		if (url.equalsIgnoreCase("TrekAmerica_uk")) {

			STAXDriver.navigate().to(prop.getProperty("TrekAmerica_uk"));
		}
		
		if (url.equalsIgnoreCase("TrekAmerica_us")) {

			STAXDriver.navigate().to(prop.getProperty("TrekAmerica_us"));
		}

		if (url.equalsIgnoreCase("GrandAmerica_au")) {

			STAXDriver.navigate().to(prop.getProperty("GrandAmerica_au"));
		}
		if (url.equalsIgnoreCase("GrandAmerica_nz")) {

			STAXDriver.navigate().to(prop.getProperty("GrandAmerica_nz"));
		}
		
		if (url.equalsIgnoreCase("GrandAmerica_uk")) {

			STAXDriver.navigate().to(prop.getProperty("GrandAmerica_uk"));
		}
		
		if (url.equalsIgnoreCase("GrandAmerica_us")) {

			STAXDriver.navigate().to(prop.getProperty("GrandAmerica_us"));
		}

		if (url.equalsIgnoreCase("Radical_au")) {

			STAXDriver.navigate().to(prop.getProperty("Radical_au"));
		}
		if (url.equalsIgnoreCase("Radical_nz")) {

			STAXDriver.navigate().to(prop.getProperty("Radical_nz"));
		}
		
		if (url.equalsIgnoreCase("Radical_uk")) {

			STAXDriver.navigate().to(prop.getProperty("Radical_uk"));
		}
		
		if (url.equalsIgnoreCase("Radical_us")) {

			STAXDriver.navigate().to(prop.getProperty("Radical_us"));
		}	

		
		System.out.println(url);
		Thread.sleep(20000);
		try {
			STAXDriver.findElement(By.id("sta-cookie-save-all-button")).click();
		}
		catch(Exception e) {
			System.out.println("Cookies already accepted");
		}
	}

	
	
	@AfterTest
	public void tearDown() {
		//STAXDriver.quit();
	}

}