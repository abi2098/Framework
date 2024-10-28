package com.practiceSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericLibrary.BaseClass_Utility;
import com.genericLibrary.JavaScriptExecutor_Utility;

public class ProgramJsTest extends BaseClass_Utility {

	@Test
	public void testCase() throws InterruptedException {

		JavaScriptExecutor_Utility.scrollBottomWebPage();
		Thread.sleep(3000);
		JavaScriptExecutor_Utility.scrollTopWebpage();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//*[text()='14.1-inch Laptop']"));
		JavaScriptExecutor_Utility.scrollTillWebElement(element);
		Thread.sleep(3000);
		JavaScriptExecutor_Utility.scrollUp(0, 600);
		Thread.sleep(3000);
		JavaScriptExecutor_Utility.scrollDown(0, 600);
		Assert.fail();
	}

}
