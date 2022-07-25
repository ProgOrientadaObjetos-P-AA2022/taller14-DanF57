/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

import paquete03.Trabajador;


public class Enlace {
    /** 
     * Connect to a sample database 
     * @return 
    */
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.bd";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarTrabajador(Trabajador trabajador) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO trabajadores "
                    + "(cedula, nombres, correo, sueldo, mesSueldo) "
                    + "values ('%s', '%s', '%s', '%.2f', '%s')", 
                    trabajador.obtenerCedula(), 
                    trabajador.obtenerNombres(),
                    trabajador.obtenerCorreo(),
                    trabajador.obtenerSueldo(),
                    trabajador.obtenerMesSueldo());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarTrabajador");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<Trabajador> obtenerDataTrabajadores() {  
        ArrayList<Trabajador> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from trabajadores;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Trabajador miPersona = new Trabajador(rs.getString("cedula"),
                rs.getString("nombres"),
                rs.getString("correo"),
                rs.getDouble("sueldo"),
                rs.getString("mesSueldo"));
                lista.add(miPersona);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarTrabajador");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
     
} 