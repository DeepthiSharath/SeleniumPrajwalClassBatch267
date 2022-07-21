package DataDrivenTestingFromExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataDrivenFromExcelFile {
  @Test
  public void readDataFromExcel() throws EncryptedDocumentException, IOException {
	  FileInputStream fis= new FileInputStream("./Data.xlsx");
	  Workbook wb=WorkbookFactory.create(fis);
	  Sheet sheet= wb.getSheet("Sheet1");
	  Row row=sheet.getRow(2);
	  Cell cell=row.getCell(0);
	  String text= cell.toString();
	  System.out.println(text);
	  
	  
	  }
}
