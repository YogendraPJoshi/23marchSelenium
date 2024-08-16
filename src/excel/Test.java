package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Create FileInputStream object

		FileInputStream myFile = new FileInputStream("D:\\Velocity\\Java Class\\23 March 2024 Morning\\excelTest.xlsx");

	//	double value = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(1).getCell(2).getNumericCellValue();
	
		//System.out.println(value);
		
	//	String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		
	//	System.out.println(value1);
		
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		System.out.println(mySheet.getRow(0).getCell(0).getCellType());
		
		System.out.println(mySheet.getRow(0).getCell(0).getStringCellValue());
		
	//	System.out.println(value2);
	
	
	}

}
