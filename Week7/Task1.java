package Week7;


public class Task1 {
    public static void main(String[] args) {

        //Make a new objext retangle 
        Rectangle r1= new Rectangle();
        // Fill both attributes
        r1.Length=12.21;
        r1.Breadth=5.43;
        // Call area and perimeter and print them
        System.out.println("perimeter of rectangle is "+r1.perimeter()+".");
        System.out.println("Area of rectangle is "+r1.area()+".");
        //Call the function info
        r1.info();

    }
}


// Task Create a rectangle
class Rectangle{
private static final double LengthBreadth = 0;
    //  Create length and breadh as double
    double Length;
    double Breadth;
    // double Area;

    // Make a function that returns area of rectangle
double area(){
    return LengthBreadth;
}
 // Make a function that returns perimeter of rectangle
double perimeter(){
    return 2(Length+Breadth);
}
 // Make a function that returns Length and breadth of rectangle
void info(){
    System.out.println("The length of rectangle is " +Length+ ", and breadth of rectangle is " +Breadth+".");

}

}