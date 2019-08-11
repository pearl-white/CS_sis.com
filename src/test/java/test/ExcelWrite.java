package test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelWrite {
    public static void main(String[] args) throws Exception {

        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;

        String path="/Users/Guga/Downloads/chicago11cucumberjunit-master/src/test/resources/SampleData.xlsx";

        FileInputStream fileInputStream= new FileInputStream(path);

        workbook= new XSSFWorkbook();
        sheet=workbook.getSheet("Employees");
        row= sheet.getRow(1);
        cell=row.getCell(1);            //getting the cell from the selected row.
        System.out.println("Steven`s last name: "+ cell.toString());

        XSSFCell adamcell=sheet.getRow(2).getCell(0);
        System.out.println("Before: "+ adamcell.toString());
        adamcell.setCellValue("Madam");


        System.out.println("After: "+ adamcell.toString());




        //TO DO: Change Trumps job id to President dynamically
        for (int rowNum=0; rowNum<sheet.getPhysicalNumberOfRows(); rowNum++){
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Trump")){
                sheet.getRow(rowNum).getCell(2).setCellValue("President");
            }


        }


        FileOutputStream fileOutputStream=new FileOutputStream(path);   //sending a value to a file
        workbook.write(fileOutputStream);                               //executing an writing to the file

        workbook.close();
        fileInputStream.close();
        fileOutputStream.close();





    }
}
