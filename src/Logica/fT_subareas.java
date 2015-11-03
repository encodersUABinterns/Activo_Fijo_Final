
package Logica;

import Datos.vT_subareas;
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
public class fT_subareas {

    private conexion conexi = new conexion();
    private Connection cn = conexi.conectar();;
    private String sSQL = "";
    public Integer totalregistro;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
       
        String[] titulos = {"ID", "nombre", "Codigo", "id_area2"};
        String[] registro = new String[4];
        totalregistro = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = ("Select* from t_subareas where nombre like '%" + buscar + "%' order by id_subareas desc");
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id_subareas");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("cod");
                registro[3] = rs.getString("id_area2");
                totalregistro = totalregistro + 1;
                modelo.addRow(registro);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(vT_subareas dts) {
        sSQL = "insert into t_subareas (nombre,cod,id_area2)"
                + "values (?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setInt(2, dts.getCod());
            pst.setInt(3, dts.getId_area2());
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

    public boolean eliminar(vT_subareas dts) {
        sSQL = "delete from t_subareas where id_subareas=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getId_subareas());

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

    public boolean editar(vT_subareas dts) {
        sSQL = "update t_subareas set nombre=?,cod=?,id_area2=?"
                + " where id_subareas=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setInt(2, dts.getCod());
            pst.setInt(3, dts.getId_area2());
            
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
}
