/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.sql.SQLException;
import paquete03.Trabajador;
import paquete02.Enlace;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();
        Scanner sc = new Scanner(System.in);
        String salida = "";
        do {
            System.out.println("Ingrese Cédula del trabajador");
            String cedula = sc.nextLine();
            System.out.println("Ingrese Nombres del trabajador");
            String nombres = sc.nextLine();
            System.out.println("Ingrese Correo del trabajador");
            String correo = sc.nextLine();
            System.out.println("Ingrese Sueldo del trabajdor");
            double sueldo = sc.nextDouble();
            sc.nextLine();//limpieza buffer
            System.out.println("Ingrese mes del sueldo");
            String mes = sc.nextLine();

            Trabajador trabajador = new Trabajador(cedula,
                    nombres, correo, sueldo, mes);
            c.insertarTrabajador(trabajador);

            System.out.println("Ingrese c si desea salir, "
                    + "x para continuar ingresando");
            salida = sc.nextLine();
        } while (salida.equals("x"));

    }
}
