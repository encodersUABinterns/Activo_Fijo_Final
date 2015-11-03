
package Logica;

import Datos.vT_cuentas;
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
public class fT_cuentas {

    private conexion conexi = new conexion();
    private Connection cn = conexi.conectar();;
    private String sSQL = "";
    public Integer totalregistro;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        Statement consulta = null;

        String[] titulos = {"ID", "orden", "descripcion", "vida_util", "depreciacion"};
        String[] registro = new String[5];
        totalregistro = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = ("Select* from t_cuentas where descripcion like '%" + buscar + "%' order by id_cuenta desc");
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id_cuenta");
                registro[1] = rs.getString("orden");
                registro[2] = rs.getString("descripcion");
                registro[3] = rs.getString("vida_util");
                registro[4] = rs.getString("depreciacion");
                totalregistro = totalregistro + 1;
                modelo.addRow(registro);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    public boolean insertar(vT_cuentas dts) {
        sSQL = "insert into t_cuentas (orden,descripcion,vida_util,depreciacion)"
                + "values (?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getOrden());
            pst.setString(2, dts.getDescripcion());
            pst.setInt(3, dts.getVida_util());
             pst.setDouble(4, dts.getDepreciacion());
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
    public boolean editar (vT_cuentas dts){
       sSQL="update t_cuentas set orden=?,descripcion=?,vida_util=?,depreciacion"+
               " where id_cuenta=?";
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getOrden());
           pst.setString(2, dts.getDescripcion());
           pst.setInt(3, dts.getVida_util());
           pst.setDouble(4, dts.getDepreciacion());
                           
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
     public boolean eliminar (vT_cuentas dts){
       sSQL="delete from t_cuentas where id_cuenta=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getId_cuenta());
           
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
