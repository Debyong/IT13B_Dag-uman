/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

/**
 *
 * @author User
 */
public class FIBONACCI {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci Sequence:");
        printFibonacciLoop(n);
    }

    public static void printFibonacciLoop(int n) {
        if (n <= 0) {
            return;
        }
        if (n == 1) {
            System.out.print(0 + " ");
            return;
        }

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println(); 
    
    }
   }
}
}
