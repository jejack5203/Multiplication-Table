/*
Java Programming
Creating a 10 X 10 and random generated Multiplication Table  
*/

import java.util.Random; //apart of utilities package

public class Multiplication {
    
    public static void main(String[] args) {
        multiplicationTable(); //calls the 10 by 10 table 
        System.out.print("--------------------------------------------"); //prints line seperation between the 2 tables
        System.out.println();
        System.out.println();
        randomMultiplicationTable(); //calls the random generated table 
         
        }

    public static void multiplicationTable() {
        System.out.print("    "); //shifts the column headers by 1 cell 
        for (int i = 1; i <= 10; i++) {
            if (i <= 10) { //checks if iterator is less or equal to 10
                System.out.printf(" <%d>", i); //prints column header w/brackets
            } else {
                System.out.printf("%d", i); //if not do not add brackets print regular 
            }
        }
        
        System.out.println();
        for(int j = 1; j <= 10; j++) {
            if (j <= 10) {
                System.out.printf("<%d>", j); //adds brackets to row headers
            } else {
                System.out.printf("%d", j); 
            }
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%4d", i * j); //prints rows and columns multiples
            }
            System.out.println();
        }
    }
    
    public static void randomMultiplicationTable() {
        Random r = new Random(); // creates an object "r" that generates a random number 
        int row = r.nextInt(10) + 1; // uses a random number between 1 - 10
        int column = r.nextInt(10) + 1; 
        customMultiplicationTable(row, column); //calls table using the rows and column parameters
    }
     public static void customMultiplicationTable(int highestRow, int highestColumn) {
        System.out.print("    "); 
        for (int i = 1; i <= highestColumn; i++) {
            if (i < 10) {
                System.out.printf(" <%d>", i);
            } else {
                System.out.printf("%d", i);
            }
        }
        System.out.println();
        for (int j = 1; j <= highestRow; j++) {
            if (j < 10) {
                System.out.printf("<%d>", j);
            } else {
                System.out.printf("%d", j);
            }
            for (int i = 1; i <= highestColumn; i++) {
                System.out.printf("%4d", i * j); // prints the multiplication results of rows and columns
            }
            System.out.println();
        }
    }
}

