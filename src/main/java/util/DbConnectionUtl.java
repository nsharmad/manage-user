package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionUtl {

    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/ ";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "lewiston";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(DRIVER_NAME);
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);

    }

}
