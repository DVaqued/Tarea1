/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author angel
 */
public class EjercicioVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*El operador ternario sirver para acortar un if-else, basicamente
        realiza la operación de verdadero y falso (booleana).
        */
        
        //Quién es mayor?
        int edad1=17;
        int edad2=13;
        int mayor=0;
        
        mayor=(edad1>edad2)?edad1:edad2;
        
        System.out.println("La edad mayor es "+mayor);
        /* Si edad1 es mayor que edad2, entonces la variable "mayor" se reemplazara por edad1
        sino, edad1 será reemplazada por edad2, al ser edad 2 mayor.
        */
    }
    
}
