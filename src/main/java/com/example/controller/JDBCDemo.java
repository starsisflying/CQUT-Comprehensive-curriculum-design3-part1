package com.example.controller;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//      Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test2?&useSSL=false&serverTimezone=UTC";
//      String url = "jdbc:mysql://127.0.0.1:3306/mysql";
        Connection con = DriverManager.getConnection(url, "root", "qinyuan123");
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from agent");
        while(resultSet.next()){
            System.out.println(resultSet);
        }
    }

}
