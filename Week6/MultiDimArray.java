package Week6;

public class MultiDimArray {
    public static void main(String[] args) {
        /* the number of square bracket represent dimension of array */
        int [] oneDArray;
        int [] [] twoDArray;
        int [] [] [] threeDArray;

        /* To allocate size we must allocate the size of each square bracket */
        twoDArray = new int [2] [3];
        /* the first size 2 represents how many array
         * the second size 3 represents how many element/value inside the inner array 
         */
        /* twoDArray can be seen as
         * [
         *      [0, 0, 0] , -> 0
         *      [0, 0, 0] , -> 1
         * ]
         */

         // twoDArray [0] -> take first array
         // twoDArray [0] [0] -> take first element of first array
         twoDArray [0] [0] = 10;
         twoDArray [0] [1] = 20;
         twoDArray [1] [1] = 50;
         twoDArray [1] [2] = 100;
         // print/access
         System.out.println(twoDArray[0] [1]);

         /* Task
          * Make the following array
          [ 
            [10, 20, 30, 50],
            [100, 200, 300, 400],
            [50, 60, 70, 10],
            [-10, -20, -30, -50],
            [1, 2, 3, 5]
          ]
          Variable name arrayDemo;
          */
         int [][] easyArray = {
            {10, 20, 30, 50},
            {100, 200, 300, 400},
            {50, 60, 70, 10},
            {-10, -20, -30, -50},
            {1, 2, 3, 5}
         };

            System.out.println("The elements in the array at the 4th index are:");
        for (int i = 0; i < easyArray[4].length; i++) {
            System.out.println(easyArray[4][i]);
        

    }


    
    
    }
    
}
