/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Arreglo;

/**
 *
 * @author Fraedusa
 */
public class ArregloServicios {
    
    Arreglo a1 = new Arreglo();
    
    public Arreglo crearArreglo(){
        a1.llenarArreglo();
        a1.llenarArregloB();
        return a1;
        
}
    public void  iniciar(Arreglo a1){
        System.out.println("arreglo A");
        a1.mostrarArreglo(a1.getArreglo());
        System.out.println("arreglo B");
        a1.mostrarArreglo(a1.getArregloB());
    }



}