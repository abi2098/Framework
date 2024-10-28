package com.genericLibrary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_Utility {
	Select select;

	/**
	 * 
	 * @param element
	 */
	public Select_Utility(WebElement element) {
		select = new Select(element);
	}

	/**
	 * This method is used to select the option which present in the dropdown with
	 * respect to index value
	 * 
	 * @param index
	 */
	public void selectByIndex(int index) {
		select.selectByIndex(index);
	}

	/**
	 * This method is used to select the option which present in the dropdown with
	 * respect to value attribute
	 * 
	 * @param value
	 */
	public void selectByValue(String value) {
		select.selectByValue(value);
	}

	/**
	 * This method is used to select the option which present in the dropdown with
	 * respect to text function
	 * 
	 * @param text
	 */
	public void selectByText(String text) {
		select.selectByVisibleText(text);
	}

	/**
	 * This method is used to deselect the option which present in the dropdown with
	 * respect to index value
	 * 
	 * @param index
	 */

	public void deSelectByIndex(int index) {
		select.deselectByIndex(index);
	}

	/**
	 * This method is used to deselect the option which present in the dropdown with
	 * respect to value attribute
	 * 
	 * @param value
	 */
	public void deSelectByValue(String value) {
		select.deselectByValue(value);
	}

	/**
	 * This method is used to deselect the option which present in the dropdown with
	 * respect to text function
	 * 
	 * @param text
	 */
	public void deSelectByText(String text) {
		select.deselectByVisibleText(text);
	}
	/**
	 * This method is used to give you the first
	 *  selected option present in the dropdown
	 * @return
	 */
	public WebElement getFirstSelect() {
		WebElement element=select.getFirstSelectedOption();
		return element;
	}
	
	/**
	 * used to print the all the value selected by user
	 * @return
	 */
	public List<WebElement> getAllSelect() {
	List<WebElement> element=select.getAllSelectedOptions();
	return element;
	}

	/**
	 * This method is used to return the size of the dropdown
	 * 
	 * @return
	 */
	public int size() {
		int size = select.getOptions().size();
		return size;
	}

	/**
	 * This method is used to de-select all the option which is present in the
	 * dropdown
	 */
	public void clear() {
		select.deselectAll();
	}
	/**
	 * To check dropdown is single selected or multiple selected 
	 * @return
	 */
	public boolean ismultiple() {
	boolean value=	select.isMultiple();
	return value;
	}
	
	public List<WebElement> getAllOptions() {
	List<WebElement> allOption=select.getOptions();
	return allOption;
	
	}
	
	
	
}
