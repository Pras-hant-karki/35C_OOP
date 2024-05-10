package Week6;

public class ArrayClass {
    public static void main(String[] args) {
        /* Array Declaration */
        int[] myFirstArray;
        /* Array initialization */
        myFirstArray = new int [5]; // 5 refers to the size
        int arraySize = myFirstArray.length;
        System.out.println("Total element in array is" + arraySize);

        myFirstArray[0]=10;
        myFirstArray[1]=20;
        myFirstArray[2]=30; 
        /* you cannot take or assign array element greater than
         * last index, here it is 4 */
        System.out.println("First Index is" + myFirstArray[0]);

        /* array declaration & initialization */
        int [] mySecondArray = new int [20];
        /* Array declaration, initialization & value */
        int[] myThirdArray = {10, 20, 30, 40, 67};
        /* or */
        int [] myFourthArray = new int [] {1,2,3,4};

        /* Task
         * Make an array myFirstArray with the size of 10
         * values should be 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
         * print each index, from 0-9    //loop is optional
         * with each print also print multiplication of the value by 2
         * Output
         * 10 20
         * 20 40
         * 30 60
         * ...
         * 90 180
         * 100 200
         */

        int [] myFifthArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(myFifthArray[0] + " " + myFifthArray[0] *2);
        System.out.println(myFifthArray[1] + " " + myFifthArray[1] *2);
        System.out.println(myFifthArray[2] + " " + myFifthArray[2] *2);
        System.out.println(myFifthArray[3] + " " + myFifthArray[3] *2);
        System.out.println(myFifthArray[4] + " " + myFifthArray[4] *2);
        System.out.println(myFifthArray[5] + " " + myFifthArray[5] *2);
        System.out.println(myFifthArray[6] + " " + myFifthArray[6] *2);
        System.out.println(myFifthArray[7] + " " + myFifthArray[7] *2);
        System.out.println(myFifthArray[8] + " " + myFifthArray[8] *2);
        System.out.println(myFifthArray[9] + " " + myFifthArray[9] *2);


    }
    
}
