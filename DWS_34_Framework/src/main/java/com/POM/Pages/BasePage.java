package com.POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage  {
	
 public void BasePage(WebDriver driver){
	 PageFactory.initElements(driver, this); 
 }
}
