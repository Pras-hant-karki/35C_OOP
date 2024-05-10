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

        int []myArray1 = new int[5];
            int []myArray2 = new int[5];
            int i=0;
            while ( i<5) {
                myArray1[i] = 50 - i*10;
                i++;

            }
            int j=0;
            while (j<5) {
                myArray2[j] = myArray1[4-j];
                j++;
                }
                for (int k=0; k<5; k++) {
                    System.out.println(myArray2[k]);
                    }

    }
    
}
