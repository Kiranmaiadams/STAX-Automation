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
		STAXDriver.findElement(By.xpath("//*[@id=\"products\"]/div[1]/div/div[1]/a/img")).click();
		
		//*[@id="products"]/div[1]/div/div[1]/a/img
	}

	@Override
	public void SelectRandomTour() {
		// TODO Auto-generated method stub
		
	}
	
}