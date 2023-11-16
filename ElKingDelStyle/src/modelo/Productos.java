
package modelo;


public class Productos {
    private int cod;
    private String nombre,rut,producto;

    public Productos(int cod, String nombre, String rut, String producto) {
        this.cod = cod;
        this.nombre = nombre;
        this.rut = rut;
        this.producto = producto;
    }

    public int getCod() {
        return cod;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getProducto() {
        return producto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    
}
