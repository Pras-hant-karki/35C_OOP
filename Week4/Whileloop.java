package Week4;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        /* While loop takes condition inside()
        */
        int count = 0;
        while(count <= 5) {
            System.out.println("While count" + count);
            count++; // Increment the value of count by one each time through the loop
        }

        /* Real use of while is used when number of iteration is not fixed
        * for eg, if you want to keep asking a user for input until desired condition 
        */
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a number");
        int intValue = scan.nextInt();
        while(intValue<0 || intValue>100) {
            System.out.println("number between 0-100");
            intValue = scan.nextInt();
        }
        System.out.println("Correct condition" + intValue);
        scan.close();
    }
}
