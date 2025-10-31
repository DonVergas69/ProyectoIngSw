//Rey

package pck_proyecto;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Producto {
    protected int idProducto;
    protected String nombre;
    protected String sabor;
    protected float precio;

    public Producto(int idProducto, String nombre, String sabor, float precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.sabor = sabor;
        this.precio = precio;
    }
    
    public Producto(){
        this(0,null,null,0.0f);
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void insertar_Producto(){
        Connection coneccion = Conexion_bd.getConection();
        String consulta = "INSERT INTO productos (nombre_producto,sabor,precio) VALUES (?,?,?);";
        try{
            PreparedStatement cs = coneccion.prepareStatement(consulta);
            cs.setString(1,nombre);
            cs.setString(2,sabor);
            cs.setFloat(3,precio);
            
            int filasInsertadas = cs.executeUpdate();
            
            if(filasInsertadas > 0){
                JOptionPane.showMessageDialog(null,"Se realizo con exito la incorporacion del nuevo producto","Todo bien",JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"no se insertaron los datos","error",JOptionPane.ERROR_MESSAGE);
            }
            
            if(cs != null){
                cs.close();
            } 
            if(coneccion != null){
                coneccion.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static ArrayList <Producto> Consultar_tablaProductos(){
        Connection con = Conexion_bd.getConection();
        String consulta = "SELECT * FROM productos";
        Statement st;
        ArrayList <Producto> productos = new ArrayList<>();
         try{
            st = con.createStatement();
            ResultSet resultado = st.executeQuery(consulta);
            while(resultado.next()){
                Producto prod = new Producto(resultado.getInt(1),resultado.getString(2),resultado.getString(3),resultado.getFloat(4));
                productos.add(prod);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
         return productos;
    }
    
    public boolean modificar_registro(int id_producto,String nombre,String sabor,float precio){
        boolean valid = false;
        Connection coneccion = Conexion_bd.getConection();
        
        try{
            String consulta = "UPDATE productos SET nombre_producto = ?,sabor = ?,precio = ? WHERE id_producto = ?";
            PreparedStatement st = coneccion.prepareStatement(consulta);
            st.setString(1, nombre);
            st.setString(2, sabor);
            st.setFloat(3, precio);
            st.setInt(4, id_producto);
            int filasAfectadas = st.executeUpdate();
            if(filasAfectadas >0){
                valid = false;
            }else{
                valid = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return valid;
    }
    public boolean eliminar_dato(int id_producto){
        boolean valid = false;
        Connection coneccion = Conexion_bd.getConection();
        
        try{
            String consulta = "DELETE FROM productos WHERE id_producto = ?";
            PreparedStatement st = coneccion.prepareStatement(consulta);
            st.setInt(1, id_producto);
            int filasAfectadas = st.executeUpdate();
            if(filasAfectadas >0){
                valid = false;
            }else{
                valid = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return valid;
    }
    
    public void busqueda_id(int id){
        Connection con = Conexion_bd.getConection();
        try{
            String consulta = "SELECT * FROM productos WHERE id_producto = " + id;
            PreparedStatement st;
            st = con.prepareStatement(consulta);
            ResultSet resultado = st.executeQuery(consulta);
            if(resultado.next()){
            JOptionPane.showMessageDialog(null,"ID: " +resultado.getInt(1) + " ,Nombre: " + resultado.getString(2) + 
                                          " ,Sabor: " + resultado.getString(3) + " ,Precio: " + resultado.getFloat(4),"Resultado",-1);
            
            }else{
                JOptionPane.showMessageDialog(null,"no se encontro el producto con ID" + id,"lo sentimos",0);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void busqueda_nombre(String nombre){
        Connection con = Conexion_bd.getConection();
        try{
            String consulta = "SELECT * FROM productos WHERE nombre_producto = " + nombre;
            PreparedStatement st;
            st = con.prepareStatement(consulta);
            ResultSet resultado = st.executeQuery(consulta);
            if(resultado.next()){
            JOptionPane.showMessageDialog(null,"ID: " +resultado.getInt(1) + " ,Nombre: " + resultado.getString(2) + 
                                          " ,Sabor: " + resultado.getString(3) + " ,Precio: " + resultado.getFloat(4),"Resultado",-1);
            
            }else{
                JOptionPane.showMessageDialog(null,"no se encontro el producto con nombre: " + nombre,"lo sentimos",0);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    }
