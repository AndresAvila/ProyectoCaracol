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
public class Alumno  {
    
    private final String nombre;
    private String correo;
    private int telefono;
    private String direccion;
    private String contraseña;
    
    public Alumno(String nombre, String correo, int telefono, 
            String direccion, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contraseña = contraseña;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getCorreo() {
        return this.correo;
    }
    
    public int getTelefono() {
        return this.telefono;
    }
    
    public String getDireccion() {
        return this.direccion;
    }
    
    public String getContraseña() {
        return this.contraseña;
    }
    
    public String toString() {
        return this.nombre + "\n" + this.correo + "\n" + this.telefono + "\n" +
                this.direccion;
    }
   
}
