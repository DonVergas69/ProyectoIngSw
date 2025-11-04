package pck_modelo;

import java.sql.PreparedStatement;
import pck_proyecto.Conexion_bd;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Usuario_DB {
    private PreparedStatement PS = null;
    private final Conexion_bd CNX;
    private final String SQL_SELECT = "SELECT * FROM usuario";
    private DefaultTableModel DTM = null;
    private ResultSet RS = null;
    
    public Usuario_DB(){
        this.PS = null;
        this.CNX = new Conexion_bd();
        
    }
    
    private DefaultTableModel setTitulos(){
        DTM = new DefaultTableModel();
        
        DTM.addColumn("ID Usuario");
        DTM.addColumn("Nombre");
        DTM.addColumn("Puesto");
        DTM.addColumn("Contrasena");
        
        return DTM;
    }
    
    public DefaultTableModel getDatos(){
        try{
            setTitulos();
            PS = CNX.getConection().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            Object[] fila = new Object[4];
            
            while(RS.next()){
                fila[0] = RS.getInt(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getString(3);
                fila[3] = RS.getString(4);
                DTM.addRow(fila);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al consultar los datos","Error",0);
        }finally{
            PS = null;
            RS = null;
            CNX.close();
        }
        
        return DTM;
    }
    
    public int actualizarUsuario(int id, String nombre, String puesto, String contrasena){
        int res = 0;
        String SQL_UPDATE = "UPDATE usuario SET nombre='"+nombre+"',puesto='"+puesto+"',contrasena='"+contrasena+"' WHERE idUsuario="+id;
        
        try{
            PS = CNX.getConection().prepareStatement(SQL_UPDATE);
            res = PS.executeUpdate();
            if(res>0)
                JOptionPane.showMessageDialog(null,"Usuario actualizado.","Modificar usuario",1);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al actualizar los datos.","Error",0);
        }finally{
            PS = null;
            CNX.close();
        }
        
        return res;
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
    
    public boolean iniciarSesion(int id, String contrasena){
        String SQL_LOGIN = null;
        boolean encontrado = false;
        
        try{
            SQL_LOGIN = "SELECT * FROM usuario WHERE idUsuario="+id;
            PS = CNX.getConection().prepareStatement(SQL_LOGIN);
            RS = PS.executeQuery();
            
            while(RS.next()){
                int aux = RS.getInt(1);
                String contAux = RS.getString(4);

                if(id == aux){
                    if(contrasena.equals(contAux)){
                        encontrado = true;
                    }
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al consultar la BD\n" +
                                            e.getMessage(),"Error",0);
        }finally{
            PS = null;
            RS = null;
            CNX.close();
        }
        
        return encontrado;
    }
}
