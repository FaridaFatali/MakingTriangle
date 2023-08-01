package org.example;

/**
 * Exercise: <a href="https://www.youtube.com/watch?v=x9-HnT0bQSY&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=23">...</a>
 * @author Farida Fatali
 */

// Creating a star triangle and a diamond using for loop

public class ForLoop {
    public static void main(String[] args) {
        int n = 6;

        // Creating a star triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Creating an inverted star triangle, if to run together it's like a diamond
        for (int i = (n - 1); i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}