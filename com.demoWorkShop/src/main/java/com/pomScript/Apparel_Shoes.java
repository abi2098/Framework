package com.pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Apparel_Shoes extends BasePage {

	public Apparel_Shoes(WebDriver driver) {
		super(driver);	
	}
	@FindBy(xpath="(//*[contains(text(),'Apparel & Shoes')])[2]")
	public static WebElement apparelShoesPage;
	
	@FindBy(xpath="(//*[@value='Add to cart'])[1]")
	public static WebElement polkaDotAddtoCart;
	
	@FindBy(xpath="(//*[@value='Add to cart'])[3]")
	public static WebElement jeanAddToCart;
	
	
	public void apparelAddToCart() {
		Apparel_Shoes.apparelShoesPage.click();
		Apparel_Shoes.polkaDotAddtoCart.click();
		Apparel_Shoes.jeanAddToCart.click();
	}

}
