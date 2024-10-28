package com.pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftPage extends BasePage {

	public GiftPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[contains(text(),'Gift Cards')]")
	private static WebElement GiftCardsPage;
	
	@FindBy(xpath="//*[contains(@class,'add-to-cart-button')]")
	private static WebElement addtoCart5$;
		
	@FindBy(xpath="//*[contains(@class,'recipient-name')]")
	private static WebElement recpientName;
	
	@FindBy(xpath="//*[contains(@class,'recipient-name')]")
	private static WebElement recepientEmail;
	
	@FindBy(xpath="//*[contains(@class,'sender-name')]")
	private static WebElement sendName;
	
	@FindBy(xpath="//*[contains(@class,'sender-email')]")
	private static WebElement sendEmail;
	
	@FindBy(xpath="//*[@class='message']")
	private static WebElement message;
	
	@FindBy(xpath="//input[@id='add-to-cart-button-1']")
	private static WebElement addToCart;

	public WebElement getGiftCardsPage() {
		return GiftCardsPage;
	}	
	public WebElement getAddtoCart5$() {
		return addtoCart5$;
	}	
	public  WebElement getRecpientName() {
		return recpientName;
	}
	public  WebElement getRecepientEmail() {
		return recepientEmail;
	}
	public  WebElement getSendName() {
		return sendName;
	}
	public  WebElement getSendEmail() {
		return sendEmail;
	}
	public  WebElement getMessage() {
		return message;
	}
	public  WebElement getAddToCart() {
		return addToCart ;
	}

	public void giftPageAddtoCart() {
		getGiftCardsPage().click();
		getAddtoCart5$().click();
		getRecpientName().sendKeys("Abirami");
		getRecepientEmail().sendKeys("abi070@gmail.com");
		getSendName().sendKeys("priya");
		getMessage().sendKeys("Happy Birthday priya!!!");
		getAddToCart().click();				
	}
	
	
	
	
}
