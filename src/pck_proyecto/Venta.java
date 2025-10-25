package pck_proyecto;

import java.util.ArrayList;
import pck_fecha.Fecha;

public class Venta {
    protected int idVenta;
    protected double total;
    protected int idUsuario;
    protected Fecha fechaVenta;
    protected ArrayList<Integer> idProductos;
    protected ArrayList<Integer> cantidades;

    public Venta(int idVenta, double total, int idUsuario, int idProducto) {
        this.idVenta = idVenta;
        this.total = total;
        this.idUsuario = idUsuario;
        idProductos = new ArrayList<>();
        cantidades  = new ArrayList<>();
    }
    
    public Venta(){
        this(0,0.0,0,0);
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaVenta() {
        return fechaVenta.getFecha();
    }

    public void setFechaVenta(Fecha fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    public boolean setFechaVenta(int d, int m, int a){
        this.fechaVenta.setFecha(d, m, a);
        return fechaVenta.fechaCorrecta();
    }
}
