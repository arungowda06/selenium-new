package com.Framework.Library;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenCapture extends BaseTest {
	
public static String screenCapture(){
	LocalDateTime systemdate= LocalDateTime.now();
    String ScreenShotName=systemdate.toString().replaceAll(":","-");
    TakesScreenshot ts=(TakesScreenshot)driver;
    File temp=ts.getScreenshotAs(OutputType.FILE);
    File dest=new File(Screenshot_path);
    try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		System.out.println("Exception is Handled");
	}
    
    return Screenshot_path; 

}
}