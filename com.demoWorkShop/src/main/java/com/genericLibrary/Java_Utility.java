package com.genericLibrary;

import java.time.LocalDateTime;

public class Java_Utility {
	/**
	 * Used to take the multiple screenshot on different time with system time
	 * 
	 * @return
	 */
	public static String date() {
		LocalDateTime date = LocalDateTime.now();
		String systemDate = date.toString().replace(":", "-");
		return systemDate;

	}
	

}
