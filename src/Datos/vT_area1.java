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
public class vT_area1 {
    private int id_area1;
    private String nombre;
    private String sigla;
    private int id_cuenta;

    public vT_area1(int id_area1, String nombre, String sigla, int id_cuenta) {
        this.id_area1 = id_area1;
        this.nombre = nombre;
        this.sigla = sigla;
        this.id_cuenta = id_cuenta;
    }

    public vT_area1() {
    }

    public int getId_area1() {
        return id_area1;
    }

    public void setId_area1(int id_area1) {
        this.id_area1 = id_area1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

   
    
}
