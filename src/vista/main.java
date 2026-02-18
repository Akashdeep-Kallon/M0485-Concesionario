/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.util.Scanner;

import model.Empleado;
import model.Gerente;
import model.Mecanico;
import model.Vendedor;

/**
 *
 * @author MANBIR
 */
public class main {

    /**
     * @param args the command line arguments
     */
    static Concesionario cn = new Concesionario();

    static int contV = 0, contM = 0, contG = 0;

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        int opc;
        System.out.println("---Menu Principal---");
        System.out.println("1. Crear empleado");
        System.out.println("2. Mostrar actividades de empleados");
        System.out.println("3. Mostrar el sueldo individual de cada empleado");
        System.out.println("4. Mostrar un resumen final de sueldos por tipo y el total");
        System.out.println("5. Salir");
        System.out.println("--------------------");

        System.out.print("Ingrese una opcion: ");
        opc = scanner.nextInt();
        return opc;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del concesionario: ");
        cn.nombre = sc.nextLine();

        int opc;

        do {
            opc = menu();
            switch (opc) {
                case 1:
                    if (contV < 2 || contM < 2 || contG < 2) {
                        System.out.println("Debes de crear al menos dos empleados de cada tipo.");
                        while (contV < 2 || contM < 2 || contG < 2) {
                            addEmpleado();
                        }
                    } else {
                        addEmpleado();
                    }

                    break;
                case 2:
                    cn.trabajarTodos();
                    break;
                case 3:
                    cn.mostrarSueldos();
                    break;
                case 4:
                    resumenSueldo();
                    break;
                case 5:
                    System.out.println("Exit, programa finalizado.");
                    break;
                    
                default:
                    System.err.print("Error, la opcion no existe.");
                    break;
            }
        } while (opc != 5);
    }

    public static void addEmpleado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tipo de Empleado (vendedor, mecanico o gerente): ");
        String tipoEmpleado = sc.nextLine();
        System.out.print("Nombre del Empleado: ");
        String nombre = sc.nextLine();
        switch (tipoEmpleado.toLowerCase()) {
            case "vendedor":
                Empleado vendedor = new Vendedor(nombre);
                cn.agregarEmpleado(vendedor);
                if (contV < 2) {
                    contV++;
                }
                System.out.println("Vendedor creado correctamente.");
                break;
            case "mecanico":
                Empleado mecanico = new Mecanico(nombre);
                cn.agregarEmpleado(mecanico);
                if (contM < 2) {
                    contM++;
                }
                System.out.println("Mecanico creado correctamente.");
                break;
            case "gerente":
                Empleado gerente = new Gerente(nombre);
                cn.agregarEmpleado(gerente);
                if (contG < 2) {
                    contG++;
                }
                System.out.println("Gerente creado correctamente.");
                break;
            default:
                System.err.println("Error!");
                addEmpleado();
                break;
        }

    }

    public static void resumenSueldo() {
        System.out.println("Resumen de sueldos: ");
        double totalSueldoGerente = 0;
        double totalSueldoMecanico = 0;
        double totalSueldoVendedor = 0;
        double totalSueldo = 0;
        for (Empleado empleado : cn.empleados) {
            String tipoEmpleado = empleado.getClass().getSimpleName();
            totalSueldo += empleado.calcularSueldo();
            switch (tipoEmpleado) {
                case "Gerente":
                    totalSueldoGerente += empleado.calcularSueldo();
                    break;
                case "Mecanico":
                    totalSueldoMecanico += empleado.calcularSueldo();
                    break;
                case "Vendedor":
                    totalSueldoVendedor += empleado.calcularSueldo();
                    break;
            }
        }
        System.out.println("Gerentes: " + totalSueldoGerente);
        System.out.println("Mecanicos: " + totalSueldoMecanico);
        System.out.println("Vendedores: " + totalSueldoVendedor);
        System.out.println("Total de sueldos: " + totalSueldo);
    }
}
