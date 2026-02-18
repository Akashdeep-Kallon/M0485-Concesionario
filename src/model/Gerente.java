/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MANBIR
 */
public class Gerente extends Empleado {

    private double bonusGestion = 1000;
    private int horasTrabajo = 6;

    public Gerente(String name) {
        super(name);
    }

    @Override
    public String trabajar() {
        return "El gerente está supervisando el concesionario y coordinando al equipo.";
    }

    @Override
    public double calcularSueldo() {
        double sueldoTotal = bonusGestion + sueldoBase;
        return sueldoTotal;
    }

}
