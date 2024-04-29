package Week2;
public class variableClass  {
    /*Instance variable
     * Needs object to access
     * not shared in multiple object
     */
    int instanceVariable = 10;
    /* Static variable
     * No need objects, can be accessed using class
     * Shared in multiple object
     */
    static int staticVariable = 100;
    public static void main(String[] args) {
        /*non primitive data type */
        /*declaration */
        byte byteVariable;
        /*initialization */
        byteVariable = 100;
        /*Declaration & initialization */
        short shortVariable = 1000;
        /*multiple declaration */
        int intVariable1, intVariable2;
        /*Initialization */
        intVariable1 = 10;
        intVariable2 = -10;
        /* Multiple declaration & initialization */
        long longVariable1 = 100000, longvariable2 = -199999;
        float floatVariable = 1.89f; // the letter "f" is required
        double doubleVariable = 189.8123d; // the letter "d" is optional
        char charVariable = 'c'; // single letter enclosed in a single quotation
        boolean booleanVariable = true; // small case true/false
        /*Illegal actions */
        // byte byteVariable = 20; // cannot redeclare a variable
        // byteVariable = 30; // instead use reassignment
        // boolean boolVar2 = 'false'; // should match the exact data type
        // byte byteVariable2 = 100000; // cannot exceed min or max


        /* Non-primitive data type */
        String stringVariable = "This is a string"; // use double quotation ""
        /* Or use the class */
        String stringVariable2 = new String("String using class");
        /* class/object */
        variableClass variableObject = new variableClass();
        /* Use the same class Name as specified in public class <ClassName> */
        /* Need object to access instance variable */
        System.out.println(variableObject.instanceVariable);
        /*Can access static variable with Class only/ no object needed */
        System.out.println(variableClass.staticVariable);

        /* Type casting */
        int intVariableConvert = 10;
        double intVariableConvertToVariable = intVariableConvert;
        /* Explicit casting */
        double doubleVariableConvert = 100.29;
        int doubleVariableConvertToInt = (int) doubleVariableConvert;

        //    Printing alll the assigned variables
        System.out.println(byteVariable);
        System.out.println(shortVariable);
        System.out.println(intVariable1);
        System.out.println(intVariable2);
        System.out.println(longVariable1);
        System.out.println(longvariable2);
        System.out.println(floatVariable);
        System.out.println(doubleVariable);
        System.out.println(charVariable);
        System.out.println(booleanVariable);
        System.out.println(stringVariable);
        System.out.println(stringVariable2);
        System.out.println(intVariableConvertToVariable);
        System.out.println(doubleVariableConvertToInt);
    }
}
