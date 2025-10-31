/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pck_proyecto;

/**
 *
 * @author
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion_bd {
    
    static String url = "jdbc:mysql://localhost:3306/bd_heladeria?useSSL=false&serverTimezone=UTC";
    static String user = "root";
    static String password = "isalowpoke"; // <-- Coloca tu contraseña si tienes una

    // 🔹 Método principal para establecer la conexión
    public static Connection getConection() {
        Connection con = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            ///¿como funcionan estos 2?
            con = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                null,
                "No se pudo establecer la conexión con la base de datos.\n" + e.getMessage(),
                "Error de conexión",
                JOptionPane.ERROR_MESSAGE
            );
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(
                null,
                "No se encontró el controlador JDBC.\n" + e.getMessage(),
                "Error del Driver",
                JOptionPane.ERROR_MESSAGE
            );
        }
        return con;
    }

    // 🔹 Método opcional para probar la conexión directamente
//    public static void main(String[] args) {
//        Connection prueba = getConection();
//        if (prueba != null) {
//            JOptionPane.showMessageDialog(null, "✅ Conexión exitosa con MySQL Workbench.");
//        } else {
//            JOptionPane.showMessageDialog(null, "❌ Falló la conexión con la base de datos.");
//        }
//    }
}

