package com.genericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

 /**
 * @author ABIRAMI
 */

public class TakeScreenshot_Utility extends WebDriver_Utility {
	/**
	 * This method is used to take screen shot of Overall webpage
	 * @throws IOException
	 */
	public static void takeScreenshot() throws IOException {
		//String SystemDate = Java_Ut.ility.date();
		ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(IConstant.screenshot);
		Files.copy(source, destination);
	}

	/**
	 * This method is used to take screen shot of webelement
	 * @param element
	 * @return 
	 * @throws IOException
	 */
	public static  void takeElementShot(WebElement element) throws IOException {
		//String SystemDate = Java_Utility.date();
		File source = element.getScreenshotAs(OutputType.FILE);
		File destination = new File(IConstant.elementScreenshot);
		Files.copy(source, destination);

	}
}
