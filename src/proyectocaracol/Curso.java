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
public class Curso {
    
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
    
    
    public int buscaCurso(String categoria, Curso curso)
    {
        for(int i = 0; i<=1; i++){
               
            if(categoria == curso.getCategoria()){
                    System.out.println("POPO");
            }
        }
        return 0;
    }
}
