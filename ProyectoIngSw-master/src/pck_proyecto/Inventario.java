package pck_proyecto;

public class Inventario {
    protected int id_inventario;
    protected int numProductos;
    protected int id_producto;
    protected String seccion;
    protected String posicion;

    public Inventario(int id_inventario, int numProductos, int id_producto, String seccion, String posicion) {
        this.id_inventario = id_inventario;
        this.numProductos = numProductos;
        this.id_producto = id_producto;
        this.seccion = seccion;
        this.posicion = posicion;
    }
    
    public Inventario(){
        this(0,0,0,null,null);
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    
}
