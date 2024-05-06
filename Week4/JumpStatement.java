package Week4;

public class JumpStatement {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        /* break & continue are jump statement in java */
        for (int i = 0; i <=5; i ++) {
            if (i ==3 ) {
                break;
            }
        System.out.println("For loop" + i);
        }
        /* can be used in while & do while */
        int count = 0;
        while (count <= 5) {
            if (count == 1) {
                break;
            }
            System.out.println ("While count" + count);
            count++;
        }
        /* Break ends/terminates the loop where it is called */

        /* Continue skips the current iteration */
        for (int index = 0; index <=5; index++) {
            if (index==3){
                continue; // will ignore all the remaining and go to next loop
            }
            System.out.print("Continue loop" + index);
        }

        /* break in nested loop */
        for (int outer = 0; outer <=2; outer++) {
            for (int inner=0 ;inner<=3; inner++) {
                if (inner == 1) {
                    break;
                }
                System.out.print("inner Loop" + inner);
            } 
        }
        
        /* if you want to break outer loop */
        System.out.println("outer loop break");
        outerLoop: for (int outer = 0; outer <=2; outer++) {
            innerLoop: for(int inner = 0; inner <=3; inner++) {
                if (inner == 1) {
                    break outerLoop;
                }
                System.out.print("Inner Loop" +inner);
            }
        }

        /* TASK: use for loop from -5 to 5
        * if the value is positive end the loop
        */

        for (int i=-5; i<=5; i++) {
            System.out.println(i);
        }

        /* TASK: use for loop */





    }
}
