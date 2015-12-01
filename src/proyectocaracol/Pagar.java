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
public class Pagar {
    
    public int pagoID;
    public Alumno alumnoID;
    public Curso cursoID;
    
    public int getPagoID(){
        return pagoID;
    }
            
   public void setPagoID(int idpago){
       pagoID = idpago;
   }
     public Alumno getAlumnoID(){
        return alumnoID;
    }
     
       public void setAlumnoID(Alumno idAl){
        alumnoID = idAl;
   }
            
    public Curso getCursoID(){
       return cursoID;
   }
   
   public void returnCursoID(Curso id){
       cursoID = id;
   }
   
   public String generarPago(Alumno alumno, Curso curso, int infoCuenta){
        
       return "Favor de realizar el pago en la cuenta " + infoCuenta +
          " para la clase " + curso.nombre + " del alumno " + alumno.getNombre();
   }
    
}
