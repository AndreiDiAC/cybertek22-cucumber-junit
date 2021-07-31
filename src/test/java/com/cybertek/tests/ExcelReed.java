package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReed {

    /*
    In this method we will learn how to read from excel file step by step
     */

    @Test
    public void read_from_excel_file() throws IOException {

        String path = "SampleData.xlsx";
        // To be able to read from Excel file, we need to load it into FileInputStream

        FileInputStream fileInputStream = new FileInputStream(path);

        // workbook > sheet > row > cell

        // 1 - Create a workbook

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // 2 - We need to get the specific sheet from currently opened workbook

        XSSFSheet sheet = workbook.getSheet("Employees");

        // 3 - Select row and cell

        // Print out "Steven" cell
        // starts with index 0 for row and column
        System.out.println("sheet.getRow(1).getCell(0) = " + sheet.getRow(1).getCell(0));


        //Print out "Singer" from the sheet
        System.out.println("sheet.getRow(3).getCell(2) = " + sheet.getRow(3).getCell(2));

        // Return the count of used cell only
        //If there are cells not used, there will not be counted
        //Starts counting from 1
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);

        //Returns the number from the top cell to bottom cell
        //It does not care if there are empty cells or not
        //Starts counting from 0
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println(lastUsedRow);

        //row vertical // cell horizontally
//        TODO: 1 - Create a logic to print out Neena's name dynamically

        for (int rowNum = 0; rowNum < usedRows; rowNum++) {

            if (sheet.getRow(rowNum).getCell(0).toString().equals("Neena")){

                System.out.println("Current cell = " + sheet.getRow(rowNum).getCell(0));

            }

        }

        //TODO: - Create a logic to print out Steven Kins's Job_id
        //Check for steve's name, if its steven --> print out job_id

        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Steven")){
                System.out.println("Steven's job_id: " + sheet.getRow(rowNum).getCell(2));
            }
        }


    }
}
