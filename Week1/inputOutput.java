package Week1;

import java.util.Scanner;
public class inputOutput {
    public static void main(String[] args) {
        
        /*print/output a line with line break
        *use "sout" shortcut 
        */    
        System.out.println("This prints and breaks line");
        /*Print the word without line break */
        System.out.print("This will not breaks line ");
        System.out.print("This line will continue\n");

        /*Output formating
         * System.out.printf();
         * %s String, %d integral, %f floating point, %b boolean
         * This will not break line too 
         */
        System.out.printf("The next word is %s", "New word");
        System.out.printf("The next int is %d", 20);
        /* You can use multiple formatter */
        System.out.printf("Multiple %f %b", 10.9f, false);

        /* User Input using Scanner
         * first import the Scanner class
         * import java.util.Scanner; // at the top of the file
         */

         Scanner scan = new Scanner (System.in); // System.in is used as input
         System.out.println("The following takes one word from sentence");
         String oneWord = scan.next();
         System.out.println (oneWord);
         System.out.println("The following takes whole sentence");
         String wholeSentence = scan.nextLine();
         System.out.println(wholeSentence);
         System.out.println("The following takes int");
         int intInput = scan.nextInt();
         System.out.println(intInput);
         System.out.println("The following takes boolean");
         boolean boolInput = scan.nextBoolean();
         System.out.println(boolInput);
         scan.close();

    }
    
}
