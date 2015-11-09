package Logica;

/**
 *
 * @author Augustito
 */

//import java.sql.*; //importamos java.sql para poder trabajar con SQL :P
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

    public String db = "Activos_Fijos";
    public String url = "jdbc:postgresql://192.168.1.125:5432/" + db;
    public String user = "postgres";
    public String pass = "DTICSW15.";
    public Connection conexion = null;

    public conexion() {
    }

    public Connection conectar() {
        Connection link = null;

        try {
            Class.forName("org.postgresql.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);

        }

        return link;
    }
//    public void conectar()
//    {
//        String cadena = "jdbc:postgresql://192.168.1.125:5432/" + db;
//        String password = "DTICSW15";
//        String user = "postgres";
//        try {
//            Class.forName("org.postgresql.Driver");
//            conexion = DriverManager.getConnection(cadena,user,password);
//        }
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(null,e.getMessage());
//        }
//    }

    public void cierraConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
            System.out.println("Problema para cerrar la Conexión a la base de datos ");
        }
    }
}
