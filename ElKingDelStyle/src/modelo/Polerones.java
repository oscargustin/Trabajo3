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
public class Polerones extends Productos{
    //private int codPoleron;
    private String color;
    private int talla;

    public Polerones(String color, int talla, int Cod, String Nombre, String Rut, String Producto) {
        super(Cod, Nombre, Rut, Producto);
        this.color = color;
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public int getTalla() {
        return talla;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    
}