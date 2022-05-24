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
public class Lab2_2906_1 {
    public static void main(String[] args)
    {
       Scanner kb=new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n=kb.nextInt();
        System.out.println("User entered: " + Integer.toBinaryString(n));
        n = (((n & 0xAAAAAAAA) >> 1) | ((n & 0x55555555) << 1));
        //first part(left to the pipe) contains all bits on the even position, second part(right to the pipe) contains all bits on the even position,
        //then we shift even bits to right by 1 and left shift odd bits by 1 and return the merged bits of these two.. 
        System.out.println("Bits swapped: " +n+"("+Integer.toBinaryString(n)+")");
    }
}
   
    

