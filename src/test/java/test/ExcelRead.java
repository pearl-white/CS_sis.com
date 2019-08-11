package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;


public class ExcelRead {

    public static void main(String[] args) throws Exception {

        //Creating a file
        File file= new File ("/Users/Guga/Downloads/chicago11cucumberjunit-master/src/test/resources/SampleData.xlsx");
        System.out.println(file.exists());  //it checks if the file exists

        //Load file
        FileInputStream fileInputStream=  new FileInputStream(file);

        //From workbook to Sheet--> Rows-->Cells
        //Loading the workbook to our class
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);

        //Pass the sheet name
        XSSFSheet sheet= workbook.getSheet("Employees");

        System.out.println(sheet.getRow(2).getCell(1));   //get Sandler`s name
        int usedRows= sheet.getPhysicalNumberOfRows();
        System.out.println("Number of Rows: "+ usedRows);

        int lastRowUsed= sheet.getLastRowNum();
        System.out.println("Last Row Number: "+ lastRowUsed);

        //TO DO: Creat a logic that prints out name of Neena Dynamically
        for (int rowNum=0; rowNum<usedRows; rowNum++){
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Neena")){
            System.out.println(sheet.getRow(rowNum).getCell(0));

        }}


        //TO DO: Creat a logic that prints out Adams Job_ID Dynamically
        for(int rowNum=0; rowNum<usedRows; rowNum++){
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Adams")){
                System.out.println("Job_Id of Adams"+ sheet.getRow(rowNum).getCell(2));

            }

        }

        workbook.close();
        fileInputStream.close();



    }
}
