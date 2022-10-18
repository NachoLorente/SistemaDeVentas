package test;

import dominio.Orden;
import dominio.Producto;
import java.util.ArrayList;
import java.util.List;

public class Ventas {

    public static void main(String[] args){
       
       //Primero se debe instanciar objetos utilizando los constructores que necesite 
       Producto p1 = new Producto("Aguacate",4);
       Producto p2 = new Producto("Ostras",6);
       Producto p3 = new Producto("Peras",2);
       Producto p4 = new Producto("Atún",5);
       Producto p5 = new Producto("Lomo",3);
       //es necesario instanciar un objeto de la clase 'Orden' para poder llamar a los métodos que contiene, ya que el ArrayList esta dentro de esta clase:
        Orden o1=new Orden();//utilizando el constructor vacío
       //llamamos al objeto creado 'o1' a su método 'agregarProducto' y el objeto que queremos agregar al ArrayList:
       o1.agregarProducto(p1);
       o1.agregarProducto(p2);
       o1.agregarProducto(p3);
       o1.agregarProducto(p4);
       o1.agregarProducto(p5);
       
       //método para imprimir compra
       o1.monstrarOrden();
       //Método para el valor total de la compra
       System.out.println("el total es: "+o1.calcularTotal()+"€");
       
    }
}
