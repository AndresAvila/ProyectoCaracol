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
public class Maestro {
    public int maestroID;
    public String nombre;
    public Curso cursoID;
    
    public int getMaestroID(){
        return maestroID;
    }
            
   public void setMaestroID(int idMaestro){
        maestroID = idMaestro;
   }
   
     public String getNombre(){
        return nombre;
    }
            
   public void setNombre(String nom){
        nombre = nom;
   }
   
    public Curso getCursoID(){
       return cursoID;
   }
   
   public void returnCursoID(Curso id){
       cursoID = id;
   }
}
