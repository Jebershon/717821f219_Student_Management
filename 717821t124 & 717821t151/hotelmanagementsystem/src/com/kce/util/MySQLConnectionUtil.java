package com.kce.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/Hotel";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Hema@1234567";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
