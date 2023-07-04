/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string_ltzz;

/**
 *
 * @author ET36
 */
public class Usuario extends Persona {
    private String nomUsuario;
    private String mail;
    

    public Usuario(String nomUsuario, String mail, String nombre, Contraseña contra, double altura, double peso) {
        super(nombre, contra, altura, peso);
        this.nomUsuario = nomUsuario;
        this.mail = mail;
    }
    
    public void validarMail(){
        //mail.indexOf(String "@")!=-1
        if(mail.contains("@")){
            System.out.println("El mail es valido");
        }
    }
    
    public void calcularUsuario(){
        System.out.println("Nombre de usuario: "+nomUsuario+" Nombre: "+super.getNombre()+" , imc: "+super.calcularIMC());
    }
    
    
}
