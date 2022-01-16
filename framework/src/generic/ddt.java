package generic;

import java.io.FileInputStream;
import com.google.common.collect.Table.Cell;

public class ddt {
	public static String getdata(int row,int cell){
		String val="";
		try{
			FileInputStream fis =new FileInputStream("./excel/abi.xls");
			Workbook wb=WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
			val = c.getStringcellvalue();
		}
		catch(Exception e){
			System.out.println("unable to fetch");
		}
		return val;
	
		}
	}


