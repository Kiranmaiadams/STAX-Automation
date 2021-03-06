package Implementations;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.helpers.LogLog;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Interfaces.HomePage;
import cucumberOptions.TestRunner;
import javafx.scene.control.SplitPane.Divider;

public class HomePageImpl extends TestRunner implements HomePage {

	String priceXpath = "//span[contains(@class,'trip-price-inner ng-binding')]";

	String daysXpath = "//span[@class='trip-days ng-binding']";

	String TourCountInLabel = "//span[@class='ng-binding']";

	JavascriptExecutor js = (JavascriptExecutor) STAXDriver;

	public String SelectSortOption(String SortOption) throws InterruptedException {
		Thread.sleep(10000);
		STAXDriver.findElement(By.id("sortSelect")).sendKeys(SortOption);

		Thread.sleep(10000);
		return SortOption;
	}

	@Override
	public void VerifySortResults(String SortOption) {
		ArrayList<Integer> obtainedList = new ArrayList<>();

		STAXDriver.findElement(By.xpath(priceXpath)).click();
		List<WebElement> elementList = STAXDriver.findElements(By.xpath(priceXpath));

		if (SortOption.equalsIgnoreCase("Price (Low-High)") || SortOption.equalsIgnoreCase("Price (High-Low)")) {
			for (WebElement we : elementList) {
				String value = we.getText();
				String intValue = value.replaceAll("[^0-9]", "");
				int Price = Integer.parseInt(intValue);
				obtainedList.add(Price);
				// System.out.println(intValue);
			}
		}
		ArrayList<Integer> sortedList = new ArrayList<>();
		for (Integer s : obtainedList) {
			sortedList.add(s);
		}

		
		if (SortOption.equalsIgnoreCase("Price (Low-High)")) {
			Collections.sort(sortedList);
			if (obtainedList.equals(sortedList)) {
				System.out.println(SortOption + " is Sorted Properly");
			} else {
				System.out.println(obtainedList);
				System.out.println(sortedList);
				LogLog.error("Not Sorted Properly");
			}
		}

		if (SortOption.equalsIgnoreCase("Price (High-Low)")) {
			Collections.sort(sortedList, Collections.reverseOrder());
			if (obtainedList.equals(sortedList)) {
				System.out.println(SortOption + " is Sorted Properly");
			} else {
				LogLog.error("Not Sorted Properly");
			}

		}

	}

	@Override
	public void VerifySortResultsPerDay(String SortOption) {

		ArrayList<Integer> PriceObtainedList = new ArrayList<>();
		ArrayList<Integer> DaysObtainedList = new ArrayList<>();

		List<WebElement> PriceList = STAXDriver.findElements(By.xpath(priceXpath));
		List<WebElement> DaysList = STAXDriver.findElements(By.xpath(daysXpath));

		int a = STAXDriver.findElements(By.xpath(priceXpath)).size();
		int b = STAXDriver.findElements(By.xpath(daysXpath)).size();

		System.out.println("a & b values are:" + a + "       " + b);

		for (WebElement we1 : PriceList) {
			String value = we1.getText();
			String intValue = value.replaceAll("[^0-9]", "");
			int Price = Integer.parseInt(intValue);
			PriceObtainedList.add(Price);
			// System.out.println(intValue);
		}

		for (WebElement we2 : DaysList) {
			String value = we2.getText();
			String intValue = value.replaceAll("[^0-9]", "");
			int Days = Integer.parseInt(intValue);
			DaysObtainedList.add(Days);
			// System.out.println(intValue);
		}

		// System.out.println(PriceObtainedList);
		// System.out.println(DaysObtainedList);

		ArrayList<Integer> ObtainedPricePerDay = new ArrayList<>();

		for (int x = 0; x < PriceObtainedList.size(); x++) {

			for (int j = 0; j < DaysObtainedList.size(); j++) {
				if (x == j) {
					int result = PriceObtainedList.get(x) / DaysObtainedList.get(j);
					ObtainedPricePerDay.add(result);
				}
			}
		}

		// System.out.println(ObtainedPricePerDay);

		ArrayList<Integer> sortList = new ArrayList<>();
		for (Integer s : ObtainedPricePerDay) {
			sortList.add(s);
		}

		ArrayList<Integer> sortDaysList = new ArrayList<>();
		for (Integer s : DaysObtainedList) {
			sortDaysList.add(s);
		}

		if (SortOption.equalsIgnoreCase("Price/Day(Low-High)")) {
			Collections.sort(sortList);
			if (ObtainedPricePerDay.equals(sortList)) {
				System.out.println(SortOption + " is Sorted Properly");
			} else {
				System.out.println("The original list is : ");
				System.out.println(ObtainedPricePerDay);
				System.out.println("The Sorted list is : ");
				System.out.println(sortList);
				LogLog.error(SortOption + "Not Sorted Properly");
			}
		}

		if (SortOption.equalsIgnoreCase("Price/Day(High-Low)")) {
			Collections.sort(sortList, Collections.reverseOrder());
			if (ObtainedPricePerDay.equals(sortList)) {
				System.out.println(SortOption + " is Sorted Properly");
			} else {
				System.out.println("The original list is : ");
				System.out.println(ObtainedPricePerDay);
				System.out.println("The Sorted list is : ");
				System.out.println(sortList);
				LogLog.error(SortOption + "Not Sorted Properly");
			}

		}

		if (SortOption.equalsIgnoreCase("Duration(Lowest)")) {
			Collections.sort(sortDaysList);
			if (DaysObtainedList.equals(sortDaysList)) {
				System.out.println(SortOption + " is Sorted Properly");
			} else {
				LogLog.error(SortOption + "Not Sorted Properly");
			}
		}

	}

