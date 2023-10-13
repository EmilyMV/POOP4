/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author EIMV
 */
public class Profesor {
    String nombre,apellido,materia;
    int semestre;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String materia,int semestre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.semestre= semestre;
    }
    
    public void darClase(String materia,int semestre){
        System.out.println("Estoy dando clase en el semestre: "
                + ""+semestre+", materia: "+materia);
    }
    
    public void calificar(){
        System.out.println("Estoy calificando");
    }
    
    public void registrarEntrada(String nombre,String apellido){
        System.out.println("Entrada del profesor: "+nombre);
    }
    
    public void registrarSalida(String nombre,String apellido){
        System.out.println("Salida del profesor: "+nombre);
    }
    
    @Override
    public String toString() {
        return "Profesor{" + "Nombre:" + nombre + ", Apellido:"
                + "" + apellido + ", Materia: " + materia + ", Semestre:" + semestre + '}';
    }
    
}
