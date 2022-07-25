/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Daniel
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Estudiante(String n, String ape, double c1, double c2, double c3) {
        nombre = n;
        apellido = ape;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public void establecerCalificacion1(double c1) {
        calificacion1 = c1;
    }

    public void establecerCalificacion2(double c2) {
        calificacion2 = c2;
    }

    public void establecerCalificacion3(double c3) {
        calificacion3 = c3;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String reporte = String.format("%s %s\n"
                + "  Calificaciones:\n"
                + "  %.2f\n"
                + "  %.2f\n"
                + "  %.2f\n"
                + "  Promedio: %.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerCalificacion1(),
                obtenerCalificacion2(),
                obtenerCalificacion3(),
                obtenerPromedio());
        return reporte;
    }

}
