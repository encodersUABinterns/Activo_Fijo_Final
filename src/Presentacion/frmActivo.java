package Presentacion;

import Datos.vActivo;
import Logica.fActivo;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Blady
 */
public class frmActivo extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmActivo
     */
    public frmActivo() {
        initComponents();
        mostrar("");
        inhabilitar();
    }
    private String accion = "guardar";
    private String codigo = "HMJ";

    void ocultar_columnas() {
        tblistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tblistado.getColumnModel().getColumn(0).setMinWidth(0);
        tblistado.getColumnModel().getColumn(0).setPreferredWidth(0);

        tblistado.getColumnModel().getColumn(9).setMaxWidth(0);
        tblistado.getColumnModel().getColumn(9).setMinWidth(0);
        tblistado.getColumnModel().getColumn(9).setPreferredWidth(0);

        tblistado.getColumnModel().getColumn(10).setMaxWidth(0);
        tblistado.getColumnModel().getColumn(10).setMinWidth(0);
        tblistado.getColumnModel().getColumn(10).setPreferredWidth(0);
    }

    void inhabilitar() {
        txtid_activo.setVisible(false);
        txtid_subarea.setVisible(false);
        txtid_cuenta.setVisible(false);
        txtsiglaarea.setVisible(false);
        txtsiglaprovincia.setVisible(false);
        txtsiglafacultad.setVisible(false);
        txtsiglacarrera.setVisible(false);
        txtdepreciacion.setVisible(false);

        jTextdescripcion.setEnabled(false);
        dcfechaadq.setEnabled(false);
        dcfecharegistro.setEnabled(false);
        txtseciondpto.setEnabled(false);
        txtcosto.setEnabled(false);
        txtvidaestimada.setEnabled(false);
        txtcantidad.setEnabled(false);
        txtcod.setEnabled(false);
        txtcuenta.setEnabled(false);
        txtarea.setEnabled(false);
        txtfacultades.setEnabled(false);
        txtcodsubarea.setEnabled(false);

        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnbuscardptos.setEnabled(false);
        btnbuscarcuenta.setEnabled(false);
        btnbuscararea.setEnabled(false);
        btnbuscarfacultades.setEnabled(false);

        txtid_activo.setText("");
        txtid_subarea.setText("");
    }

    void habilitar() {
        txtid_activo.setVisible(false);
        txtid_subarea.setVisible(false);
        txtid_cuenta.setVisible(false);
        txtsiglaarea.setVisible(false);
        txtsiglaprovincia.setVisible(false);
        txtsiglafacultad.setVisible(false);
        txtsiglacarrera.setVisible(false);
        txtdepreciacion.setVisible(false);

        jTextdescripcion.setEnabled(true);
        dcfechaadq.setEnabled(true);
        dcfecharegistro.setEnabled(true);
        txtseciondpto.setEnabled(false);
        txtcosto.setEnabled(true);
        txtvidaestimada.setEnabled(true);
        txtcantidad.setEnabled(true);
        txtcod.setEnabled(false);
        txtcuenta.setEnabled(false);
        txtarea.setEnabled(false);
        txtfacultades.setEnabled(false);
        txtcodsubarea.setEnabled(false);

        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);
        btneliminar.setEnabled(true);
        btnbuscardptos.setEnabled(true);
        btnbuscarcuenta.setEnabled(true);
        btnbuscararea.setEnabled(true);
        btnbuscarfacultades.setEnabled(true);

        txtid_activo.setText("");
        txtid_subarea.setText("");
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fActivo func = new fActivo();
            modelo = func.mostrar(buscar);

            tblistado.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros.setText("Total Registros " + Integer.toString(func.totalregistro));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtcantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dcfechaadq = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        dcfecharegistro = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtcosto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtvidaestimada = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        txtid_activo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtseciondpto = new javax.swing.JTextField();
        txtid_subarea = new javax.swing.JTextField();
        btnbuscardptos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextdescripcion = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtid_cuenta = new javax.swing.JTextField();
        txtcuenta = new javax.swing.JTextField();
        btnbuscarcuenta = new javax.swing.JButton();
        txtcod = new javax.swing.JTextField();
        btnbuscarfacultades = new javax.swing.JButton();
        txtfacultades = new javax.swing.JTextField();
        txtsiglaprovincia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnbuscararea = new javax.swing.JButton();
        txtarea = new javax.swing.JTextField();
        txtsiglaarea = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtsiglacarrera = new javax.swing.JTextField();
        txtsiglafacultad = new javax.swing.JTextField();
        txtcodsubarea = new javax.swing.JTextField();
        txtdepreciacion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        lbltotalregistros = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblistado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("ACTIVOS");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO DE ACTIVOS"));

        jLabel3.setText("CANTIDAD");

        jLabel4.setText("FECHA ADQUIRIDA");

        jLabel5.setText("FECHA REGISTRO");

        jLabel6.setText("COSTO ADQUIRIDO");

        jLabel7.setText("VIDA ESTIMADA");

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/nuevo.GIF"))); // NOI18N
        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/guardar.png"))); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/cancelar.png"))); // NOI18N
        btncancelar.setText("CANCELAR");

        jLabel12.setText("SECCION / DPTO");

        btnbuscardptos.setText("....");
        btnbuscardptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscardptosActionPerformed(evt);
            }
        });

        jTextdescripcion.setColumns(20);
        jTextdescripcion.setRows(5);
        jScrollPane2.setViewportView(jTextdescripcion);

        jLabel10.setText("Descripcion");

        jLabel13.setText("CUENTA O RUBRO");

        btnbuscarcuenta.setText("....");
        btnbuscarcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarcuentaActionPerformed(evt);
            }
        });

        btnbuscarfacultades.setText("....");
        btnbuscarfacultades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarfacultadesActionPerformed(evt);
            }
        });

        jLabel14.setText("FACULTADES/SUBAREAS");

        btnbuscararea.setText("....");
        btnbuscararea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarareaActionPerformed(evt);
            }
        });

        jLabel15.setText("AREA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnnuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncancelar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtid_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(45, 45, 45)
                                        .addComponent(txtid_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtdepreciacion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscarcuenta))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtsiglaarea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtarea, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnbuscararea))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtid_subarea, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtsiglacarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtcodsubarea, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtseciondpto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnbuscardptos))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtsiglafacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtsiglaprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtfacultades, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnbuscarfacultades))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dcfechaadq, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dcfecharegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel3))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtvidaestimada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(252, 252, 252))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtid_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdepreciacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtid_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(btnbuscarcuenta)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtsiglaarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnbuscararea)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfacultades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsiglaprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(btnbuscarfacultades)
                            .addComponent(txtsiglacarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsiglafacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtseciondpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid_subarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(btnbuscardptos)
                            .addComponent(txtcodsubarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(dcfechaadq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtvidaestimada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcfecharegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btnguardar)
                    .addComponent(btncancelar)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTADOS DE ACTIVOS"));

        jLabel16.setText("Buscar");

        lbltotalregistros.setText("Registros");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscar.png"))); // NOI18N
        jButton3.setText("buscar");

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/salir.gif"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        tblistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblistadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblistado);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btneliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsalir)
                                .addGap(0, 188, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(btneliminar)
                    .addComponent(btnsalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregistros))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";

    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (jTextdescripcion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una descripcion para el activo");
            jTextdescripcion.requestFocus();
            return;
        }
        if (txtcantidad.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una cantidad para el activo");
            txtcantidad.requestFocus();
            return;
        }

        if (txtcosto.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un precio  para para el registro de activo");
            txtcosto.requestFocus();
            return;
        }
        if (txtvidaestimada.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una vida aproximada para para el registro de activo");
            txtvidaestimada.requestFocus();
            return;
        }
        String comp3 = "";
        vActivo dts = new vActivo();
        fActivo func = new fActivo();
                
        dts.setCuenta(txtcuenta.getText());
        if (txtsiglaarea.getText().equals("AC")) {
            comp3 = txtsiglaarea.getText() + "." + txtsiglafacultad.getText();
        } else {
            if (txtsiglaarea.getText().equals("FP")) {
                comp3 = txtsiglacarrera.getText() + "." + txtsiglaprovincia.getText();
            } else {
                comp3 =  txtsiglafacultad.getText() + "." + txtsiglacarrera.getText();
            }
        }
        dts.setCodigo(codigo + "-" + txtcod.getText() + "-" + comp3 + "-" + txtcodsubarea.getText());
        dts.setDescripcion(jTextdescripcion.getText());
        dts.setCant(Integer.parseInt(txtcantidad.getText()));

        Calendar cal;
        int d, m, a;

        cal = dcfechaadq.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;

        dts.setFecha_adq(new Date(a, m, d));

        cal = dcfecharegistro.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;

        dts.setFecha_registro(new Date(a, m, d));
        dts.setCosto_adq(Double.parseDouble(txtcosto.getText()));
        dts.setDepresiacion(Double.parseDouble(txtcosto.getText()) * Double.parseDouble(txtdepreciacion.getText()));
        dts.setId_cuenta(Integer.parseInt(txtid_cuenta.getText()));
        dts.setId_subarea(Integer.parseInt(txtid_subarea.getText()));

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El Activo fue registrado satisfactoriamente");
                mostrar("");
                inhabilitar();

            }

        } else if (accion.equals("editar")) {
            dts.setId_activo(Integer.parseInt(txtid_activo.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El Activo fue Editado satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscardptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscardptosActionPerformed
        frmT_secciones form = new frmT_secciones();
        frmInicio.Escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnbuscardptosActionPerformed

    private void tblistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblistadoMouseClicked
        btnguardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion = "editar";

        int fila = tblistado.rowAtPoint(evt.getPoint());

        txtid_activo.setText(tblistado.getValueAt(fila, 0).toString());
        txtcuenta.setText(tblistado.getValueAt(fila, 1).toString());

        jTextdescripcion.setText(tblistado.getValueAt(fila, 1).toString());

        txtcantidad.setText(tblistado.getValueAt(fila, 4).toString());
        dcfechaadq.setDate(Date.valueOf(tblistado.getValueAt(fila, 5).toString()));
        dcfecharegistro.setDate(Date.valueOf(tblistado.getValueAt(fila, 6).toString()));
        txtcosto.setText(tblistado.getValueAt(fila, 7).toString());


    }//GEN-LAST:event_tblistadoMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnbuscarcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarcuentaActionPerformed
        frmT_cuentas form = new frmT_cuentas();
        frmInicio.Escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnbuscarcuentaActionPerformed

    private void btnbuscarfacultadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarfacultadesActionPerformed
        frmT_area2 form = new frmT_area2();
        frmInicio.Escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnbuscarfacultadesActionPerformed

    private void btnbuscarareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarareaActionPerformed
        frmT_area1 form = new frmT_area1();
        frmInicio.Escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnbuscarareaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmActivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscararea;
    private javax.swing.JButton btnbuscarcuenta;
    private javax.swing.JButton btnbuscardptos;
    private javax.swing.JButton btnbuscarfacultades;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private com.toedter.calendar.JDateChooser dcfechaadq;
    private com.toedter.calendar.JDateChooser dcfecharegistro;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextdescripcion;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tblistado;
    public static javax.swing.JTextField txtarea;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcantidad;
    public static javax.swing.JTextField txtcod;
    public static javax.swing.JTextField txtcodsubarea;
    private javax.swing.JTextField txtcosto;
    public static javax.swing.JTextField txtcuenta;
    public static javax.swing.JTextField txtdepreciacion;
    private javax.swing.JTextField txtfacultades;
    private javax.swing.JTextField txtid_activo;
    public static javax.swing.JTextField txtid_cuenta;
    public static javax.swing.JTextField txtid_subarea;
    public static javax.swing.JTextField txtseciondpto;
    public static javax.swing.JTextField txtsiglaarea;
    private javax.swing.JTextField txtsiglacarrera;
    private javax.swing.JTextField txtsiglafacultad;
    private javax.swing.JTextField txtsiglaprovincia;
    private javax.swing.JTextField txtvidaestimada;
    // End of variables declaration//GEN-END:variables
}
