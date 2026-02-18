/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MANBIR
 */
public class Mecanico extends Empleado {

    private double bonoReparacion = 500;

    public Mecanico(String name) {
        super(name);
    }

    @Override
    public String trabajar() {
        return "El mecánico está revisando y reparando los coches.";
    }

    @Override
    public double calcularSueldo() {
        double sueldoTotal = bonoReparacion + sueldoBase;
        return sueldoTotal;
    }

}
