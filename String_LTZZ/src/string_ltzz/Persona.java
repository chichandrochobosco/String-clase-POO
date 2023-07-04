/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string_ltzz;

/**
 *
 * @author ET36
 */
public class Persona {
    private String nombre;
    private Contraseña contra;
    private double altura;
    private double peso;
    

    public Persona(String nombre, Contraseña contra, double altura, double peso) {
        this.nombre = nombre;
        this.contra = contra;
        this.altura = altura;
        this.peso = peso;
    }
    
    
    public void dividirNombre(){
        int longitud = nombre.length();
        System.out.println(nombre.substring((longitud/2)));
    }
    
    public void ultimoCaracter(){
        int longitud = nombre.length();
        System.out.println(nombre.substring((longitud-1)));
    }
    
    public void caracterxcaracter(){
        int longitud = nombre.length();
        for(int i=0;i<longitud;i++){
            System.out.println(nombre.charAt(i)+" - ");
        }
    }
    public double calcularIMC(){
        return peso/altura;
    }

    public String getNombre() {
        return nombre;
    }

    public Contraseña getContra() {
        return contra;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", contra=" + contra + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    









}
