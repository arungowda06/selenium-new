package com.Framework.Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements FrameworkConstants {

	public static WebDriver driver;

	@Parameters("browser")
	
	@BeforeClass
	public void openFirefox(@Optional("chrome") String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty(Chrome_key, Chrome_path);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty(Chrome_key, Chrome_path);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		}
	}
	
	@AfterClass
	public void closeFirefox(){
		driver.close();
	}
}
