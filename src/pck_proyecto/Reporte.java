package pck_proyecto;
import pck_fecha.Fecha;

public class Reporte {
    protected int idReporte;
    protected int idVenta;
    protected Fecha fechaInicio;
    protected Fecha fechaFin;
    protected double totalVentas;
    protected double totalIngresos;

    public Reporte(int idReporte, int idVenta, Fecha fechaInicio, Fecha fechaFin, double totalVentas, double totalIngresos) {
        this.idReporte = idReporte;
        this.idVenta = idVenta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.totalVentas = totalVentas;
        this.totalIngresos = totalIngresos;
    }
    
    public Reporte(int idReporte, int idVenta, int dI, int mI, int aI, int dF, int mF, int aF, double totalVentas, double totalIngresos) {
        this.idReporte = idReporte;
        this.idVenta = idVenta;
        this.fechaInicio.setFecha(dI, mI, aI);
        this.fechaFin.setFecha(dF, mF, aF);
        this.totalVentas = totalVentas;
        this.totalIngresos = totalIngresos;
    }
    
    public Reporte(){
        this(0,0,null,null,0.0,0.0);
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFechaInicio() {
        return fechaInicio.getFecha();
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public boolean setFechaInicio(int d, int m, int a){
        this.fechaInicio.setFecha(d, m, a);
        return fechaInicio.fechaCorrecta();
    }

    public String getFechaFin() {
        return fechaFin.getFecha();
    }

    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public boolean setFechaFin(int d, int m, int a){
        this.fechaFin.setFecha(d, m, a);
        return fechaFin.fechaCorrecta();
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public double getTotalIngresos() {
        return totalIngresos;
    }

    public void setTotalIngresos(double totalIngresos) {
        this.totalIngresos = totalIngresos;
    }
    
    
}
