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
public class Conexion_bd {
    
    static String url = "jdbc:mysql://localhost:3306/bd_heladeria";
    static String user = "root";
    static String password = "PacMan_12";
    
    public static Connection getConection(){
        Connection con=null;
        try{
            con = DriverManager.getConnection(url,user,password);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
}
