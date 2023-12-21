/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExplicacionEqualsHashcode;

/**
 *
 * @author victor
 */
public class mainCliente {
    public static void main(String[] args) {
        
        cliente c1 = new cliente("pepe",30,"estepona","email");
        cliente c2 = new cliente("pepe",30,"estepona","email");
        
        // No se puede igualar con c1==c2, porque lo que compara son direcciones de memoria.
        
        //Hay que comparar los ojetos siempre con Equals, para ello hay que implementar
        //El método equals
        
        System.out.println("c1==c2? " + c1.equals(c2));
        cliente c3 = new cliente("pepe",30,"estepona","email");
        
        System.out.println("c2==c3? " + c2.equals(c3));
        System.out.println("c1==c1?" + c1.equals(c1)); //this == obj
        //C1==null --> da false 
        //C1==C3 me debe de devolver true por la transitividad
        
        cliente c4 =c1;
        System.out.println("c1==c4?" + c1.equals(c4));
        //Los Hashcode se guardan en estructura HashSet y HashMap
        System.out.println("Hascode c1: " + c1.hashCode());
        System.out.println("Hascode c2: " + c2.hashCode());
        System.out.println("Hascode c3: " + c3.hashCode());
        System.out.println("Hascode c4: " + c4.hashCode());
    }
}
