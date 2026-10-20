/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desglosedinero;

/**
 *
 * @author Admin
 */
public class Billete {
    private String Tipo;
    private int cantidad;

    public Billete(String Tipo, int cantidad) {
        this.Tipo = Tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    @Override
    public String toString() {
        return Tipo + " $" + cantidad;
    }

}
