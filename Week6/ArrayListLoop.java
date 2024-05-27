package Week6;

import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {
        /* Import arrayList in the top */
        ArrayList<String> names=new ArrayList<>();

        names.add("Aayush");
        names.add("Sujal");
        names.add("Nippey");
        names.add("Prashant");
        names.add("parveshh");
        names.add("Suraj");
        names.add("Safar");

        /* To get the length of arrayList we use .size() functions */
        int namesLength = names.size();
        /* It will return how many element is in the arrayList */
        // Use for loop
        for(int index=0; index < namesLength; index++) {
            System.out.println("Names in index" + index + " " + names.get(index));
        }
        System.out.println("Using for each loop in java");
        /* Use Collection for each */
        for (String name : names){
            char[] element;
            System.out.print(element);
        }

        /* Task
         * Make an arrayList called animals
         * ["Dog", "Cat", "Tiger", "Elephant"]
         * Make two additional ArrayList wild & domestic
         * Loop the animals
         * if the element is "Dog", "Cat" add in domestic ArrayList
         * if the element is "Tiger", "Elephant" add in wild
         * Print domestic and wild ArrayList
         */

        ArrayList<String> animals = new ArrayList<>();
        ArrayList<String> wild = new ArrayList<>();
        ArrayList<String> domestic = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Elephant");
        int animalLength= animals.size();
        for(int index=0; index<animalLength; index++ );
            String singleAnimal = animals.get(index);
            if(Si)

    }
}
