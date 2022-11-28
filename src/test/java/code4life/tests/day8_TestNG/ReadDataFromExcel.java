package code4life.tests.day8_TestNG;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ReadDataFromExcel {

    @Test
    public void readExcelFileTest() throws IOException {
        File file = new File("Book2.xlsx");
        Workbook book = WorkbookFactory.create(file);
        Sheet sheet = book.getSheet("Sheet1");
        Row firstRow = sheet.getRow(0);
        Cell firstCell = firstRow.getCell(0);
        String value = firstCell.getStringCellValue();
        System.out.println("First Cell Value "+ value );

        String secondCellValue = firstRow.getCell(1).getStringCellValue();
        System.out.println("secondCellValue = " + secondCellValue);

        int lastCell = firstRow.getLastCellNum();
        System.out.println("Printing all values from firs row: ");
        System.out.println();
        System.out.println("*********");


        for (int i=0; i<lastCell;i++){
            System.out.print(firstRow.getCell(i)+ " | ");
        }

        int numOfRows = sheet.getLastRowNum();


        System.out.println("Printing all values from all columns : \n");

        System.out.println("\nTotal Number of Rows = "+ numOfRows);
        for (int i = 0; i<sheet.getPhysicalNumberOfRows(); i++){
            for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
                String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
                System.out.print(cellValue + " | ");

            }
            System.out.println();
        }
    }
}
