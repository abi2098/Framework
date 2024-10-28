package com.practiceSession;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.genericLibrary.BaseClass_Utility;
import com.genericLibrary.TakeScreenshot_Utility;

public class ProgramActionTest extends BaseClass_Utility {
@Test
public void testCase1() throws IOException {
//take element screenshot
	WebElement element = driver.findElement(By.xpath("//*[text()='14.1-inch Laptop']"));

	TakeScreenshot_Utility.takeElementShot(element);
}
}
