/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author EIMV
 */

public class TrianguloR {
    float base,altura,hipotenusa;

    public TrianguloR() {}
    public TrianguloR(float base, float altura,float hipotenusa) {
        this.base = base;
        this.altura = altura;
        this.hipotenusa =hipotenusa;
    }
    
    public void perimetro(int base,int lado,int hipotenusa){
        float perimetro=base+altura+hipotenusa;
        System.out.println("Perimetro del triangulo es igual a: "+perimetro);
    }
    
    
    public void area(float base,float altura){
        float area= (base*altura)/2;
        System.out.println("Area del triangulo es igual a: "+area);
    }
    
    @Override
    public String toString() {
        return "TrianguloR{" + "Base:" + base + ", "
                + "Altura: " + altura + ", Hipotenusa: "+hipotenusa+'}';
    }
}
