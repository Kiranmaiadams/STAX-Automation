package Implementations;

import cucumberOptions.TestRunner;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Interfaces.Login;
import Interfaces.Tours;

public class ToursImpl extends TestRunner implements Tours {

	@Override
	public void SelectLowestPriceTour() {
		STAXDriver.findElement(By.id("sortSelect")).sendKeys("Price (Low-High)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		STAXDriver.findElement(By.xpath("//*[@id=\"results-flex-grid\"]/div[2]/div[1]/div/a/img")).click();
		
		//*[@id="products"]/div[1]/div/div[1]/a/img
	}

	@Override
	public void SelectRandomTour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SelectHighestPriceTour() {
		STAXDriver.findElement(By.id("sortSelect")).sendKeys("Price (Low-High)");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		STAXDriver.findElement(By.id("sortSelect")).sendKeys("Price (High-Low)");
		
		//STAXDriver.findElement(By.id("sortSelect")).sendKeys("Price (High-Low)");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		STAXDriver.findElement(By.xpath("//*[@id=\"results-flex-grid\"]/div[3]/div[1]/div/a/img")).click();

	}

	@Override
	public void ClickNeedMoreTimeRB() {
		STAXDriver.findElement(By.xpath("//input[@type='radio']")).click();
			
		
	}
	
}