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
public class vT_area2 {
    private int id_area2;
    private String nombre;
    private String sigla;
    private String provincia;
    private String carrera;
    private String siglaprovincia;
    private String siglacarrera;
    private int id_area1;

    public vT_area2(int id_area2, String nombre, String sigla, String provincia, String carrera,String siglprovinc,String siglcarrer ,int id_area1) {
        this.id_area2 = id_area2;
        this.nombre = nombre;
        this.sigla = sigla;
        this.provincia = provincia;
        this.carrera = carrera;
        this.siglaprovincia= siglprovinc;
        this.siglacarrera= siglcarrer;
        this.id_area1 = id_area1;
    }

    public vT_area2() {
    }

    public int getId_area2() {
        return id_area2;
    }

    public void setId_area2(int id_area2) {
        this.id_area2 = id_area2;
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

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getId_area1() {
        return id_area1;
    }

    public void setId_area1(int id_area1) {
        this.id_area1 = id_area1;
    }

    /**
     * @return the siglaprovincia
     */
    public String getSiglaprovincia() {
        return siglaprovincia;
    }

    /**
     * @param siglaprovincia the siglaprovincia to set
     */
    public void setSiglaprovincia(String siglaprovincia) {
        this.siglaprovincia = siglaprovincia;
    }

    /**
     * @return the siglacarrera
     */
    public String getSiglacarrera() {
        return siglacarrera;
    }

    /**
     * @param siglacarrera the siglacarrera to set
     */
    public void setSiglacarrera(String siglacarrera) {
        this.siglacarrera = siglacarrera;
    }
    
}
