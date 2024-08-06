package conexion;

import java.sql.*;
/**
 *
 * @author mikey
 */
public class Conexion {
    
    Connection cn;
    
    public Connection conexion(){
        try {
            String url = "jdbc:mysql://localhost:3306/sis_Ventas";
            cn = DriverManager.getConnection(url, "root", "12345678");
            return cn;
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error al conectarse a la base de datos: " + e.getMessage());
        }
        return null;
    }
}
