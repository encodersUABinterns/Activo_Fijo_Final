
package Datos;

/**
 *
 * @author Augusto
 */
public class vT_subareas {
    private int id_subareas;
    private String nombre;
    private int cod;
    private int id_area2;

    public vT_subareas(int id_subareas, String nombre, int cod, int id_area2) {
        this.id_subareas = id_subareas;
        this.nombre = nombre;
        this.cod = cod;
        this.id_area2 = id_area2;
    }

    public vT_subareas() {
    }

    public int getId_subareas() {
        return id_subareas;
    }

    public void setId_subareas(int id_subareas) {
        this.id_subareas = id_subareas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getId_area2() {
        return id_area2;
    }

    public void setId_area2(int id_area2) {
        this.id_area2 = id_area2;
    }
    
    
}
