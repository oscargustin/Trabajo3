/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Acid8
 */
public class Zapatillas extends Productos {
    
    private String marca;
    private int talla;

    public Zapatillas(String marca, int talla, String cod, int cantidad, String producto) {
        super(cod, cantidad, producto);
        this.marca = marca;
        this.talla = talla;
    }

    public String getColor() {
        return marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setColor(String color) {
        this.marca = color;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
}