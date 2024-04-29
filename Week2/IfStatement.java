package Week2;
public class IfStatement{
    public static void main(String[] args) {
        /* simple if statement, takes condition/expression with boolean value */
        if(true){
            System.out.println("This is true");
        }
        System.out.println("This is false");
        /* If condition fails, goes to else block/scope */
        int iNum1 = 10, iNum2 = 20;
        if (iNum1 == iNum2) {
            System.out.println("Both numbers are equal.");
        } else if (iNum1 > iNum2) {
            System.out.println("Number one is greater than number two.");
        } else {
            System.out.println("Number one is lesser than number two.");
        }
        /* Note that else should be at last of the statement */
        /* If else If ladder, more than one elseif */
        if (iNum1< 0) {
            System.out.println("iNum1 is Negative");
        }
        else if (iNum2<0) {
            System.out.println("iNum2 is Negative");
        }
        else if (iNum1 == iNum2) {
            System.out.println("iNum1 and iNum2 both are equal");
        } else if (iNum1 < iNum2) {
            System.out.println("iNum1 is smaller than iNum2");
        }
        else {
            System.out.println("Default execution if all fails");
        }
        /* Note that else is not mandatory & can be skipped */


        /* questions */
        int q1 = 10, q2 = 10;
        if (q1 >= q2) {
            System.out.println ("First statement");
        }
        else if (q1 == q2) {
            System.out.println ("Second statement");
        }
        else {
            System.out.println ("Default statement");
        }


        /* Nested if statement */
        int nNum1 = -10, nNum2 = 20;
        if (nNum1 < 0) {
            if (nNum1 > nNum2) {
                System.out.println("nNum1 is negative & greater");
            }
            else {
                System.out.println("nNum1 is negative & lesser");
            }
        } else {
            if(nNum1 > nNum2) {
                System.out.println("nNum1 is positive & greater");
            }else {
                System.out.println("nNum1 is positive & lesser");
            }
        }
    }
    /* Task
     * Given the value below, add the total & take the average
     * if any of the marking is less than 35, print "Fail"
     * if average is less than 60, print "3rd div"
     * if average is less than 70, print "2nd div"
     * if average is less than 80, print "1st div"
     * if average is greater than or equal to 80, print "Distinction"
     */
     int math = 38, science = 60, english = 35;
     /* make total variable & average variable */

     



}