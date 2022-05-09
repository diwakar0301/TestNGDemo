package com.example.excelDP;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;
import java.io.*;
public class ReadExcelTest {
  @Test
  public void readExcel() throws Exception {
	  File f=new File("C:\\Users\\Mohanraj Palanisamy\\Desktop\\TestNGDemo.xlsx");
	  FileInputStream fis=new FileInputStream(f);
	  XSSFWorkbook workbook=new XSSFWorkbook(fis);
	  XSSFSheet sheet=workbook.getSheetAt(0);
//	 String cellValue00= sheet.getRow(0).getCell(0).getStringCellValue();
//	 System.out.println(cellValue00);
	 
	 int rowCount=sheet.getPhysicalNumberOfRows();
	 //System.out.println("rowcount" +rowCount);
	 for(int i=0;i<rowCount;++i) {
		 
		 XSSFRow row=sheet.getRow(i);
		 int cellCount=row.getPhysicalNumberOfCells();
		//System.out.println("row"+row);
		// System.out.println("cellCount"+cellCount);
		 for(int j=0;j<cellCount;++j) {
			 //System.out.println(i+" "+j);
			 XSSFCell cell=row.getCell(j);
			 String cellvalueij=getCellValue(cell);
			 System.out.print("||"+cellvalueij);
		 }
		 System.out.println();
	 }
	 
	 workbook.close();
	 fis.close();
	  
  }
  
  public String getCellValue(XSSFCell cell) {
	  switch(cell.getCellType()) {
	  case NUMERIC:
		  return String.valueOf(cell.getNumericCellValue());
	  case BOOLEAN:
		  return String.valueOf(cell.getBooleanCellValue());
	  case STRING:
		  return cell.getStringCellValue();
		default:
			return cell.getStringCellValue();
	  }
	  
	  
  }
  
}
