package com.genericLibrary;

import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {
	public static WebDriver driver;
	public static Properties pro;
	public static Workbook wb;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;

	/**
	 * This method is used to navigate to the particular url of the webpage
	 * 
	 * @param AttributeValue
	 */
	public static void navigateUrl(String url) {
		driver.get(url);
	}

	/**
	 * This method is used to wait for the webelement to load on the webpage
	 * 
	 * @param seconds
	 */
	public static void implictWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	/**
	 * This method is used to maximise the browser
	 */
	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	/**
	 * This method is used to get the current title of the webpage
	 * 
	 * @return
	 */
	public static String getTitle() {
		return driver.getTitle();
	}

	/**
	 * This method is used to get the url of the webpage
	 * 
	 * @return
	 */
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * This method is used to get the sourcecode of the webpage
	 * 
	 * @return
	 */
	public static String sourceCode() {
		return driver.getPageSource();
	}

	/**
	 * This method is used to get the window address
	 * 
	 * @return
	 */
	public static String windowAddress() {
		return driver.getWindowHandle();
	}
	/**
	 * This method is used to get all window address of the webpage
	 * @return
	 */
	public static Set<String> allWindowAddress(){
		return driver.getWindowHandles();
	}
	/**
	 * This method is used to navigate to particular url of the page
	 * @param url
	 */
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	/**
	 * This method is used to move backward of the webpage
	 */
	public static void  moveBackward() {
		driver.navigate().back();
	}

	/**
	 * This method is used to move forward of the webpage
	 */
	public static void moveForward() {
		driver.navigate().forward();
	}
	/**
	 * This method is used to refresh the page
	 */
	public static void refreshPage() {
		driver.navigate().refresh();
	}
	/**
	 * This method is used to switch your control from one window to another window
	 * @param expectedUrl
	 */
	public static void switchToWindow(String expectedUrl) {
		Set<String> all=driver.getWindowHandles();
		for(String s:all) {
			driver.switchTo().window(s);
		String actualUrl=driver.getCurrentUrl();
		if(expectedUrl.contains(actualUrl)) {
			break;
		}
	}
	}

/**
 * This method is used to switch your control from webpage to alert box it will help to click the ok button in the alert dialogue box
 */
	public static void switchToSimpleAlert() {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	/**
	 * This method is used to switch your control from webpage to alert box it will
	 * help you to click ok button or cancel button in the alert dialogue box
	 * 
	 * @param option
	 */
	public static void switchToConfiramationAlert(String option) {
		Alert alt = driver.switchTo().alert();
		if (option.contains("ok")) {
			alt.accept();
		} else {
			alt.dismiss();
		}

	}

	/**
	 * This method is used to switch your control from webpage to alert box it will
	 * help you to send message
	 * 
	 * @param message
	 */
	public static void switchToPromptAlert(String message) {
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(message);
	}

	/**
	 * This method is used to switch your control from webpage to Iframe page with
	 * respective index
	 * 
	 * @param index
	 */
	public static void switchToIframe(int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * This method is used to switch your control from webpage to Iframe page with
	 * respective Id attribute or NameAttribute
	 * 
	 * @param AttributeValue
	 */

	public static void switchToIframe(String AttributeValue) {
		driver.switchTo().frame(AttributeValue);
	}

	/**
	 * This method is used to switch your control from webpage to Iframe page with
	 * respective WebElement address
	 * 
	 * @param element
	 */
	public static void switchToframe(WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * This method is used to control from frame page to main page
	 */
	public static void swichBackMainFrame() {
		driver.switchTo().defaultContent();
	}
	/**
	 * This method is used to switch control from frame page to immediate page
	 */
	public static void swichBackImmediateParent() {
		driver.switchTo().parentFrame();
	}

}
