package pck_proyecto;

import java.util.ArrayList;
import pck_fecha.Fecha;

public class Venta {
    protected int idVenta;
    protected double total;
    protected Fecha fechaVenta;
    protected int idProducto;
    protected int cantidad;

    public Venta(int idVenta, double total, int idProducto) {
        this.idVenta = idVenta;
        this.total = total;
        this.idProducto = idProducto;
    }
    
    public Venta(){
        this(0,0.0,0);
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
