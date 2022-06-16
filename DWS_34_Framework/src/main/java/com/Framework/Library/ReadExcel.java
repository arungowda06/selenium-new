package com.Framework.Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements FrameworkConstants{

	static File file=new File(Excel_path);
	static FileInputStream fis;
	static Workbook workbook;
	static Sheet sheet;
	
	public static String readStringValue(String sheetName, int RowNum, int ColNum) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetName);
		return sheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
	}
	
	public static double readNumericValue(String sheetName,int RowNum,int ColNum) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetName);
		return sheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
	}
	
	public static Date readDateValue(String sheetName,int RowNum,int ColNum) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetName);
		return sheet.getRow(RowNum).getCell(ColNum).getDateCellValue();
	}
	
	public static boolean readBooleanValue(String sheetName, int RowNum, int ColNum) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetName);
		return sheet.getRow(RowNum).getCell(ColNum).getBooleanCellValue();
	}
	
	public static Object[][] readAllValues(String sheetName) throws EncryptedDocumentException, IOException{
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetName);
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		int colcount=sheet.getRow(1).getPhysicalNumberOfCells();
		
		Object[][] data=new Object[rowcount-1][colcount]; 
		for (int i = 1; i <rowcount; i++) {
			for (int j = 0; j <colcount; j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		
		for (int i = 0; i <rowcount-1; i++) {
			for (int j = 0; j <colcount; j++) {
				System.out.println(data[i][j]);
			}
		}
		return data;
		
	}	
}
