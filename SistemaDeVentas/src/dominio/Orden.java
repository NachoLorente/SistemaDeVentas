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
    

    //ToString:

    //método:
    static int cnt=1;
    public void agregarProducto(Producto producto){
        if (this.productos.size()<MAX_PRODUCTO){
            this.productos.add(producto);//agrega producto(p1,p2...) al ArrayList productos siempre que no exceda la cantidad max
        }else{
            System.out.println("ATENCIÓN:");
            System.out.println("ORDEN nº"+this.idOrden+": Se superó el máximo de productos por cesta por "+cnt+" producto/s");
            cnt++;
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
    public void mostrarOrden(){
     System.out.println("\nORDEN "+this.idOrden);//llamamos al atributo idOrden donde aparece el nº de orden
        for(Object elem:productos){
            System.out.println(elem);
        }
        
    }
    
    
    
}
