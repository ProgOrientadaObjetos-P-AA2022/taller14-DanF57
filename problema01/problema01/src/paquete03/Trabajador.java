/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author Daniel
 */
public class Trabajador {
    
    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mesSueldo;
    
    public Trabajador(String c, String n, String co, double s, String mS){
        cedula = c;
        nombres = n;
        correo = co;
        sueldo = s;
        mesSueldo = mS;
    }
    
    public void establecerNombres(String n){
        nombres = n;
    }
    
    public void establecerCedula(String c){
        cedula = c;
    }
    
    public void establecerCorreo(String c){
        correo = c;
    }
    
    public void establecerSueldo(double s){
        sueldo = s;
    }
    
    public void establecerMesSueldo(String m){
        mesSueldo = m;
    }
    
    public String obtenerNombres(){
        return nombres;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public String obtenerCorreo(){
        return correo;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
    public String obtenerMesSueldo(){
        return mesSueldo;
    }
    
    @Override
    public String toString(){
        String data = String.format("Cedula: %s\n"
                + "Nombres: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes del Sueldo: %.2f\n", 
                obtenerCedula(), 
                obtenerNombres(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMesSueldo());
        return data;
    }
}