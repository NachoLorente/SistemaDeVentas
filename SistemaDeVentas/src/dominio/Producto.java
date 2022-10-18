package dominio;

import java.util.Objects;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    static private int contadorProductos;
    
    //Constuctor:
    
    public Producto() {
        this.idProducto=++contadorProductos;//idProducto=1+contadorProducto, cada vez que se cree un objeto nuevo se suamará 1
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto=++contadorProductos; //idProducto=1+contadorProducto, cada vez que se cree un objeto nuevo se suamará 1
    }
    
    
     //Get & Set:
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
     //Hash Equals:
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.idProducto;
        hash = 19 * hash + Objects.hashCode(this.nombre);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 19 * hash + this.contadorProductos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.contadorProductos != other.contadorProductos) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    //ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" idProducto: ").append(idProducto);
        sb.append("\n   Nombre: ").append(nombre);
        sb.append("\n   precio: ").append(precio);
        return sb.toString();
    }

   
    
    
}
