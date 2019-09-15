package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_data implements Auto_Const
{

	public static String get_data(String Path, String Sheet, int row, int cell)
	{
		String v ="";
		
		try 
		{
			FileInputStream fis = new FileInputStream(Path);
			Workbook wb = WorkbookFactory.create(fis);
			v = wb.getSheet(Sheet).getRow(row).getCell(cell).toString();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();	
		} 
		catch (EncryptedDocumentException e) 
		{
			e.printStackTrace();
		} 
		catch (InvalidFormatException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
		
			e.printStackTrace();
		}
		
		return v;
		
	}
}
