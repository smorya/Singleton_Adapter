package org.example.task1;
import lombok.SneakyThrows;

import java.sql.*;

public class DBConnection {
    private static DBConnection dbConnection;
    private static Connection connection;
    private static String db;
    private static Statement db1;

    @SneakyThrows
    private DBConnection() {
        connection = DriverManager.getConnection("jdbc:sqlite:db.sqlite3");
        System.out.println("Connected");
    }
    public void parseQuery(String query) throws SQLException {
        db1 = connection.createStatement();
        db1.executeUpdate(query);
        db1.close();

    }
    public static DBConnection getInstance() throws SQLException {
        if (dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
