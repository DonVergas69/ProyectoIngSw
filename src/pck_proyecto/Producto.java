package pck_proyecto;

public class Producto {
    protected int idProducto;
    protected String nombre;
    protected String sabor;
    protected double precio;
    protected int stock;

    public Producto(int idProducto, String nombre, String sabor, double precio, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.sabor = sabor;
        this.precio = precio;
        this.stock = stock;
    }
    
    public Producto(){
        this(0,null,null,0.0,0);
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
