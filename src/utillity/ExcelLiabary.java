package utillity;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLiabary {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelLiabary(String excel_Path){
		try {
	    //File XLSReader_Path= new File("C://SoftwareTesting//ExcelData//TestData.xlsx");
		File XLSReader_Path= new File(excel_Path);
		
		FileInputStream load_XLSReader= new FileInputStream (XLSReader_Path);
		wb= new XSSFWorkbook(load_XLSReader);
	  
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
		
		public String getData(int sheetNumber, int row, int coloum){
			  sheet1= wb.getSheetAt(sheetNumber);
			String data=sheet1.getRow(row).getCell(coloum).getStringCellValue();
			return data;
			
		}
		public int getRowCount(int sheetIndex ){
			int row =wb.getSheetAt(sheetIndex).getLastRowNum();
			row=row+1;
			return row;
		}
		
			
			
		
	}

