package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DatabaseMetadataDemo {
    public  void dbMetadataDemo(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Employee","root","Root@123");
            DatabaseMetaData databaseMetaData=connection.getMetaData();

            System.out.println("Driver Name: "+databaseMetaData.getDriverName());
            System.out.println("Driver Version: "+databaseMetaData.getDriverVersion());
            System.out.println("UserName: "+databaseMetaData.getUserName());
            System.out.println("Database Product Name: "+databaseMetaData.getDatabaseProductName());
            System.out.println("Database Product Version: "+databaseMetaData.getDatabaseProductVersion());

            connection.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

