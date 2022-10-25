/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.accesodatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Alumno Mañana
 */
public class ImpTxt implements IAccesoDatos{
   //Segundo: se desarrolla el método llamado en la Interfaz "IAccesoDatos", cada uno de ellos sobreescrito
    @Override
    public void crearArchivo(String nombre) {
       //Creo objeto de tipo File donde paso el nombre del fichero
       File archivo=new File(nombre);
       try{
           PrintWriter salida= new PrintWriter(archivo);
           salida.close();
       //Creo una excepción ya que puede que no exista el archivo en el que quiero escribir
       }catch (FileNotFoundException ex){
           ex.printStackTrace (System.out);
       }
    }
}
