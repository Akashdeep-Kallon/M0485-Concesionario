/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MANBIR
 */
public class Vendedor extends Empleado {

    private double comision = 400;

    public Vendedor(String name) {
        super(name);
    }

    @Override
    public String trabajar() {
        return "El vendedor está atendiendo a clientes y mostrando los coches.";
    }

    @Override
    public double calcularSueldo() {
        double sueldoTotal = comision + sueldoBase;
        return sueldoTotal;
    }

}
