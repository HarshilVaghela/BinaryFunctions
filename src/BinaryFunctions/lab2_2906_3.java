/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryFunctions;
import java.util.Scanner;
/**
 *
 * @author Harshilkmar Vaghela, Student number: 3116318
 */
public class lab2_2906_3 {
    public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter value for x:");
    int x=kb.nextInt();
    System.out.println("Enter value for y:");
    int y=kb.nextInt();
    x=x+y;//adding both values to x
    y=x-y;//subtracting y so now y holds value of x
    x=x-y;// subtracting x's first value(now y) from x so that now x holds first value of y 
    System.out.println("Value of x:"+x);
    System.out.println("Value of y:"+y);
    }
}
