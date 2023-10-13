/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author EIMV
 */
public class Alumno {
    String nombre,apellido,materia;
    int semestre,cuenta;

    public Alumno(){}

    public Alumno(String nombre, String apellido,int cuenta, String materia,int semestre){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
        this.materia = materia;
        this.semestre= semestre;
    }
    
    public void tomarClase(String materia,int semestre){
        System.out.println("Estoy tomando la clase en el semestre: "
                +semestre+", materia: "+materia);
    }
    
    public void hacerExamen(){
        System.out.println("Estoy haciendo un examen");
    }
    
    public void hacerEjercicios(){
        System.out.println("Estoy haciendo un ejercicio");
    }
    
    
    @Override
    public String toString() {
        return "Alumno"+"{" + "Nombre:" + nombre + ", Apellido:"
                + "" + apellido + ", Cuenta: "+cuenta+", "
                + "Materia: " + materia + ", Semestre:" + semestre + '}';
    }
}
