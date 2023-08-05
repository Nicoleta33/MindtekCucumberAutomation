package practiceJDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCTest2 {
    public static void main(String[] args) throws SQLException {
        System.out.println(getMinAndMaxSalaryForJob("select * from jobs", "Sales manager"));

//        /**
//         * We need 3 things to connect to Data Base
//         *
//         * 1. Connection object
//         * 2. Statement object
//         * 3. ResultSet object
//         *
//         */
//        Connection connection = DriverManager.getConnection(
//                "jdbc:postgresql://localhost:5432/postgres",
//                "postgres",
//                "Admin123"
//        );
//
//        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//        ResultSet resultSet = statement.executeQuery("select * from jobs");
//
//
//
////        }
//            // for(Map columnData: tableData){
//            //   System.out.println(columnData.get("first_name"));

/**
 * Get min and max salary for sales manager
 */

//select min_salary,max_salary from jobs where job_title='Sales Manager'

            }



    public static String getMinAndMaxSalaryForJob(String query, String jobTitle) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "Admin123");

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery(query);


        List<Map<String, Object>>  tableData = new ArrayList<>();
        ResultSetMetaData metaData = resultSet.getMetaData();
        while(resultSet.next()){

            Map<String, Object> rowData = new HashMap<>();

            for(int columnIndex=1; columnIndex<=metaData.getColumnCount(); columnIndex++){
                rowData.put(metaData.getColumnName(columnIndex), resultSet.getString(metaData.getColumnName(columnIndex)));
            }
            tableData.add(rowData);
        }

        String result = "";

        for(Map columnData: tableData){

            if(columnData.get("job_title").toString().equalsIgnoreCase(jobTitle)){
                result = "Min and max salary for "+jobTitle+": "+columnData.get("min_salary") + " "+columnData.get("max_salary");
                break;
            }
        }


        connection.close();
        statement.close();
        resultSet.close();

        return  result;

    }
}


