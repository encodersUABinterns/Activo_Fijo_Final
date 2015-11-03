package Logica;

//import java.sql.Connection;
import Datos.vActivo;
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
public class fActivo {
    private conexion conexi = new conexion();
    private Connection cn = conexi.conectar();
    private String sSQL = "";
    public Integer totalregistro;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        
        String[] titulos = {"ID", "cuenta", "codigo", "descripcion", "cant", "fecha_adq", "fecha_registro", "costo_adq", "depresiacion", "id_cuenta"};
        String[] registro = new String[10];
        totalregistro = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = ("Select * from t_activo where cuenta like '%" + buscar + "%'");
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id_activo");
                registro[1] = rs.getString("cuenta");
                registro[2] = rs.getString("codigo");
                registro[3] = rs.getString("descripcion");
                registro[4] = rs.getString("cant");
                registro[5] = rs.getString("fecha_adq");
                registro[6] = rs.getString("fecha_registro");
                registro[7] = rs.getString("costo_adq");
                registro[8] = rs.getString("depresiacion");
                registro[9] = rs.getString("id_cuenta");

                totalregistro = totalregistro + 1;
                modelo.addRow(registro);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(vActivo dts) {
        sSQL = "insert into t_activo (cuenta,codigo,descripcion,cant,fecha_adq,fecha_registro,costo_adq,depresiacion,id_cuenta)"
                + "values (?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getCuenta());
            pst.setString(2, dts.getCodigo());
            pst.setString(3, dts.getDescripcion());
            pst.setInt(4, dts.getCant());
            pst.setDate(5, dts.getFecha_adq());
            pst.setDate(6, dts.getFecha_registro());
            pst.setDouble(7, dts.getCosto_adq());
            pst.setDouble(8, dts.getDepresiacion());
            pst.setInt(9, dts.getId_cuenta());

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

    public boolean editar(vActivo dts) {
        sSQL = "update t_activo set cuenta=?,codigo=?,descripcion=?,cant=?,fecha_adq=?,fecha_registro=?,costo_adq=?,depresiacion=?,id_cuenta=?"
                + " where id_activo=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getCuenta());
            pst.setString(2, dts.getCodigo());
            pst.setString(3, dts.getDescripcion());
            pst.setInt(4, dts.getCant());
            pst.setDate(5, dts.getFecha_adq());
            pst.setDate(6, dts.getFecha_registro());
            pst.setDouble(7, dts.getCosto_adq());
            pst.setDouble(8, dts.getDepresiacion());
            pst.setInt(9, dts.getId_cuenta());

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
