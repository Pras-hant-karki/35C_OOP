package Week5;

public class FunctionClass {
    /* Function is created inside class scope not in main */
    void printSomething() {
        System.out.println("This function just prints");
    }
    /* void is a return type that returns nothing 
    * or we do not have to return anything if void is function's return type */
    int returnInt() {
        int returnThis=10;
        return returnThis;
    }
    boolean returnBoolean(int num1, int num2) {
        boolean check = num1 == num2;
        return check;
    }
    public static void main(String[] args) {
        /* To use a simple function in java we have to make object
        * Note: Just remember the syntax of objet for now */
        FunctionClass fc = new FunctionClass();
        /* Call function from fc object */
        fc.printSomething();
        /* can be called again for same actions */
        fc.printSomething(); 

        int returnFromFunction = fc.returnInt();
        System.out.println("The function returns" + returnFromFunction);

        boolean returnFromBoolean = fc.returnBoolean(10, 20);
        System.out.println("Return boolean value" + returnFromBoolean);
        
    }
    
}
