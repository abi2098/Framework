package com.pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage extends BasePage {

	public BookPage(WebDriver driver) {
		super(driver);
}
	@FindBy(xpath="(//*[contains(text(),'Books')])[1]")
	private static WebElement bookPage;
	
	@FindBy(xpath="(//*[@value='Add to cart'])[1]")
	private static WebElement computingAddtoCart;
	
	@FindBy(xpath="(//*[@value='Add to cart'])[2]")
	private static WebElement fictionAddtoCart;
	
	@FindBy(xpath="//*[@id='products-orderby']")
	private WebElement sortByFilter;
	
	
	public  WebElement getBookPage() {
		return bookPage;
	}

	public  WebElement getComputingAddtoCart() {
		return computingAddtoCart;
	}

	public  WebElement getFictionAddtoCart() {
		return fictionAddtoCart;
	}
	
	public  WebElement getSortByFilter() {
		return sortByFilter;
	}

	public void bookaddToCart() throws InterruptedException {
		BookPage.bookPage.click();
		Thread.sleep(1000);
		BookPage.computingAddtoCart.click();
		Thread.sleep(1000);
		BookPage.fictionAddtoCart.click();
		
	}
	
}

