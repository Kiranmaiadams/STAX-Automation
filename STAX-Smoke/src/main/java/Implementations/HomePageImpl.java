package Implementations;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.helpers.LogLog;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Interfaces.HomePage;
import cucumberOptions.TestRunner;

public class HomePageImpl extends TestRunner implements HomePage {

	public String SelectSortOption(String SortOption) throws InterruptedException {
		Thread.sleep(10000);
		STAXDriver.findElement(By.id("sortSelect")).sendKeys(SortOption);
		Thread.sleep(5000);
		/*
		 * String OptionXpath = "//*[@id='sortSelect']/option[contains(.,'" + SortOption
		 * + "')]"; //*[@id="sortSelect"]/option[1]
		 * STAXDriver.findElement(By.xpath(OptionXpath)).click();
		 */
		return SortOption;
	}

	@Override
	public void VerifySortResults(String SortOption) {
		ArrayList<Integer> obtainedList = new ArrayList<>();

		String priceXpath = "//span[contains(@class,'trip-price-inner')]";
		STAXDriver.findElement(By.xpath(priceXpath)).click();
		List<WebElement> elementList = STAXDriver.findElements(By.xpath(priceXpath));

		if (SortOption.equalsIgnoreCase("Price (Low-High)") || SortOption.equalsIgnoreCase("Price (High-Low)")) {
			for (WebElement we : elementList) {
				String value = we.getText();
				String intValue = value.replaceAll("[^0-9]", "");
				int Price = Integer.parseInt(intValue);
				obtainedList.add(Price);
				System.out.println(intValue);
			}
		}
		ArrayList<Integer> sortedList = new ArrayList<>();
		for (Integer s : obtainedList) {
			sortedList.add(s);
		}
		// Sort in Ascending Order (Price High-Low)
		Collections.sort(sortedList);
		System.out.println(sortedList);

		// Sort in Descending Order (Price High-Low)
		Collections.sort(sortedList, Collections.reverseOrder());
		System.out.println(sortedList);

	}

	@Override
	public void VerifySortResultsPerDay(String SortOption) {
		ArrayList<String> obtainedList = new ArrayList<>();
		ArrayList<String> obtainedList1 = new ArrayList<>();

		// String testPrice = "//div[@class='act-rating']/*/span";
		String priceXpath = "//span[contains(@class,'trip-price-inner')]";

		String daysXpath = "//span[@class='trip-days']";

		List<WebElement> elementList = STAXDriver.findElements(By.xpath(priceXpath));
		List<WebElement> elementList1 = STAXDriver.findElements(By.xpath(daysXpath));

		int a = STAXDriver.findElements(By.xpath(priceXpath)).size();
		int b = STAXDriver.findElements(By.xpath(daysXpath)).size();

		System.out.println("a & b values are:" + a + "       " + b);

		for (WebElement we1 : elementList) {
			// System.out.println(we1.getText());
			obtainedList.add(we1.getText());
		}
		ArrayList<String> sortedList = new ArrayList<>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}

		for (WebElement we2 : elementList1) {
			obtainedList1.add(we2.getText());

		}

		System.out.println(obtainedList);
		System.out.println(obtainedList1);

		/*
		 * for(int i=1; i<=a && i<=b; i++) {
		 * System.out.println(elementList.get(i).getText());
		 * System.out.println(elementList1.get(i).getText()); }
		 */
		// if (SortOption.equalsIgnoreCase("Price (Low-High)") ||
		// SortOption.equalsIgnoreCase("Price (High-Low)")) {
		for (WebElement we : elementList) {

			String value = we.getText();
			String Testvalue = we.findElement(By.xpath(daysXpath)).getText();

			// System.out.println(Testvalue);

			/*
			 * WebElement parent = we.findElement(By.xpath("./../../../../.."));
			 * 
			 * String id = parent.getAttribute("class"); //String Dayss =
			 * "//*[@class='"+id+"']/span[@class='trip-days']"; //
			 * System.out.println(STAXDriver.findElement(By.xpath(Dayss)).getText()); String
			 * intValue = value.replaceAll("[^0-9]", ""); int Price =
			 * Integer.parseInt(intValue); obtainedList.add(Price);
			 * System.out.println(intValue);
			 */
		}
		// }
		// ArrayList<Integer> sortedList = new ArrayList<>();
		// for (Integer s : obtainedList) {
		// sortedList.add(s);
		// }
		// Sort in Ascending Order (Price High-Low)
		// Collections.sort(sortedList);
		// System.out.println(sortedList);

		// Sort in Descending Order (Price High-Low)
		// Collections.sort(sortedList, Collections.reverseOrder());
		// System.out.println(sortedList);

	}

	@Override
	public void VerifyDefaultResultsCountInHomePage() {
		String ResultsLabelDisplayed = STAXDriver.findElement(By.id("lblTotalSearchResult")).getText();
		int TotalResults = STAXDriver.findElements(By.xpath("//div[@id='products']/div")).size();
		String value = ResultsLabelDisplayed;
		String intValue = value.replaceAll("[^0-9]", "");
		System.out.println(ResultsLabelDisplayed);
		System.out.println("The value displayed in the Label is: " + intValue);
		System.out.println("The Totatl number of products displayed are: " + TotalResults);
		int valueInLabel = Integer.parseInt(intValue);
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
		String ResultsLabelDisplayed = STAXDriver.findElement(By.id("lblTotalSearchResult")).getText();
		int TotalResults = STAXDriver.findElements(By.xpath("//div[@id='products']/div")).size();
		String value = ResultsLabelDisplayed;
		String intValue = value.replaceAll("[^0-9]", "");
		System.out.println(ResultsLabelDisplayed);
		System.out.println("The value displayed in the Label is: " + intValue);
		System.out.println("The Totatl number of products displayed are: " + TotalResults);
		int valueInLabel = Integer.parseInt(intValue);
		System.out.println("The value displayed in the Label is: " + valueInLabel);

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

	@Override
	public void userSearchesCountryFromAutoSearch(String Country) {
		String CXpath = "//li[contains(text(),'" + Country + "')]";
		STAXDriver.findElement(By.xpath(CXpath)).click();

	}
}
