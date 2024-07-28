/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EjercicioVariables {
    public static void main(String[] args){
        Scanner lea=new Scanner(System.in);
        //Par o impar.
        System.out.println("Favor ingrese su numero: ");
        int num1=lea.nextInt();
        
        String paroimpar="Par";
        
        paroimpar=(num1%2==0)?"Par":"Impar";
        
        System.out.println("Su número es "+paroimpar);
    }
    
}
