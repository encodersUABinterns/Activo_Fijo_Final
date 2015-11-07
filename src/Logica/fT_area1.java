/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.vT_area1;
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
public class fT_area1 {

    private conexion conexi = new conexion();
    private Connection cn = conexi.conectar();
    ;
    private String sSQL = "";
    public Integer totalregistro;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        Statement consulta = null;

        String[] titulos = {"id_area1", "Nombre", "Sigla"};
        String[] registro = new String[3];
        totalregistro = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = ("Select* from t_area1 where nombre like '%" + buscar + "%' order by id_area1 desc");
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id_area1");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("sigla");
                totalregistro = totalregistro + 1;
                modelo.addRow(registro);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(vT_area1 dts) {
        sSQL = "insert into t_area1 (nombre,sigla)"
                + "values (?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getSigla());
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

    public boolean editar(vT_area1 dts) {
        sSQL = "update t_area1 set nombre=?,sigla=?"
                + " where id_area1=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getSigla());

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

    public boolean eliminar(vT_area1 dts) {
        sSQL = "delete from t_area1 where id_area1=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getId_area1());

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
