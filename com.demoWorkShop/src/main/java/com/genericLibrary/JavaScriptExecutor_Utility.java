package com.genericLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor_Utility extends WebDriver_Utility {

	/**
	 * This method is used to scroll up the page
	 * 
	 * @param xAxis
	 * @param yAxis
	 */
	public static void scrollUp(int xAxis, int yAxis) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + xAxis + "," + yAxis + ")");
	}

	/**
	 * This method is used to scroll down the webpage
	 * 
	 * @param xAxis
	 * @param yAxis
	 */
	public static void scrollDown(int xAxis, int yAxis) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + xAxis + "," + -yAxis + ")");
	}

	/**
	 * This method is used to Extreme top of the Webpage
	 */
	public static void scrollTopWebpage() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollTop)");
	}

	/**
	 * This method is used to extreme bottom of the webpage
	 */

	public static void scrollBottomWebPage() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	/**
	 * This method is used to scroll according to the webelement
	 * 
	 * @param element
	 */
	public static void scrollTillWebElement(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

}
