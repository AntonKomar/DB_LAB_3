package lab_3_java;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    public static Connection connection;

    public static void connector() {
           String userName = "postgres";
           String password = "230699";
           String url = "jdbc:postgresql://localhost:5432/postgres";
           try {
               Class.forName("org.postgresql.Driver");
               connection = DriverManager.getConnection(url, userName, password);
               System.out.println("DB connected");
           } catch (SQLException ex) {
               ex.printStackTrace();
               System.out.println(" Error : SQL exception ");
           } catch (ClassNotFoundException e) {
               e.printStackTrace();
           }
    }

    public static void disconnect() {
        try {
            connection.close();
            System.out.println(" DB is disconected ");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(" DB isn't disconected ");
        }
    }
}
