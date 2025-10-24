package pck_proyecto;

import pck_fecha.Fecha;

public class Venta {
    protected int idVenta;
    protected double total;
    protected int idUsuario;
    protected int idProducto;
    protected Fecha fechaVenta;

    public Venta(int idVenta, double total, int idUsuario, int idProducto) {
        this.idVenta = idVenta;
        this.total = total;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
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

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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
