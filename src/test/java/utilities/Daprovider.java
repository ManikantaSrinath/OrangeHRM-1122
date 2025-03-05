package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Daprovider {
	
	
	@DataProvider(name = "provider")
	public String [] [] getData() throws IOException{
		
		String path = ".\\Files\\loginDetails.xlsx";
		ExcelUtility xfile = new ExcelUtility(path);
		
     	int rowcount =	xfile.getRowCount("Sheet1");
     	int cellcount =	xfile.getCellCount("Sheet1", 1);
     	
     	String  Data [] [] = new String[rowcount][cellcount];
     	
     	for(int r=1;r<=rowcount;r++) {
     		for(int j=0;j<cellcount;j++) {
     			Data[r-1][j]=xfile.getCellData("Sheet1", r, j);     			
     		}
     	}
     	
     	
     	return Data;
		
	}

}
