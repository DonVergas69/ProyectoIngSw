/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pck_proyecto;

/**
 *
 * @author lenovo
 */
public class Usuario {
    protected int idUsuario;
    protected String nombre;
    protected String rol;
    protected String contrasena;

    public Usuario(int idUsuario, String nombre, String rol, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.rol = rol;
        this.contrasena = contrasena;
    }
    
    public Usuario(){
        this(0,null,null,null);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
