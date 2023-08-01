package org.example;

// Creating a star triangle and a diamond using arrays

public class Arrays {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 11;
        String[][] tree = new String[rows][columns];


        // Creating a star triangle
        for (String[] row : tree) {
            java.util.Arrays.fill(row, " ");
        }

        for (int i = 0; i < rows; i++) {
            int starCount = (2 * i) + 1;

            for (int j = 0; j < starCount; j++) {
                tree[i][columns / 2 - i + j] = "*";
            }
        }

        for (String[] row : tree) {
            for (String element : row) {
                System.out.print(element);
            }
            System.out.println();
        }

        // Creating an inverted star triangle, if to run together it's like a diamond
        for (int i = rows - 2; i >= 0; i--) {
            for (String element : tree[i]) {
                System.out.print(element);
            }
            System.out.println();
        }


    }
}
