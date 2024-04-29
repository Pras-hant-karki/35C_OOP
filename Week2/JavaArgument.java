package Week2;


public class JavaArgument {

    public static void main(String[] args) {
        /* The args in the main fuction can be used 
         * to take input from command line
         * when executing the file we can pass argument
         * Eg:
         * java JavaArgument arg1 arg2
         * the arg1 & arg2 can be accessed from args
         */

        if(args.length<2) {
            System.out.println("Please provide at least two arguments");
            return; // terminate the program execution
        }
        /* use the index of args array to access */
        System.out.println("Argument 1 is " + args[0]);
        System.out.println("Argument 2 is " + args[1]);
    }
    
}
