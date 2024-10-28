package com.practiceSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericLibrary.BaseClass_Utility;
import com.genericLibrary.Select_Utility;

public class PracticeSelect extends BaseClass_Utility {

	@Test
	public void selectCase() throws InterruptedException {
//	driver.findElement(By.xpath("(//*[contains(text(),'Digital downloads')])[1]")).click();
//	Select_Utility obj=new Select_Utility(driver.findElement(By.xpath("//*[@id='products-orderby']")));
//	//Select the dropdown using index,text,value
//	obj.selectByIndex(3);
//	//obj.selectByText("Created on");
//	//obj.selectByValue("https://demowebshop.tricentis.com/digital-downloads?orderby=5");
//	//De-select the value in the dropdown
//	Thread.sleep(3000);
//	obj.deSelectByIndex(3);

		Select_Utility obj = new Select_Utility(driver.findElement(By.xpath("//*[@id='cars']")));
		System.out.println("Multi selected or not" + obj.ismultiple());
		System.out.println("Size of the dropdown" + obj.size());

		obj.selectByIndex(1);
		obj.selectByValue("299");
		// Thread.sleep(1000);
		// obj.deSelectByIndex(1);
		// obj.clear();
		System.out.println("Get first selected option:" + obj.getFirstSelect());
		System.out.println("----Get All Selected values---");
//	for(Object String:obj.getAllSelect()) {
//		System.out.println(String);
//	}

		List<WebElement> allselect = obj.getAllSelect();

		for (WebElement element : allselect) {

			System.out.println(element.getText());
		}
		System.out.println("Get All the options available in the dropdown---------");

		List<WebElement> allOptions = obj.getAllOptions();
		for (WebElement element : allOptions) {
			System.out.println(element.getText());
		}
	}

}
