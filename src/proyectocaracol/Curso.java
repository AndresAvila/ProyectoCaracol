/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocaracol;
import java.util.Scanner;
/**
 *
 * @author javo
 */
public class Curso extends Pagar {
    
    private int cupoCurso;
    public String nombre;
    public String descripcion; 
    public int costo;
    public int cursoID;
    public String categoria;
    
    public String getDescripcion()
    {
        return descripcion;
    }
    
    public void setDescripcion(String desc){
        descripcion = desc;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nom){
        nombre = nom;
    }
    
    public int getCosto()
    {
        return costo;
    }
    
    public void setCosto(int cost)
    {
        costo = cost;
    }
    
    public int getCursoId()
    {
        return cursoID;
    }
    
    public void setCursoId(int id)
    {
        cursoID = id;
    }
    
    public int getCupo()
    {
        return cupoCurso;
    }
    
    public void setCupo(int cupo){
        cupoCurso = cupo;
    }
    
    public String getCategoria()
    {
        return categoria;
    }
    
    public void setCategoria(String cate){
        categoria = cate;
    }
    
    
    public String buscaCurso(String categoria, Curso curso1, Alumno alumno1)
    {   
        String inscribir = "";
        Scanner reader = new Scanner(System.in);
        if(categoria.equals(curso1.getCategoria())){    
            System.out.println("a) Nombre del Curso: " + curso1.getNombre());
            System.out.println("b) ..." );
            String curso = reader.next();
            if(curso.equals(curso1.getNombre())){
                System.out.println("Categoría: " + curso1.getCategoria());
                System.out.println("Descripcion: " + curso1.getDescripcion());
                System.out.println("Costo: " + curso1.getCosto());
                System.out.println("Cupo: " + curso1.getCupo());
                System.out.println("Inscribir / Regresar");
                String opcion = reader.next();
                if(opcion.equals("Inscribir")){
                     System.out.println("Inscripción exitosa");
                     System.out.println("A)Generar ficha de  pago / B)Salir");
                     opcion = reader.next();
                     if(opcion.equals("Generar ficha de pago") || opcion.equals("a")){
                        inscribir = generarPago(alumno1, curso1, 123);
                     }
                }
            }
        }
            
        return inscribir;    
        
    }
}
