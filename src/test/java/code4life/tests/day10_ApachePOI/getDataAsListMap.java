package code4life.tests.day10_ApachePOI;

import code4life.utilities.ConfigurationReader;
import code4life.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class getDataAsListMap {

    @Test
    public void gettingDataAsListOfMap(){
        ExcelUtil util = new ExcelUtil("Book2.xlsx", "Sheet1");

        for (Map<String, String> record : util.getDataList()){
            System.out.println(record);
        }

        }
    @Test
    public void returnTotalNoOfColumn(){
        ExcelUtil util = new ExcelUtil("Book2.xlsx","Sheet1");
        System.out.println(util.columnCount());

    }

    @Test
    public void getColumnNames(){
        ExcelUtil util = new ExcelUtil("Book2.xlsx","Sheet1");
        System.out.println(util.getColumnNames());
        System.out.println(util.rowCount());

    }

    @Test
    public void getDataFromspecificCell(){
        ExcelUtil util = new ExcelUtil("Book2.xlsx","Sheet1");
        System.out.println(util.getCellData(3,1));

    }

    public static void main(String[] args) throws IOException {
        ConfigurationReader reader = new ConfigurationReader();
        System.out.println( reader.getValue("user"));;


    }




}

