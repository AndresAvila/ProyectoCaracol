/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proyectocaracol;
/**
 *
 * @author Fabián Montemayor
 */
public class Curso {
    
    private String nombre;
    private final String clave;
    private String descripcion;
    private String instructor;
    private String costo;
    private String cupo;
    
    public Curso(String nombre, String clave, String descripcion, String instructor,
            String costo, String cupo) {
        this.nombre = nombre;
        this.clave = clave;
        this.descripcion = descripcion;
        this.instructor = instructor;
        this.costo = costo;
        this.cupo = cupo;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getClave() {
        return this.clave;
    }
    
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getInstructor() {
        return this.instructor;
    }
    
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    
    public String getCosto() {
        return this.costo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCosto(String costo) {
        this.costo = costo;
    }
    
    public String getCupo() {
        return this.cupo;
    }
   
    
    public void setCupo(String cupo) {
        this.cupo = cupo;
    }
    
    public String toString() {
        return this.clave + "\n" + this.nombre + "\n" + this.descripcion + "\n" 
                + this.instructor + "\n$" + this.costo + "\nCupo: " + this.cupo;
    }
}
