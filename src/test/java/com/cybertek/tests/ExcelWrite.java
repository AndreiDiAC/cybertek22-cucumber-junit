package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test
    public void excel_writing_test() throws IOException {

        String path = "SampleData.xlsx";

        //To be able to read from Excel file, we need to load it into FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook > sheet > row > cell

        workbook = new XSSFWorkbook(fileInputStream);

        //get the sheet

        sheet = workbook.getSheet("Employees");

        //king's row

        row = sheet.getRow(1);

        //king's cell

        cell = row.getCell(1);


        XSSFCell adamsCell = sheet.getRow(2).getCell(0);
        System.out.println("adamsCell = " + adamsCell);

        //This method will override existing cell
        adamsCell.setCellValue("Madam");

        System.out.println("After: " + adamsCell);

        for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {
           if( sheet.getRow(1).getCell(0).toString().equals("Steven")){
               sheet.getRow(1).getCell(0).setCellValue("Tom");
            }
        }

        System.out.println(adamsCell);
        adamsCell.setCellValue("asd");
        System.out.println(adamsCell);

        sheet.getRow(3).getCell(2).setCellValue("qwert");






//===========================================================================================
        //Use fileOutputStream to push changes -> load the file to fileOutputStream
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        // Write to file using fileOutputStream
        workbook.write(fileOutputStream);


        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();



    }
}
