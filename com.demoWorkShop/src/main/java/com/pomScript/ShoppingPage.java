package com.pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingPage extends BasePage {
	
	public ShoppingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//*[text()='Shopping cart'])[1]")
	private static WebElement shoppingcartPage;
	
	@FindBy(xpath="//*[@id='termsofservice']")
	private static WebElement agreeTerms_Service;
	
	@FindBy(xpath="//*[@id='checkout']")
	private static WebElement checkout;
	
	@FindBy(xpath="//*[contains(@id,'Company')]")
	private static WebElement company;
	
	@FindBy(xpath="//*[contains(@id,'CountryId')]")
	private static WebElement country;
	
	@FindBy(xpath="//*[contains(@id,'City')]")
	private static WebElement city;
	
	@FindBy(xpath="//*[contains(@id,'Address1')]")
	private static WebElement address1;
	
	@FindBy(xpath="//*[contains(@id,'Address2')]")
	private static WebElement address2;
	
	@FindBy(xpath="//*[contains(@id,'ZipPostalCode')]")
	private static WebElement pinCode;
	
	@FindBy(xpath="//*[contains(@id,'PhoneNumber')]")
	private static WebElement phoneNumber;
	
	@FindBy(xpath="//*[contains(@id,'FaxNumber')]")
	private static WebElement faxNumber;
	
	@FindBy(xpath="(//*[@title='Continue'])[1]")
	private static WebElement continueBtn;

	public static WebElement getShoppingcartPage() {
		return shoppingcartPage;
	}
	public static WebElement getAgreeTerms_Service() {
		return agreeTerms_Service;
	}
	public static WebElement getCheckout() {
		return checkout;
	}
	public static WebElement getCompany() {
		return company;
	}
	public WebElement getCountryId() {
		return country;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getAddress1() {
		return address1;
	}

	public  WebElement getAddress2() {
		return address2;
	}

	public  WebElement getPinCode() {
		return pinCode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	public  WebElement getFaxNumber() {
		return faxNumber;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
public void getcheckout() {
	getShoppingcartPage().click();
	getCompany().sendKeys("Hexaware");
	getCountryId().c("India");
	getCity().sendKeys("Bangalore");
	getAddress1().sendKeys("Sarojini Street");
	getAddress2().sendKeys("Bangalore");
	getPinCode().sendKeys("635809");
	getPhoneNumber().sendKeys("8765449567");
	getFaxNumber().sendKeys("234567899876");
	
}
	
}
