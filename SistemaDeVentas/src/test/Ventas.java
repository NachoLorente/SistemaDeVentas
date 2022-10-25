package test;

import com.ventas.accesodatos.IAccesoDatos;
import com.ventas.accesodatos.ImpTxt;
import dominio.Orden;
import dominio.Producto;
import java.util.ArrayList;
import java.util.List;

public class Ventas {

    public static void main(String[] args){
       
       //Primero se debe instanciar objetos utilizando los constructores que necesite 
       Producto p1 = new Producto("Aguacate",4);
       Producto p2 = new Producto("Ostra",6);
       Producto p3 = new Producto("Pera",2);
       Producto p4 = new Producto("Atún",5);
       Producto p5 = new Producto("Lomo",3);
       Producto p6 = new Producto("Tomate",4);
       Producto p7 = new Producto("Pavo",6);
       Producto p8 = new Producto("Camarón",2);
       Producto p9 = new Producto("Mango",5);
       Producto p10 = new Producto("Pimiento",3);
       Producto p11 = new Producto("Café",3);
       Producto p12 = new Producto("Huevo",3);
       
       /*CREACIÓN OBJETO: es necesario instanciar un objeto de la clase 'Orden' para poder llamar a los métodos que contiene, 
       ya que el ArrayList esta dentro de esta clase:*/
        Orden o1=new Orden();//utilizando el constructor vacío creamos la orden 1
        Orden o2=new Orden();//utilizando el constructor vacío creamos la orden 2
       
       //llamamos al objeto creado 'o1' a su método 'agregarProducto' y el objeto que queremos agregar al ArrayList:
       o1.agregarProducto(p1);
       o1.agregarProducto(p2);
       o1.agregarProducto(p3);
       o1.agregarProducto(p4);
       o1.agregarProducto(p5);
       o1.agregarProducto(p6);
       o1.agregarProducto(p7);
       o1.agregarProducto(p8);
       o1.agregarProducto(p9);
       o1.agregarProducto(p10);
       o1.agregarProducto(p11);
       o1.agregarProducto(p12);
       
       o2.agregarProducto(p1);
       o2.agregarProducto(p2);
       o2.agregarProducto(p3);
       o2.agregarProducto(p4);
       o2.agregarProducto(p5);
       
       System.out.println("\nCESTA DE LA COMPRA: ");
       //ORDEN 1:
       //método para imprimir compra:
       o1.mostrarOrden();
       //Método para el valor total de la compra
       System.out.println("  TOTAL: "+o1.calcularTotal()+"€");
       //ORDEN 2:
       o2.mostrarOrden();
      //Método para el valor total de la compra
      System.out.println("  TOTAL: "+o2.calcularTotal()+"€");
    
       
      String nombreArchivo="Stock.txt";
      IAccesoDatos invocacion = new ImpTxt();
      
    }
}
