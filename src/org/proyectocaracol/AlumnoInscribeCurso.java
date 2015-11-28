/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proyectocaracol;

/**
 *
 * @author fabianm
 */
public class AlumnoInscribeCurso {
    private final int id;
    private boolean pagado;
    private final Alumno alumno;
    private final Curso curso;
    
    public AlumnoInscribeCurso(int id, Alumno alumno, Curso curso) {
        this.id = id;
        this.pagado = false;
        this.alumno = alumno;
        this.curso = curso;
    }
    
    public int getId() {
        return this.id;
    }
    
    public boolean getPagado() {
        return this.pagado;
    }
    
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    public Alumno getAlumno() {
        return this.alumno;
    }
    
    public Curso getCurso() {
        return this.curso;
    }
    
    public String toString() {
        return this.alumno.toString() + "\n" + this.curso.toString() + "\n" + 
               "Pagado: " + this.pagado;
    }
    
}
