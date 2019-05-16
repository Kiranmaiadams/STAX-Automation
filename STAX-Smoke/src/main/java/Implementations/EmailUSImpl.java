package Implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Interfaces.EmailUs;
import cucumber.deps.com.thoughtworks.xstream.io.xml.StaxDriver;
import cucumberOptions.TestRunner;
import java.util.Iterator;
import java.util.Set;

public class EmailUSImpl extends TestRunner implements EmailUs {

	@Override
	public void ClickEmailUs() {
		
		 Set<String> handles = STAXDriver.getWindowHandles();

 	   Iterator itr = handles.iterator();
 	    String parent_window = (String) itr.next();
 	    System.out.println(parent_window + "....." + STAXDriver.getTitle());
		
 	   String child_window = (String) itr.next();
 	  STAXDriver.switchTo().activeElement();
 	    STAXDriver.switchTo().window(child_window);
 	    
 	   WebDriverWait wait = new WebDriverWait(STAXDriver, 20);
 	  wait.until(ExpectedConditions.visibilityOf(STAXDriver.findElement(By.xpath("//a[@class='emailPopUp btn-sta btn-email']")))); 
 	  wait.until(ExpectedConditions.elementToBeClickable(STAXDriver.findElement(By.xpath("//a[@class='emailPopUp btn-sta btn-email']"))));
		STAXDriver.findElement(By.xpath("//a[@class='emailPopUp btn-sta btn-email']")).click();		
	}

	@Override
	public void EnterEmailDetails() {
		STAXDriver.findElement(By.id("txteffirstname")).sendKeys("Test");
		STAXDriver.findElement(By.id("txteflastname")).sendKeys("Automation");
		STAXDriver.findElement(By.id("txtefemail")).sendKeys("kiranmai.adams@statravel.com");
		STAXDriver.findElement(By.id("txtefphone")).sendKeys("01234567889");		
	}

	@Override
	public void ClickSendMyEmail() {
		STAXDriver.findElement(By.id("btnSubmit")).click();
		
	}

	@Override
	public void VerifyEmailSentText() {
		STAXDriver.getPageSource().contains("Thank you for your enquiry");
		STAXDriver.getPageSource().contains("We will be in touch shortly");
	}

	@Override
	public void CloseEmailPopup() {
		STAXDriver.findElement(By.xpath("//div/a[contains(.,'Close')]")).click();
		
	}

}
