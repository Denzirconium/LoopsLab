/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package looplab;

import java.util.Scanner;

/**
 *
 * @author Zhel
 */
public class Looplab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner (System. in);
       
       //Activity 1: Multiplication Table
       System.out.println("!!Activity 1: Multiplication Table!!");
       System.out.print("Enter a number: ");
       int number = input.nextInt();
       
       for (int i = 1; i <= 10; i++){
           System.err.println(number + " x " +  i + "  = " +(number *i));
           }
       //Activity 2: Sum of Natural Numbers
       System.out.println ("!!Activity 2 : Sum of Natural Number!!");
       System.out.println("Enter a number: ");
       int n = input.nextInt();
       
       int sum = 0;
       int i = 1;
       
      while (i <= n) {
          sum += i;
       i++;
    }
    System.out.println("Sum = " + sum );
      
// Activity 3: Factorial Calculator

// Activity 3: Factorial Calculator
        System.out.println("=== Activity 3: Factorial Calculator ===");
        System.out.print("Enter a number: ");
        int factNum = input.nextInt();

        long factorial = 1;
        int j = 1;

        if (factNum < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            do {
                factorial = factorial * j;
                j++;
            } while (j <= factNum);

            System.out.println("Factorial = " + factorial);
        }

        // Activity 4: Even and Odd Numbers
        System.out.println("=== Activity 4: Even and Odd Numbers ===");
        System.out.print("Enter a number: ");
        int limit = input.nextInt();

        System.out.print("Even numbers: ");
        for (int k = 1; k <= limit; k++) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
        }

        System.out.println();

        System.out.print("Odd numbers: ");
        for (int k = 1; k <= limit; k++) {
            if (k % 2 != 0) {
                System.out.print(k + " ");
            }
        }

        System.out.println();

        // Activity 5: Reverse Digits of a Number
        System.out.println("=== Activity 5: Reverse Digits of a Number ===");
        System.out.print("Enter an integer: ");
        int original = input.nextInt();

        int temp = original;
        long reversed = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

        if (original < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed: " + reversed);

        input.close();
    }
}
     

  
