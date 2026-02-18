/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.ArrayList;

import model.Empleado;

/**
 *
 * @author MANBIR
 */
public class Concesionario {

    public String nombre;
    public ArrayList<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    public void trabajarTodos() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getClass().getSimpleName() + " " + empleado.getName() + ": " + empleado.trabajar());
        }
    }

    public void mostrarSueldos() {
        for (Empleado empleado : empleados) {
            System.out.println("--------------------");
            System.out.println("Nombre: " + empleado.getName());
            System.out.println("Sueldo: " + empleado.calcularSueldo());
            System.out.println("--------------------");
        }

    }

}
