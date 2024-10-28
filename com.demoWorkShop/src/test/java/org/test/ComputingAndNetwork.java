package org.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericLibrary.BaseClass_Utility;
import com.pomScript.BasePage;
import com.pomScript.BookPage;

public class ComputingAndNetwork extends BaseClass_Utility {
	@Test
	public void testCase() throws InterruptedException {
		BookPage book=new BookPage(driver);
		book.bookaddToCart();

        // verify if we used book page or not using url
		String url = getCurrentUrl();
		Assert.assertEquals(url, "https://demowebshop.tricentis.com/books");
		
		// verify using getTitle
		String title = getTitle();
		Assert.assertEquals(title, "Demo Web Shop. Books");

	
		
	}

}
