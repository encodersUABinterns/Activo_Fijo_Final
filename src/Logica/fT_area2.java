
package Logica;

import Datos.vT_area2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Augustito
 */
public class fT_area2 {
    private conexion conexi = new conexion();
    private Connection cn = conexi.conectar();;
    private String sSQL = "";
    public Integer totalregistro;
    
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        Statement consulta = null;

        String[] titulos = {"id_area2", "nombre", "sigla", "provincia", "SiglaProv", "carrera","SiglaCarrera", "id_area1"};
        String[] registro = new String[8];
        totalregistro = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = ("Select* from t_area2 where nombre like '%" + buscar + "%' order by id_area2 desc");
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id_area2");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("sigla");
                registro[3] = rs.getString("provincia");
                registro[4] = rs.getString("sigla_provincia");
                registro[5] = rs.getString("carrera");
                registro[6] = rs.getString("sigla_carrera");
                registro[7] = rs.getString("id_area1");
                totalregistro = totalregistro + 1;
                modelo.addRow(registro);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
     public boolean insertar(vT_area2 dts) {
        sSQL = "insert into t_area2 (nombre,sigla,provincia,sigla_provincia,carrera,sigla_carrera,id_area1)"
                + "values (?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getSigla());
            pst.setString(3, dts.getProvincia());
            pst.setString(4, dts.getSiglaprovincia());
            pst.setString(5, dts.getCarrera());
            pst.setString(6, dts.getSiglacarrera());
            pst.setInt(7, dts.getId_area1());
            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean eliminar (vT_area2 dts){
       sSQL="delete from t_area2 where id_area2=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getId_area2());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
      public boolean editar (vT_area2 dts){
       sSQL="update t_area2 set nombre=?,sigla=?,provincia=?,sigla_provincia=?,carrera=?,sigla_carrera=?,id_area1=?"+
               " where id_area2=?";
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getSigla());
           pst.setString(3, dts.getProvincia());
            pst.setString(4, dts.getSiglaprovincia());
           pst.setString(5, dts.getCarrera());
            pst.setString(6, dts.getSiglacarrera());
           pst.setInt(7, dts.getId_area1());
                    
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
}
