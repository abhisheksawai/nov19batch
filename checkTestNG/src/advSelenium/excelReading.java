package advSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelReading {
	
	@Test
	public void readexcel() throws Exception
	{
		File src=new File("C:\\Users\\lenovo\\Desktop\\Nov Weekend\\nov revision and mail id 14 dec.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1= wb.getSheetAt(0);
		
		String oneone = sh1.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(oneone);
		System.out.println(sh1.getLastRowNum());
		System.out.println(sh1.getRow(0).getLastCellNum());
		
		for(int i =0 ; i <sh1.getLastRowNum() ; i++ )
		{
			for(int j=0; j<sh1.getRow(0).getLastCellNum() ; j++)
			{
				System.out.println(sh1.getRow(i).getCell(j).getStringCellValue());
				System.out.println(sh1.getRow(i).getCell(j).getNumericCellValue());
				
			}
		}
		
	}

}
