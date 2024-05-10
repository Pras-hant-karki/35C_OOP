package Week5;

public class StaticFunction {
    /* static function with modifier */
    public static int addNumber(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static String vendingMachine (int menu) {
        if (menu == 1) {
            return "Peanutbutter";
        }
        if (menu == 2) {
            return "ProteinShake";
        }
        if (menu == 3) {
            return "Smoothie";
        }
        return "Invalid menu";
    }

    /* Make a function adoptPet 
        * Take animal type as string
        * if the animal is Dinosaur, Whale, Mammoth return true
        * else return false
        */

public static boolean adoptPet (String pet) {
    if (pet == "Dinosaur" || pet == "Whale" || pet == "Mammoth") {
        return true;
    }
    else {
        return false;
    }
}

public static void main(String[] args) {
    /* We do not have to create object for static function
    * If the static function is in same class
    * can just call from function name */
    int returnFromFunction = addNumber (20,20);
    System.out.println("Returned value is " + returnFromFunction);
    
    String returnItem = vendingMachine(2);
    System.out.println("Le khaa " + returnItem);

    Boolean animalType=adoptPet("Dinosaur");
    System.out.println("Can we adopt this pet? " + animalType);
}
    
}
