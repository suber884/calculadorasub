/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suj88
 */
public class calculadora {
    private String nombre;
    private double numero1;//atributos
    private double numero2;

    public calculadora(String nombre, double numero1, double numero2) {
        this.nombre = nombre;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    

    public calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        
    }


    public calculadora() {
    }
public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    // sets and gets

       public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    //métodos
    public double suma() { //metodo suma
        double suma = numero1 + numero2;
        return suma;
    }

    public double resta() { //metodo resta
        double resta = numero1 - numero2;
        return resta;
    }
   public double multip() { //metodo multiplicacion
        double multip = numero1 * numero2;
        return multip;
    }
 
    
    //comentario de prueba
   }
