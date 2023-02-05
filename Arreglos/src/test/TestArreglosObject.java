/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author lepo9
 */
public class TestArreglosObject {
    
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];//Los arreglos se deben definir en plural
        
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");
        
        System.out.println("personas 0 = " + personas[0]);//Impresion de la memoria de los objetos. Al tener el metodo toDtring se imprime el nombre asignado a la cadena.
        System.out.println("personas 1 = " + personas[1]);
        
    }
}
