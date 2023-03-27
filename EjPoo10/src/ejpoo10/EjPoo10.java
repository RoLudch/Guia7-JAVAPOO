/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo10;

import Entidades.Arreglo;
import Servicios.ArregloServicios;

/**
 *
 * @author Fraedusa
 */
public class EjPoo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArregloServicios as = new ArregloServicios();
      Arreglo a1 = as.crearArreglo();      
      
      as.iniciar(a1);
      
    }
    
}
