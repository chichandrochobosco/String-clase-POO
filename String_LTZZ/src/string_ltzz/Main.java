
package string_ltzz;

import java.util.Scanner;

/**
 *
 * @author ET36
 */
public class Main {
    public static void crearPersona(){
        String nombre;
        double altura, peso;
        int longitud;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = in.nextLine();
        System.out.println("ingrese altura: ");
        altura = in.nextDouble();
        in.nextLine();
        System.out.println("ingrese peso: ");
        peso = in.nextDouble();
        in.nextLine();
        System.out.println("ingrese longitud de contraseña: ");
        longitud = in.nextInt();
        in.nextLine();
        
        Contraseña contra = new Contraseña(longitud);
        Persona persona = new Persona(nombre, contra, altura, peso);
        
        String mail, nomUsuario;
        
        System.out.println("Ingrese nombre de usuario: ");
        nomUsuario = in.nextLine();
        System.out.println("Ingrese mail: ");
        mail = in.nextLine();
        
        Usuario usuario = new Usuario(nomUsuario, mail, nombre, contra, altura, peso );
        usuario.calcularUsuario();
        contra.construirContra();
        contra.verificarMail();
        usuario.validarMail();
        
    }


    public static void main(String[] args) {
        crearPersona();
        
    }
    
}
