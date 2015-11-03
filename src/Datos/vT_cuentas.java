/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Augusto
 */
public class vT_cuentas {
    private int id_cuenta;
    private String orden;
    private String descripcion;
    private int vida_util;
    private double depreciacion;

    public vT_cuentas(int id_cuenta, String orden, String descripcion, int vida_util, double depreciacion) {
        this.id_cuenta = id_cuenta;
        this.orden = orden;
        this.descripcion = descripcion;
        this.vida_util = vida_util;
        this.depreciacion = depreciacion;
    }

    public vT_cuentas() {
        
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getVida_util() {
        return vida_util;
    }

    public void setVida_util(int vida_util) {
        this.vida_util = vida_util;
    }

    public double getDepreciacion() {
        return depreciacion;
    }

    public void setDepreciacion(double depreciacion) {
        this.depreciacion = depreciacion;
    }
        
}
