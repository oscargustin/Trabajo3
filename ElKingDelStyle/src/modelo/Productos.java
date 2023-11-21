
package modelo;


public abstract class Productos {
    private int cantidad;
    private String cod,producto;

    public Productos(String cod, int cantidad, String producto) {
        this.cod = cod;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCod() {
        return cod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getProducto() {
        return producto;
    }

    
    
}
