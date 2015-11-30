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
    
    private  String nombre;
    private final int clave;
    private String descripcion;
    private String instructor;
    private double costo;
    private int cupo;
    
    public Curso(String nombre, int clave, String descripcio, String instructor,
            double costo, int cupo) {
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
    
    public int getClave() {
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
    
    public double getCosto() {
        return this.costo;
    }
    
    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public int getCupo() {
        return this.cupo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
    
    public String toString() {
        return this.clave + "\n" + this.nombre + "\n" + this.descripcion + "\n" 
                + this.instructor + "\n$" + this.costo + "\nCupo: " + this.cupo;
    }
}
