/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string_ltzz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ET36
 */
public class Contraseña {
    private int longitud;
    char[] contra = new char[longitud];
    //ArrayList<String> contra = new ArrayList<String>();

    public Contraseña(int longitud) {
        this.longitud = longitud;
    }
    
    public void construirContra(){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<longitud;i++){
            System.out.println("ingrese caracter: ");
            contra[i] = in.nextLine().charAt(0); 
        }
    }
    public void verificarMail(){
        Scanner in = new Scanner(System.in);
        char[] contra2 = new char[longitud];
        for(int i=0;i<longitud;i++){
            System.out.println("reingrese contraseña: ");
            contra2[i] = in.nextLine().charAt(0); 
        }
        
        if(contra==contra2){
            System.out.println("contraseña valida");
        }
        
    }
    
    
    
}
