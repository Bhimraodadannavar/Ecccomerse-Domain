package Generic_Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Gebneric_EXcel_DataDriven_FM 

{
	public static String String (String sheet, int Row, int cell) throws EncryptedDocumentException, IOException
	{
	  FileInputStream fis = new FileInputStream("./Excel/testdata.xlsx");
	  Workbook book = WorkbookFactory.create(fis);
	  String val = book.getSheet(sheet).getRow(Row).getCell(cell).getStringCellValue();
	  return val;
	  
		
	}

}
