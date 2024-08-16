package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EG1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//locate your excel file
		
		FileInputStream myFile= new FileInputStream("D:\\Velocity\\Java Class\\23 March 2024 Morning\\excelTest.xlsx");

	//	String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	
		
	//	System.out.println(value);
		
		
		
		 CellType valueType = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getCellType();
		 System.out.println(valueType);
		 
		 
		 
		 
	}

}
