package id.academy.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/ac_perpustakaan";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
