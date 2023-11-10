/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.unidad4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Unidad4 {

    public static void main(String[] args) {
        
        //Acceso a un método estatico publico de otra clase
        //Se usa el nombre de la clase (.) nombre del metodo
        int numero = Utilidades.filtrarEnterosEntre(6, 10);

        System.out.println("El número es " + numero);
        
        System.out.println("Vamos a crear aleatorios entre dos números int");
        System.out.println("Introduce el primer número");
        int dato1 = Utilidades.solicitarDatoInt();
        System.out.println("Introduce el segundo número");
        int dato2 = Utilidades.solicitarDatoInt();
        
        int aleatorio = Utilidades.enteroAleatorio(dato1,dato2);
        System.out.println("El número aleatorio es : " + aleatorio);
        
        
        // Crear un array de 100 elementos aleatorios de tipo int
        int [] arrayAleatorios = new int [100];
        //Para no tener que rellenar manualmente
        
        int numeroMenor = 10;
        int numeroMayor = 2_000;
        
        // Rellenar el array con aleatorios entre 10 y 2_000
        
        for (int i=0; i<arrayAleatorios.length;i++){
            arrayAleatorios[i]= Utilidades.enteroAleatorio(numeroMenor, numeroMayor);
        }
        
        for(int i = 0; i< arrayAleatorios.length; i++){
            System.out.println(" " + arrayAleatorios[i]);
        }
    }
    
}
