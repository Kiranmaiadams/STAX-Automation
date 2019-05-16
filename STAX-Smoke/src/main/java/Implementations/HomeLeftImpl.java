package Implementations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Interfaces.HomeLeft;
import cucumberOptions.TestRunner;

public class HomeLeftImpl extends TestRunner implements HomeLeft {

	@Override
	public void SelectToursWithPromotions() {
		STAXDriver.findElement(By.id("chkPromotion")).click();
	}

	@Override
	public void VerifyToursWithPromotionsCount() {
		String Count = STAXDriver.findElement(By.id("divTotPromotion")).getText();
		String ResultsLabelDisplayed = STAXDriver.findElement(By.id("lblTotalSearchResult")).getText();
		String intValue = ResultsLabelDisplayed.replaceAll("[^0-9]", "");
		System.out.println(ResultsLabelDisplayed);
		System.out.println("The value displayed in the Label is: " + intValue);
		int valueInLabel = Integer.parseInt(intValue);
		int PromCount = Integer.parseInt(Count);
		if(valueInLabel==PromCount){			
			System.out.println("Results Match Properly");
		}
		else{
			System.out.println("Results Doesn't Match Properly");
			STAXDriver.findElement(By.id("NoIDPresent")).click();
		}
		
		List<WebElement> elementList = STAXDriver.findElements(By.xpath(""));
		
		
	}

	@Override
	public void VerifyTourPromotionsContent() {

	}

	@Override
	public void SetPricePerTrip() {
		
		WebElement slider = STAXDriver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		Actions move = new Actions(STAXDriver);
		Action action = (Action) move.dragAndDropBy(slider, 60, 0).build();
		action.perform();

	}

	@Override
	public void MovePriceSliderToRight() throws InterruptedException {
		System.out.println("Right Slide");
		WebElement slider = STAXDriver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		Actions move = new Actions(STAXDriver);
		Action action = (Action) move.dragAndDropBy(slider, 10, 0).build();
		action.perform();
		Thread.sleep(3000);
	
		
	}

	@Override
	public void MovePriceSliderToLeft() {
		System.out.println("Left Slide");
		WebElement slider = STAXDriver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		Actions move = new Actions(STAXDriver);
		Action action = (Action) move.dragAndDropBy(slider, -50, 0).build();
		action.perform();
		
	}

	@Override
	public void VerifyLowestPriceAccordingToSlider() {
		String PriceRange = STAXDriver.findElement(By.id("amount")).getAttribute("value");
		System.out.println("The price range is : " +PriceRange);
		String[] words=PriceRange.split("\\s");
		int LowPrice = Integer.parseInt(words[0].replaceAll("[^0-9]", ""));
		
		STAXDriver.findElement(By.id("sortSelect")).sendKeys("Price (Low-High)");
		String priceXpath = "//span[contains(@class,'trip-price-inner')]";
		String Price = STAXDriver.findElement(By.xpath(priceXpath)).getText();
		int ListPrice = Integer.parseInt(Price.replaceAll("[^0-9]", ""));
		System.out.println("The price is  "+ListPrice);
		if(ListPrice>=LowPrice) {
			System.out.println("Price is displayed properly");
		}
		
	}

	@Override
	public void VerifyHighestPriceAccordingToSlider() {
		String PriceRange = STAXDriver.findElement(By.id("amount")).getAttribute("value");
		System.out.println("The price range is : " +PriceRange);
		String[] words=PriceRange.split("\\s");
		int HighPrice = Integer.parseInt(words[2].replaceAll("[^0-9]", ""));
		STAXDriver.findElement(By.id("sortSelect")).sendKeys("Price (High-Low)");
		String priceXpath = "//span[contains(@class,'trip-price-inner')]";
		String Price = STAXDriver.findElement(By.xpath(priceXpath)).getText();
		int ListPrice = Integer.parseInt(Price.replaceAll("[^0-9]", ""));
		System.out.println("The price is  "+ListPrice);
		if(ListPrice<=HighPrice) {
			System.out.println("Price is displayed properly");
		}
		
	}

}
