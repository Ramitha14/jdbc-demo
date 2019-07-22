package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchDemo {

        public void batchDemo ()
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


            Connection connection = null;
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Root@123");
                connection.setAutoCommit(false);
                Statement statement = connection.createStatement();
                statement.addBatch("insert into employee values(4,'Neha',28,'female')");
                statement.addBatch("insert into employee values(5,'ragav',25,'male')");
                statement.executeBatch();//executing the batch

                connection.commit();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }




