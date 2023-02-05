/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author lepo9
 */
public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int [3];//Con la sintaxis [] se determina que es un arreglo. Puede indicarse antes o despues del nombre de la variable
        /*
        Un arreglo es un objeto y hereda de la clase Object.
        Siempre se debe especificar el tipo y longitud del arreglo.
        Una vez se define el espacio del arreglo, este no puede crecer mas.
        */
        System.out.println("edades = " + edades);
        
        /*
        Ahora se realizara modificaciones al arreglo
        */
        
        edades[0] = 10;
        edades[1] = 11;
        edades[2] = 12;
        System.out.println("edades[0] = " + edades[0]);
        
        /*
        Acceder a elementos fuera del arreglo
        */
        //edades[3] = 5;//Arroja un errror dado que esta fuera del arreglo.
        
        for(int i = 0;i < edades.length;i++){
        
            System.out.println("edades elemento " + i+" : "+edades[i]);
        }
        
        
        /*
        Definicion de sintaxis
        */
        String frutas[] = {"Naranja","Platano","Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
    }
}
