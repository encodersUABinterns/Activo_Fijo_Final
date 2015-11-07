
package Datos;

import java.sql.Date;

/**
 *
 * @author Augusto
 */
public class vActivo {
    private int id_activo;
    private String cuenta;
    private String codigo;
    private String descripcion;
    private int cant;
    private Date fecha_adq;
    private Date fecha_registro;
    private double costo_adq;
    private double depresiacion;
    private int id_cuenta;
    private int id_subarea;

    public vActivo(int id_activo, String cuenta, String codigo, String descripcion, int cant, Date fecha_adq, Date fecha_registro, double costo_adq, double depresiacion, int id_cuenta,int id_subarea) {
        this.id_activo = id_activo;
        this.cuenta = cuenta;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cant = cant;
        this.fecha_adq = fecha_adq;
        this.fecha_registro = fecha_registro;
        this.costo_adq = costo_adq;
        this.depresiacion = depresiacion;
        this.id_cuenta = id_cuenta;
        this.id_subarea= id_subarea;
    }

    public vActivo() {
    }

    public int getId_activo() {
        return id_activo;
    }

    public void setId_activo(int id_activo) {
        this.id_activo = id_activo;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Date getFecha_adq() {
        return fecha_adq;
    }

    public void setFecha_adq(Date fecha_adq) {
        this.fecha_adq = fecha_adq;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public double getCosto_adq() {
        return costo_adq;
    }

    public void setCosto_adq(double costo_adq) {
        this.costo_adq = costo_adq;
    }

    public double getDepresiacion() {
        return depresiacion;
    }

    public void setDepresiacion(double depresiacion) {
        this.depresiacion = depresiacion;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    /**
     * @return the id_subarea
     */
    public int getId_subarea() {
        return id_subarea;
    }

    /**
     * @param id_subarea the id_subarea to set
     */
    public void setId_subarea(int id_subarea) {
        this.id_subarea = id_subarea;
    }
    
}
