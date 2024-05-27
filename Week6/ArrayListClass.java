package Week6;
import java.util.ArrayList;
public class ArrayListClass {
    public static void main(String[] args) {
        /* To use array list import from java.util just like scanner */
        ArrayList<String> animal = new ArrayList<>();

        /* Instead of array animal [0] = "XYZ", we use add function */
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Monkey");
        
        System.out.println(animal);
        /* We can add element directly on index, it will shift current
         * index to +1 */
        animal.add(0,"Donkey");

        System.out.println("After adding donkey to 0 index");
        System.out.println(animal);

        // Removes from index, here index 1 is "Dog"
        animal.remove(1);
        System.out.println(animal);

        // Update the actual value
        animal.set(0, "Ankit");

        // Access one element from arraylist
        String oneElement = animal.get(0);
        System.out.println("The animal in index 0 is" + oneElement);

        animal.set(0, "Donkey");
        System.out.println(animal);


        /* Make an arrayList of int
         * with values [100, 200, 300, 400, 500]
         * remove the 500 value
         * add -100 at first
         * update 300 to 350
         * update 400 to 420
         * Print the array list;
         */

         ArrayList<Integer> intArrayList = new ArrayList<>();
         intArrayList.add(100);
         intArrayList.add(200);
         intArrayList.add(300);
         intArrayList.add(400);
         intArrayList.add(500);
         System.out.println(intArrayList);

         intArrayList.remove((Integer)500);
         


    }
    
}
