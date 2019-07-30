package Implementations;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Interfaces.BookNow;
import cucumberOptions.TestRunner;

public class BookNowImpl extends TestRunner implements BookNow{

	@Override
	public String ClickBookNow() {
		
		  Set<String> handles = STAXDriver.getWindowHandles();
		  
		  Iterator itr = handles.iterator(); String parent_window = (String)
		  itr.next(); System.out.println(parent_window + "....." +
		  STAXDriver.getTitle());
		  
		  String child_window = (String) itr.next();
		  STAXDriver.switchTo().activeElement();
		  STAXDriver.switchTo().window(child_window);
		  
		  WebDriverWait wait = new WebDriverWait(STAXDriver, 20);
		 
		
	 	 // String TourFinalPrice=STAXDriver.findElement(By.xpath("//span[@class='b-price']")).getText();
			STAXDriver.findElement(By.xpath("//a[@class='btn-sta btn-primary btn-book']")).click();
			
			//System.out.println("The tour price is: " + TourFinalPrice);
		return null;
	}

	@Override
	public void ClickContinue() {
		//STAXDriver.findElement(By.xpath("//a[contains(.,'Continue')]")).click();
		WebElement element = STAXDriver.findElement(By.xpath("//a[contains(.,'Continue')]"));

		Actions actions = new Actions(STAXDriver);

		actions.moveToElement(element).click().perform();
		
	}

	@Override
	public void selectPayDepositAmount() {
		WebElement element = STAXDriver.findElement(By.xpath("//p[contains(.,'Pay deposit')]"));

		Actions actions = new Actions(STAXDriver);

		actions.moveToElement(element).click().perform();
		
	}
	
	@Override
	public void selectPayFullAmount() {
		STAXDriver.findElement(By.xpath("//p[contains(.,'Pay full amount')]")).click();	
	}

	@Override
	public void EnterPassengerDetails() {
		STAXDriver.findElement(By.id("txtAFirstName_0")).sendKeys("Test");
		STAXDriver.findElement(By.id("txtALastName_0")).sendKeys("Automation");
		STAXDriver.findElement(By.id("ddlDOBADate_0")).sendKeys("10");
		STAXDriver.findElement(By.id("ddlDOBAMonth_0")).sendKeys("9");
		STAXDriver.findElement(By.id("ddlDOBAYear_0")).sendKeys("1992");
		STAXDriver.findElement(By.id("txtPhoneNo")).sendKeys("01234567899");
		STAXDriver.findElement(By.id("txtEmailAddress")).sendKeys("kiranmai.adams@statravel.com");
		
		
	}

	@Override
	public void EnterValidCardDetails() {
		STAXDriver.findElement(By.id("txtCardName")).sendKeys("Test QA");
		STAXDriver.findElement(By.id("txtCardNumber")).sendKeys("4111111111111111");
		STAXDriver.findElement(By.xpath("//*[@id=\"ddlExpirationMonth\"]/option[9]")).click();
		STAXDriver.findElement(By.xpath("//*[@id=\"ddlExpirationYear\"]/option[4]")).click();
		
			
			STAXDriver.findElement(By.id("txtSecurityCode")).sendKeys("111");
			
		}
			
		
		
		//STAXDriver.findElement(By.id("divddlExpirationMonth")).sendKeys("8");
		
		
		
	

	@Override
	public void EnterBillingDetails() {
		STAXDriver.findElement(By.id("txtBillingStreet")).sendKeys("TestStreet");
		STAXDriver.findElement(By.id("txtBillingCity")).sendKeys("TestCity");
		try {
	STAXDriver.findElement(By.id("txtState")).sendKeys("TestState");
		}
		catch(Exception e) {
			System.out.println("State is Dropdown");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		STAXDriver.findElement(By.id("txtZipCode")).sendKeys("TestZip00");
	}

	@Override
	public void AcceptBookingTerms() {
		STAXDriver.findElement(By.id("chkCancellationPolicy")).click();
		STAXDriver.findElement(By.id("chkTermsofService")).click();
		
	}

	@Override
	public void ClickBookAtCheckOut() {
		STAXDriver.findElement(By.xpath("//input[@value='Book Now!']")).click();	
	}

	@Override
	public void ClickHoldRequest() {
		STAXDriver.findElement(By.xpath("//input[@value='Hold Request']")).click();
		
	}

}
