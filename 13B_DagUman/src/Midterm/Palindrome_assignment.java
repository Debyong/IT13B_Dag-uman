package Midterm;

import java.util.Scanner;

public class Palindrome_assignment {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.nextLine();

        String reversed = "";

        for (int x = word.length() - 1; x >= 0; x--) {
            reversed += word.charAt(x);
        }

        if (word.equals(reversed)) {
            System.out.println(word.toUpperCase() + " is a Palindrome");
        } else {
            System.out.println(word.toUpperCase() + " is not a Palindrome");
        }
    }

}