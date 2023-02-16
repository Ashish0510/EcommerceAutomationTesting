package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public String[][] getcellvalue(File file2) throws InterruptedException, IOException{
	FileInputStream file= new FileInputStream(file2);
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheetAt(0);
	
	
	int ttlrow=sheet.getLastRowNum()+1;
	System.out.println(ttlrow);
	
	int ttlcolumn=sheet.getRow(0).getLastCellNum();
	System.out.println(ttlcolumn);
	DataFormatter formatter=new DataFormatter();
	
	
	 String a[][] = new String[ttlrow-1][ttlcolumn];
	
	 int i;
	 int j;
	
	for( i=1;i<ttlrow;i++) {
		Thread.sleep(2000);
		
		for ( j=0;j<ttlcolumn;j++) {
			
			
			a[i-1][j]=formatter.formatCellValue(sheet.getRow(i).getCell(j));
		}
			
		}
	return a;
	}

}
