package pck_modelo;

import java.sql.PreparedStatement;
import pck_proyecto.Conexion_bd;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Usuario_DB {
    private PreparedStatement PS;
    private final Conexion_bd CNX;
    
    public Usuario_DB(){
        this.PS = null;
        this.CNX = new Conexion_bd();
    }
    
    public int agregarUsuario(int id,String nombre,String puesto, String contrasena){
        int res = 0;
        
        String sql_insert = "INSERT INTO usuario(idUsuario,nombre,puesto,contrasena) values(?,?,?,?)";
        
        try{
            PS = CNX.getConection().prepareStatement(sql_insert);
            PS.setInt(1,id);
            PS.setString(2,nombre);
            PS.setString(3,puesto);
            PS.setString(4,contrasena);
            
            res = PS.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"Registro Exitoso","Agregar un producto",1);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al registrar en la BD.\n" +
                                        e.getMessage(),"Error de registro",2);
        }finally{
            PS = null;
            CNX.close();
        }
        
        return res;
    }
}
