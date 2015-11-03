/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import com.toedter.calendar.JDateChooser;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Augustito
 */
public class Eliminar {
    Connection conexion = null;
   
     public  void registrar_Activo(JComboBox cuenta)
    {
        ResultSet rs = null;
        Statement consulta = null;
        Double depr= 0.1; //Depresiacion 10%
        Double de=0.0;
        
        
        try
        {  
            //consulta = conexion.createStatement();
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
//        java.util.Date fecha= fech_adq.getDate();
//        java.util.Date fecha2= fech_reg.getDate();
//        String fechaadq = formato.format(fecha);
//        String fecharegistro = formato.format(fecha);
//        de= Double.parseDouble(costo_adq.getText())*depr/360*360;
            //seleccionamos la tabla de la base de datos la cual lleva por nombre trabajadores
            //consulta.executeUpdate("insert into t_activo(cuenta, codigo,descripcion,cant,fecha_adq,fecha_registro,costo_adq,depresiacion,vida_estimad,id_cuenta) values('" +cuenta.getSelectedItem() + "','" + serie +"','" + descrip.getText() +"','" +cant.getText() +"','" + fechaadq +"','"+fecharegistro+"','" + costo_adq.getText() +"','" + de +"','" +vida_util.getText()+"','"+ id_cuenta + "')");
            JOptionPane.showMessageDialog(null, "se eligio la cuenta"+cuenta.getSelectedItem().toString());
//            cant.setText(null);
//            costo_adq.setText(null);
//            vida_util.setText(null);
                                
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
}
