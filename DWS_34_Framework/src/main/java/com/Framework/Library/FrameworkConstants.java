package com.Framework.Library;

import java.time.LocalDateTime;

public interface FrameworkConstants {

	LocalDateTime systemdate=LocalDateTime.now();
	String ReportName=systemdate.toString().replaceAll(":", "-");
	String ScreenShotName=systemdate.toString().replaceAll(":", "-");
	
	String Chrome_path="./src/main/resources/Drivers/chromedriver.exe";
	String Chrome_key="webdriver.chrome.driver";
	
	String Gecko_path="./src/main/resources/Drivers/geckodriver.exe";
	String Gecko_key="webdriver.gecko.driver";
	
	String Excel_path="./src/test/resouces/Testdata/Testcasedata.xlsx";
	
	String propertyfile_path="./src/test/resources/PropertyFile/config.properties";
	
	String Screenshot_path="./Screenshots/"+ScreenShotName+".png";
	
	String Reports_path="./Reports/"+ReportName+".html";
	
	
}
