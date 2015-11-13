/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package proyectocaracol;
import java.util.Scanner;
/**
 *
 * @author AndresAvila
 */
public class ProyectoCaracol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Curso curso1 = new Curso();
        
        curso1.setNombre("Futbol");
        curso1.setCosto(20);
        curso1.setCupo(25);
        curso1.setCursoId(1);
        curso1.setCategoria("Deportes");
        curso1.setDescripcion("Muy padre curso ^_");
        
        Alumno alumno1 = new Alumno();
        
        alumno1.setNombre("Andres Avila");
        alumno1.setAlumnoID(12345);
        alumno1.setUsuario("andres");
        alumno1.setContraseña("password");
        alumno1.setColonia("Caracol");
        alumno1.setEdad(14);
       
        
        String usuario, contraseña;
        Scanner reader = new Scanner(System.in);
        System.out.println("Usuario");
        usuario = reader.next();
        System.out.println("Contraseña");
        contraseña = reader.next();
        while (!(usuario.equals(alumno1.getUsuario()) && contraseña.equals(alumno1.getContraseña()))){
            System.out.println("Error, vuelva a ingresar el usuario y la contraseña");
            System.out.println("Usuario");
            usuario = reader.next();
            System.out.println("Contraseña");
            contraseña = reader.next();
        }
     
        System.out.println("Elige la categoría");
        System.out.println("a)Deportes");
        System.out.println("b) ..." );
        String categoria = reader.next();
        String mensaje = curso1.buscaCurso(categoria, curso1, alumno1);
        System.out.println(mensaje);
        
            
        
        
        
    }
    
}
