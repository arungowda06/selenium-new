package com.Framework.Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadPropertyFile implements FrameworkConstants {

	public static String readProp(String key,String sheetName) throws IOException{
		FileInputStream fis=new FileInputStream(propertyfile_path);
		Properties property=new Properties();
		property.load(fis);
		return property.getProperty(key);
		
	}
}
