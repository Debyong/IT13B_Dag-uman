/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab_Activity_2 {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the first number");
        int num1= input.nextInt();
          System.out.println("Enter the second number");
        int num2= input.nextInt();
        System.out.println("Enter the third number");
        int num3= input.nextInt();
        
    int greatest= num1;
    
    if(num2>greatest){
        greatest= num2;
    if(num3> greatest) {
    }
    System.out.println("The greatest number is: " + greatest);
    input.close();
    }
    }
    
}
