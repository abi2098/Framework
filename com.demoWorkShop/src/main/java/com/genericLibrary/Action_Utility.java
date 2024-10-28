package com.genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action_Utility extends WebDriver_Utility {
	Actions action;

	public Action_Utility(WebDriver driver) {
		action = new Actions(driver);
	}

	public Action_Utility moveToElement(WebElement element) {

		action.moveToElement(element);
		return this;

	}

	public Action_Utility rightClick(WebElement element) {
		action.contextClick(element);
		return this;
	}

	public Action_Utility doubleClick(WebElement element) {

		action.doubleClick(element);
		return this;

	}

	public Action_Utility dragAndDrop(WebElement source, WebElement destination) {

		action.dragAndDrop(source, destination);
		return this;

	}

	public Action_Utility doaction() {
		action.perform();
		return this;

	}
}
