package com.Framework.Library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods extends BaseTest{

	public void clickMethod(WebElement element){
		element.click();
	}
	
	public void enter_value(WebElement element, String value){
		element.sendKeys(value);
	}
	
	public void selectClassMethod(WebElement element, String text){
		Select select=new Select(element);
		select.selectByValue(text);
	}
	
	public void selectClassMethod(WebElement element,int index){
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectClassMethod(String text, WebElement element){
		Select select=new Select(element);
		element.selectByVisibleText(text);
	}
	
	public void selectClassMethod(String options, <List>WebElement element){
		Select select=new Select(element);
	   element.getOptions();
	}
	public void perform_action(Actions act){
		act.build().perform();
	}
	
	public void execute(JavascriptExecutor js){
		js.executeScript("arguments[0].click();");
	}
}
