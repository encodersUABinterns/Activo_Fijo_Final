

package Logica;




import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Augustito
 */
public class activos {
    public Connection conexi = null;
   
    public String SERIE(int orden,String comp3,int comp4,int comp5){
    String result="";
    try{
        result=" HMJ-"+orden+"-"+comp3+"-"+comp4+"-"+comp5;
    }catch(Exception e){JOptionPane.showMessageDialog(null, "Error al concatenar el CODIGO");}
    return result;
    }
     public  void registrar(JTextField orden, JTextField descripcion,JTextField sigla)
    {
        ResultSet rs = null;
        Statement consulta = null;
        try
        {  
            consulta = conexi.createStatement();
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            consulta.executeUpdate("insert into t_cuentas(orden, descripcion,sigla) values('" + orden.getText() + "','" + descripcion.getText() +"','" + sigla.getText() + "')");
            JOptionPane.showMessageDialog(null, "Se ha ingresado correctamente");
            orden.setText(null);
            descripcion.setText(null);
             sigla.setText(null);
           
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
    
    
}
