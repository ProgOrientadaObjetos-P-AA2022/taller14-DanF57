/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author Daniel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enlace c = new Enlace();
        for (int i = 0; i < c.obtenerDataEstudiante().size(); i++) {
            System.out.printf("%s", c.obtenerDataEstudiante().get(i));
        }
    }
}
