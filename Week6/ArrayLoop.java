package Week6;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] array1 = {20, 40, 60, 80, 100, 120};
        int array1Length = array1.length;
        /* Either loop from 0 & index < arrayLength
         * or loop from 0 and index <= arrayLength - 1 */
        for (int index = 0; index < array1Length; index ++) {
            System.out.println ("Value in index" + index + " " + array1[index]);
        }
        /* descending loop */
        /* start loop from array1length - 1 to 0, decrement */
        for (int index = array1Length -1; index >=0; index --) {
            System.out.println("Descending" + array1[index]);
        }

        int counter = 0;
        /* Use this counter to iterate array1 in while loop */
        int index = 0;
        while (counter < array1Length){
            System.out.println("While Loop Value: " + array1[index] );
            counter++;
        }

    }
    
}
