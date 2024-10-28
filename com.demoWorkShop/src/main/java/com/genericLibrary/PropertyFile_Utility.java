package com.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile_Utility extends WebDriver_Utility {

	public static String propertyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream(IConstant.property_FilePath);
		pro = new Properties();
		pro.load(fis);
		return pro.getProperty(key);

	}
}
