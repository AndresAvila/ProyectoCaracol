/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocaracol;

/**
 *
 * @author javo
 */
public class Alumno  {
    
    private String nombre;
    public String usuario;
    public String contraseña;
    private String colonia;
    public int alumnoID;
    public int edad;
    public Curso cursoID;
    
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usu){
        usuario = usu;
    }
     public String getContraseña(){
        return contraseña;
    }
    public void setContraseña(String con){
        contraseña = con;
    }
    
    
    public String getNombre(){
        return nombre;
    }
            
   public void setNombre(String nom){
        nombre = nom;
   }
   
   public String getColonia(){
       return colonia;
   }
   
   public void setColonia(String col){
       colonia = col;
   }
   
   public int getAlumnoID(){
       return alumnoID;
   }
   
   public void setAlumnoID(int id){
       alumnoID = id;
   }
   
   public int getEdad(){
       return edad;
   }
   
   public void setEdad(int newEdad){
       edad = newEdad;
   }
   
   public Curso getCursoID(){
       return cursoID;
   }
   
   public void returnCursoID(Curso id){
       cursoID = id;
   }
}
