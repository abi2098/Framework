package com.practiceSession;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.genericLibrary.Action_Utility;
import com.genericLibrary.BaseClass_Utility;

public class PracticeAction extends BaseClass_Utility {
	@Test
	public void testcase() throws InterruptedException {
		Action_Utility a = new Action_Utility(driver);
		//move the cursor to the webelement
		a.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Computers')]"))).doaction();
		Thread.sleep(1000);
		
		//right click operation
		a.rightClick(driver.findElement(By.xpath("//*[contains(@id,'vote-poll')]"))).doaction();
		Thread.sleep(1000);
		
		//perform double click operation
		driver.findElement(By.xpath("//*[text()='Buttons']")).click();
		a.doubleClick(driver.findElement(By.xpath("//*[text()='Double click on me']"))).doaction();
		Thread.sleep(2000);
		
		//perform drag And Drop
		
	
	}
}
