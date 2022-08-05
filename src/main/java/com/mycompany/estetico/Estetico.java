/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estetico;

/**
 *
 * @author th3tici
 */
public class Estetico {
    
    private int numTurno; 
    private String horario; 
    private String dia; 
    private String cliente; 
    private String zonaTrabajada; 
    private String estilista; 
    private String estado; 
    private float precio; 

    public Estetico() {
        this.numTurno = 0;
        this.horario = "";
        this.dia = "";
        this.cliente = "";
        this.zonaTrabajada = "";
        this.estilista = "";
        this.estado = "";
        this.precio = 0;
    }

    public Estetico(int numTurno, String horario, String dia, String cliente, String zonaTrabajada, String estilista, String estado, float precio) {
        this.numTurno = numTurno;
        this.horario = horario;
        this.dia = dia;
        this.cliente = cliente;
        this.zonaTrabajada = zonaTrabajada;
        this.estilista = estilista;
        this.estado = estado;
        this.precio = precio;
    }

    public int getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getZonaTrabajada() {
        return zonaTrabajada;
    }

    public void setZonaTrabajada(String zonaTrabajada) {
        this.zonaTrabajada = zonaTrabajada;
    }

    public String getEstilista() {
        return estilista;
    }

    public void setEstilista(String estilista) {
        this.estilista = estilista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    private String comprobarDia (String dia){
        boolean bandera = false;
        final String [] listaDia = {"Sabado", "Domingo"};
        for (int i = 0; i < 2; i++) {
        if (dia == listaDia [i]){
            bandera = true; 
           }
        }
        if (bandera){
           return dia;
        }else{
           return "Dia no Disponible"; 
        }
    }
    
    public String toString () {
        return "Horario: " + this.horario + "\nDia: " + this.dia + "\nCliente: " 
                + this.cliente + "\nZona a Trabajar: " + this.zonaTrabajada + 
                "\nEstilista: " + this.estilista + "\nEstado: " + this.estado + 
                "\nPrecio: " + this.precio; 
    }
}

