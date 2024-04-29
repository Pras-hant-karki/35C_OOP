package Week2;
public class SwitchCase {
    public static void main(String[] args) {
        char value = 'a' ;
        int numVal = 10;
        switch (value){
            case 'a':
                // Nested Switch
                switch(numVal) {
                    case 10:
                        System.out.println("10");
                        break;
                    default:
                        System.out.println("Default");
                        break;
                }
                System.out.println("Apple");
                break;
            case 'b':
                System.out.println("Ball");
                break;
            case 'c':
                System.out.println("Cat");
                break;
            case 'd':
                System.out.println("Dog");
                break;
            default:
                System.out.println("No words found");
                break;
        }
        /* Task
        * Consider the variable week in int
        * if the value is
        * 0- print sunday
        * 1- print monday
        * 2- print Tuesday
        * 3- print Wednesday
        * 4- print Thursday
        * 5- print Friday
        * 6- print Saturday
        * If the value is other than these Print Invalid Week
        */

         /* Check the weekday in switch */
        switch (value){
            case 'a':
                System.out.println("Apple");
                break;
            case 'b':
                System.out.println("Ball");
                break;
            case 'c':
                System.out.println("Cat");
                break;
            case 'd':
                System.out.println("Dog");
                break;
            default:
                System.out.println("No words found");
                break;
        }
    }
    
}
