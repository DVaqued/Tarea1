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
public class EjercicioFormulas {
    public static void main(String[] args){
        Scanner lea=new Scanner(System.in);
        
        //Si num1 es mayor que num2, hará una multiplicación, si no, una división.
        
        System.out.println("Favor ingrese su primer numero: ");
        double num1=lea.nextDouble();
        
        System.out.println("Favor ingrese su segundo numero: ");
        double num2=lea.nextDouble();
        
        double formula=0;
        
        formula=(num1>num2)?num1*num2:num1/num2;
        
        System.out.println("El resultado de su operacion es "+formula);
                }
    
}
