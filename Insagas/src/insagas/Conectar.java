
package insagas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

private static Connection conn;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "elcoco86";
    private static final String PASSWORD = "12345678";
    private static final String URL = "jdbc:mysql://db4free.net:3306/insagas";
    
 public Conectar() throws SQLException {
        conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            if (conn != null) {
                System.out.println("Conexion OK");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: " + e);
        }
    }
  
 public Connection getConnection() {
        return conn;
    }
}


