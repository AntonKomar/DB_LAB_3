package lab_3_java;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    public static Connection connection;

    public static void main(String[] args) {
        Connector.connector();
    }
    public static void connector() {
        String url = "jdbc:postgresql://217.23.154.1:5432/labdb";
        String userName = "antkom";
        String password = "antonkomaria61";
//        String s = "";
//        Scanner in = null;
//
//        try {
//            in = new Scanner(new File("lab_db/src/signIn.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while(in.hasNext()) {
//            s += in.nextLine();
//        }
//        in.close();
//
//        String[] data = s.split(" ");
//        url = data[0];
//        userName = data[1];
//        password = data[2];

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
