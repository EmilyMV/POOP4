
package poop4;

/**
 *
 * @author estudiante
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto punto = new Punto();
        punto.imprimirPunto();
        Punto punto2=new Punto(3,5);
        punto2.imprimirPunto();
        System.out.println(punto);
        System.out.println(punto2);
        
        Perro perro =new Perro("max","chihuahua","negro",15);
        System.out.println(perro);
        Coche coche =new Coche("Mazda","2018","rojo","automatico","magna");
        coche.girar("derecha");
        System.out.println(coche.toString());
        System.out.println(coche);
        TrianguloR trianguloR =new TrianguloR(4,3,5);
        trianguloR.area(4,3);
        System.out.println(trianguloR.toString());
        System.out.println(trianguloR);
        Profesor profesor =new Profesor("Abraham","Cortes","Algebra",1);
        profesor.darClase("Algebra",1);
        System.out.println(profesor.toString());
        System.out.println(profesor);
        Alumno alumno =new Alumno("Emily","Mendoza",323736383,"Calculo",3);
        alumno.tomarClase("Calculo",3);
        System.out.println(alumno.toString());
        System.out.println(alumno);
    }
    
}
