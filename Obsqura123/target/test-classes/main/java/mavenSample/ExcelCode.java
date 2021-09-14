package mavenSample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	public static FileInputStream f;
	public static XSSFWorkbook a;
	public static XSSFSheet s;
	public static String readStringData(int i,int j) throws IOException
	
	{
		f=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Obsqura123\\src\\main\\resources\\Book1.xlsx");
		a=new XSSFWorkbook(f);
		s=a.getSheet("Sheet1");
		Row r=s.getRow(i);
		Cell c=r.getCell(j);
		return c.getStringCellValue();
		
		
	}
public static String readIntegerData(int i,int j) throws IOException
	
	{
		f=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Obsqura123\\src\\main\\resources\\Book1.xlsx");
		a=new XSSFWorkbook(f);
		s=a.getSheet("Sheet1");
		Row r=s.getRow(i);
		Cell c=r.getCell(j);
		int b=(int) c.getNumericCellValue();
		return String.valueOf(b);
		
		
	}
 

}
