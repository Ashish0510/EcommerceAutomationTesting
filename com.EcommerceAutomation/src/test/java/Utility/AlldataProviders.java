package Utility;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;

public class AlldataProviders {
	@DataProvider(name="signupdetails")
	public String[][] signupdetails() throws InterruptedException, IOException {
		ReadExcelFile excelFile=new ReadExcelFile();
		File file=new File("./TestData/Ecoomerce.xlsx");
		return excelFile.getcellvalue(file);
		
	}
	
	
	@DataProvider(name="logindetails")
	public String[][] logindetails() throws InterruptedException, IOException {
		ReadExcelFile excelFile=new ReadExcelFile();
		File file=new File("./TestData/Logindata.xlsx");
		return excelFile.getcellvalue(file);
	}
}
