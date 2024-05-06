package Week4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int num1 = 0;
        /* While checks the condition first */
        while (num1 < 0) {
            System.out.println("This will not print since condition is false");
        }

        /* Do while checks the condition after the loop
        * meaning, do while loop runs at least once even if the condition is false 
        */
        do {
            System.out.println("Do while will check condition after the statement");
        } while(num1 < 0);

        /* Use while loop to ask a user for a integer
        * keep asking user for a number unless the integer is negative 
        */
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a number");
        int intValue = scan.nextInt();
        while(intValue>0) {
            System.out.println("number less than 0");
            intValue = scan.nextInt();
        }
        System.out.println("Correct condition" + intValue);
        scan.close();
    }
    
}
