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
public class Lab2_2906_2 {
    public static void main (String[]args){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int j=kb.nextInt();
    j=(j ^ (j >> 31)) - (j >> 31) ;//in first part (j>>31) is right shift of integer by 31 assuming integers are stored in two's component 32-bit value and that right shift operator
    //does sign extension, then we XOR that value with j and then we subtract j>>31 from the first part to get the absolute value.
    System.out.println("Absolute value: "+j);
    }

}
