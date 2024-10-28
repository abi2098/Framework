package com.genericLibrary;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImplementation implements ITestListener {
//To implement this right click -source and then click overiden methods
	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Test Execution Start",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log("Test Execution success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Execution Failed",true);
		try {
			TakeScreenshot_Utility.takeScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
