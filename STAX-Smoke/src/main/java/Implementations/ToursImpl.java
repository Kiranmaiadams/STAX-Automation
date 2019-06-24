package Implementations;

import cucumberOptions.TestRunner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Interfaces.Login;
import Interfaces.Tours;

public class ToursImpl extends TestRunner implements Tours {

	@Override
	public void SelectLowestPriceTour() {
		STAXDriver.findElement(By.id("sortSelect")).sendKeys("Price (Low-High)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		STAXDriver.findElement(By.xpath("//*[@id=\"results-flex-grid\"]/div[1]/div[1]/div/a/img")).click();
		
		//*[@id="products"]/div[1]/div/div[1]/a/img
	}

	@Override
	public void SelectRandomTour() {
		// TODO Auto-generated method stub
		
	}
	
}