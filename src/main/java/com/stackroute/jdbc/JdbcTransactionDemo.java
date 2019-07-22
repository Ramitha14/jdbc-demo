package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTransactionDemo {

    public void jdbcTransaction() {
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
            statement.executeUpdate("insert into employee values(6,'vikasini',32,'female')");
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
