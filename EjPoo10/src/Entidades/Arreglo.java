/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Arrays;

/**
 *
 * @author Fraedusa
 */
public class Arreglo {

    private double arreglo[] = new double[50];
    private double arregloB[] = new double[20];

    public Arreglo() {
    }

    public double[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(double[] arreglo) {
        this.arreglo = arreglo;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }

    @Override
    public String toString() {
        return "Arreglo{" + "arreglo=" + arreglo + ", arregloB=" + arregloB + '}';
    }

    public void llenarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (double) (Math.random() * 10);

        }
    }

    public void mostrarArreglo(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");

        }

    }
    
    public void ordenar(){
        Arrays.sort(arreglo);
    }
    
    public void llenarArregloB(){
        for (int i = 0; i < 20; i++) {
            if(i<10){
                arregloB[i]=arreglo[i];
            }
            else {
                arregloB[i]=0.5;
            }  
        }
    }
    
}
