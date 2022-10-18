package dominio;

import java.util.ArrayList;
import java.util.Arrays;



public class Orden {
    private int idOrden;
    //creo una colección de la clase Producto, ya que cada Orden tendrá una serie de productos
    ArrayList<Producto> productos = new ArrayList();
    static private int contadorOrdenes;
    static int MAX_PRODUCTO=10;
    
    //Constuctor:
    public Orden() {
        this.idOrden=++contadorOrdenes;//idOrden=1+contadorOrdenes, cada vez que se cree una orden nueva se suamará 1
    }

    //Get & Set:
    
    
    //Hash Equals:
    

    //ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orden{idOrden=").append(idOrden);
        sb.append(", productos=").append(productos);
        sb.append(", contadorOrdenes=").append(contadorOrdenes);
        sb.append('}');
        return sb.toString();
    }
    //método:
    static int cnt=0;
    public void agregarProducto(Producto producto){
      
        if (cnt<MAX_PRODUCTO){
            this.productos.add(producto);
            cnt++;
       }else{
            System.out.println("ATENCIÓN: Se superó el máximo de productos por cesta");
       }
     
    }
    //función:
    public double calcularTotal(){
        int sum=0;
        for (int i=0;i<productos.size();i++) {
            sum+=productos.get(i).getPrecio();
        }
        return sum;
    }
    //método:
    public void monstrarOrden(){
       
     System.out.println("Cesta de la compra: ");
     System.out.println("Orden "+this.idOrden);
        for(Object elem:productos){
            System.out.println(elem);
        }
        
    }
    
    
    
}
