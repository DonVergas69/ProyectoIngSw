/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pck_proyecto;

/**
 *
 * @author User
 */

import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion_bd {
    
    private static String url = "jdbc:mysql://localhost:3306/bd_heladeria";
    private static String user = "root";
    private static String password = "planZ/99";
    private static Connection con=null;
    
    public static Connection getConection(){
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"no se pudo establecer la conexion con la base de datos","Error",JOptionPane.ERROR_MESSAGE);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"no se encontro el driver","Error",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
    public void close(){
        try{
            con.close();
        }catch(SQLException e){
           System.out.println("Error al cerrar conexión a la BD: " + e.getMessage());  
        }
    }
}
