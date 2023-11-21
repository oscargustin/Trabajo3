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
    private String color, cierre;

    public Polerones(String color, String cierre, String cod, int cantidad, String producto) {
        super(cod, cantidad, producto);
        this.color = color;
        this.cierre = cierre;
    }

    public String getColor() {
        return color;
    }

    public String getCierre() {
        return cierre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCierre(String cierre) {
        this.cierre = cierre;
    }


    

    
}