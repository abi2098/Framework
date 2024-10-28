package com.genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(ListnerImplementation.class)
public class BaseClass_Utility extends WebDriver_Utility {
	@BeforeSuite
	public void connectToServer() {
		Reporter.log("Connection to the server", true);
	}

	@BeforeTest
	public void connectTo() {
		Reporter.log("Connection to the DB", true);
	}

	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		maximizeBrowser();
		implictWait(IConstant.implicityWait);
		navigateUrl(PropertyFile_Utility.propertyData("url"));

	}

	@BeforeMethod
	public void login() {
		Reporter.log("Login the application", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout the application", true);

	}

	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close the Browser", true);
		driver.quit();
	}

	@AfterTest
	public void disconnectTo() {
		Reporter.log("DisConnect to the DB", true);
	}

	@BeforeSuite
	public void disconnectToServer() {
		Reporter.log("DisConnection to the server", true);
	}
}
