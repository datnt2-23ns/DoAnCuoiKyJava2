package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=LibraryDB;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Kết nối thành công!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Kết nối thất bại!");
        }
        return conn;
    }
}
