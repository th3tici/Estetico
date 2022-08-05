/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estetico;

/**
 *
 * @author th3tici
 */
public class Ejecutable {
    public static void main (String [] args){
        Estetico e1 = new Estetico (); 
        e1.setNumTurno(34);
        e1.setHorario("22:30");
        e1.setDia("Jueves");
        e1.setCliente("Donato Galliano");
        e1.setZonaTrabajada("Cara");
        e1.setEstilista("Martin Salomon");
        e1.setEstado("Disponible");
        e1.setPrecio(1500);
        
        System.out.println (e1.toString());
    }
    
}
