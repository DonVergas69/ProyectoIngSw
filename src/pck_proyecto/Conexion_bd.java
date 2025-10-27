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
    
    static String url = "jdbc:mysql://localhost:3306/bd_heladeria";
    static String user = "root";
    static String password = "PacMan_12";
    
    public  Connection getConection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            JOptionPane.showMessageDialog(null,"Se establecio la conexion con el servidor","Todo bien",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"no se encontro el driver","Error",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}
