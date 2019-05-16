package Implementations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import Interfaces.BookNow;
import cucumberOptions.TestRunner;

public class BookNowImpl extends TestRunner implements BookNow{

	@Override
	public String ClickBookNow() {
		
		/*
		 * Set<String> handles = STAXDriver.getWindowHandles();
		 * 
		 * Iterator itr = handles.iterator(); String parent_window = (String)
		 * itr.next(); System.out.println(parent_window + "....." +
		 * STAXDriver.getTitle());
		 * 
		 * String child_window = (String) itr.next();
		 * STAXDriver.switchTo().activeElement();
		 * STAXDriver.switchTo().window(child_window);
		 * 
		 * WebDriverWait wait = new WebDriverWait(STAXDriver, 20);
		 */
		
	 	  String TourFinalPrice=STAXDriver.findElement(By.xpath("//span[@class='b-price']")).getText();
			STAXDriver.findElement(By.xpath("//a[@class='btn-sta btn-primary btn-book']")).click();
			
			System.out.println("The tour price is: " + TourFinalPrice);
		return TourFinalPrice;
	}

}
