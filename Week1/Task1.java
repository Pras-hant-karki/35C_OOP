package Week1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Task
        * Create a new scanner object name scan1
        * Prompt user for the following
        * What is your name? -> Save to string name, use nextLine()
        * Are you over 18? -> Save to boolean status, use nextBoolean()
        * How many hours do you work per day? -> Save to int hoursWorked, use nextInt()
        * Print the output
        * Hello, name
        * Over 18 status,
        * Work hour status
        */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scan1.nextLine();
        System.out.println("Are you over 18? ");
        boolean status = scan1.nextBoolean();
        System.out.println("How many hours do you work per day?");
        int hoursWorked = scan1.nextInt();
        System.out.println("Hello, " + name);
        System.out.println("Over 18?"+ status);
        System.out.printf("you work %d number of hours\n", hoursWorked);
        scan1.close();
        
    }
    
}