	@Override
	public void VerifyDefaultResultsCountInHomePage() {
		String ResultsInLabel = STAXDriver.findElement(By.xpath(TourCountInLabel)).getText();
		int TotalResults = STAXDriver.findElements(By.xpath("//div[@id='products']/div")).size();

		System.out.println("The value displayed in the Label is: " + ResultsInLabel);
		System.out.println("The Totatl number of products displayed are: " + TotalResults);
		int valueInLabel = Integer.parseInt(ResultsInLabel);
		System.out.println("The value displayed in the Label is: " + valueInLabel);

		if (valueInLabel >= 36) {
			if (TotalResults == 36) {
				System.out.println("Results displayed correctly");
			} else {
				LogLog.error("Error in Result Display Count");
			}
		}

		if (valueInLabel < 36) {
			if (TotalResults == valueInLabel) {
				System.out.println("Results displayed correctly");
			} else {
				LogLog.error("Error in Result Display Count");
			}
		}

	}

	@Override
	public void VerifyViewMoreButton() throws InterruptedException {

		while (STAXDriver.findElement(By.id("btnViewMore")).isDisplayed()) {
			Thread.sleep(2000);
			System.out.println("In loop");
			STAXDriver.findElement(By.id("btnViewMore")).click();
			Thread.sleep(2000);

		}

		System.out.println("out of loop");

	}

	@Override
	public void VerifyViewMoreResults() {

		String ResultsLabelDisplayed = STAXDriver.findElement(By.xpath(TourCountInLabel)).getText();
		System.out.println("Results hidden :  " + ResultsLabelDisplayed);

		int TotalResults = STAXDriver.findElements(By.xpath("//div[@id='results-flex-grid']/div")).size();

		System.out.println(ResultsLabelDisplayed);
		System.out.println("The value displayed in the Label is: " + ResultsLabelDisplayed);
		System.out.println("The Totatl number of products displayed are: " + TotalResults);
		int valueInLabel = Integer.parseInt(ResultsLabelDisplayed);
		System.out.println("The value displayed in the Label is: " + valueInLabel);

		while (TotalResults != valueInLabel) {
			int TotalResults1 = TotalResults;
			// System.out.println("TotalResults1: " +TotalResults1);
			System.out.println("TotalResults1: " + TotalResults);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Actions action = new Actions(STAXDriver);

			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			System.out.println("In loop");
			TotalResults = STAXDriver.findElements(By.xpath("//div[@id='results-flex-grid']/div")).size();
			System.out.println("TotalResults2: " + TotalResults);

			if (TotalResults1 == TotalResults) {
				action.sendKeys(Keys.PAGE_UP).build().perform();
			}

		}

		if (TotalResults == valueInLabel) {
			System.out.println("Results displayed correctly");
		} else {
			LogLog.error("Error in Result Display Count");
		}

	}

	@Override
	public void ClickReset() {
		// TODO Auto-generated method stub
		String ResultsLabelDisplayed = STAXDriver.findElement(By.id("lblTotalSearchResult")).getText();

		String value = ResultsLabelDisplayed;
		String intValue = value.replaceAll("[^0-9]", "");
		System.out.println("The value displayed in the Label is: " + intValue);
		int valueInLabel = Integer.parseInt(intValue);

		if (valueInLabel > 36) {
			STAXDriver.findElement(By.id("btnReset")).click();
		} else {

		}
	}

	@Override
	public void userSearchesonAutoSearch(String SearchString) {
		STAXDriver.findElement(By.id("txtSearch")).sendKeys(SearchString);

	}

	//@Override
	@org.testng.annotations.Test
	public void userSearchesCountryFromAutoSearch(String Country) {
		
		
		String CXpath = "//li[contains(text(),'" + Country + "')]";
		
		
		
		
		
		STAXDriver.findElement(By.xpath(CXpath)).click();

	}

	@Override
	public void UserScrollTillTheResetButtonIsFound() throws InterruptedException {

	}

	@Override
	public void VerifyCountOfTours() {
		try {
		String ResultsLabelDisplayed = STAXDriver.findElement(By.xpath(TourCountInLabel)).getText();
		int valueInLabel = Integer.parseInt(ResultsLabelDisplayed);
        if(valueInLabel>20 && valueInLabel<900) {
			System.out.println("Tours display is proper");
		}
        else {
        	if(valueInLabel<20) {
        
			LogLog.error("Tour count is less than 20, This supplier needs cross checking");
		}
        	else {
            	if(valueInLabel>1000) {
    			LogLog.error("Looks like All thr suppliers tours are displayed");
            }
            }
        }
        
		}
		catch(Exception e) {
			LogLog.error("No tours");
        	STAXDriver.findElement(By.id("No Element")).getText();
		}
		
		
		
	}
}
