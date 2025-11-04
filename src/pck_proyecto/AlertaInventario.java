//Lo que sea
package pck_proyecto;
import pck_fecha.Fecha;

public class AlertaInventario {
    protected int idAlerta;
    protected Fecha fechaAlerta;
    protected String tipoAlerta;
    protected int idProducto;
    //Lo que sea

    public AlertaInventario(int idAlerta, Fecha fechaAlerta, String tipoAlerta, int idProducto) {
        this.idAlerta = idAlerta;
        this.fechaAlerta = fechaAlerta;
        this.tipoAlerta = tipoAlerta;
        this.idProducto = idProducto;
    }
    
    public AlertaInventario(int idAlerta, int d, int m, int a, String tipoAlerta, int idProducto) {
        this.idAlerta = idAlerta;
        this.fechaAlerta.setFecha(d, m, a);
        this.tipoAlerta = tipoAlerta;
        this.idProducto = idProducto;
    }

    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public String getFechaAlerta() {
        return fechaAlerta.getFecha();
    }

    public void setFechaAlerta(Fecha fechaAlerta) {
        this.fechaAlerta = fechaAlerta;
    }
    
    public boolean setFechaAlerta(int d, int m, int a){
        this.fechaAlerta.setFecha(d, m, a);
        return fechaAlerta.fechaCorrecta();
    }

    public String getTipoAlerta() {
        return tipoAlerta;
    }

    public void setTipoAlerta(String tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    
}
