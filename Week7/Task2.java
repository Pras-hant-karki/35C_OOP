package Week7;

public class Task2 {
    public static void main(String[] args) {

        // Create 2 objects
        // FIll attribute of both
        //Start both object
        // stop both objects
        Car c1=new Car();
        c1.Name= "Carolla";
        c1.Brand="Toyota";
        c1.year=2021;
        c1.start();
        c1.stop();
        System.out.println("The expiry date of Toyota Carolla 2021 is on "+c1.ExpiryDate());

        Car c2=new Car();
        c2.Name= "G wagon";
        c2.Brand="Mercedes";
        c2.year=2018;
        c2.start();
        c2.stop();
        c2.info();
        System.out.println("The expiry date of Mercedes G-Wagon is on "+c2.ExpiryDate());
    }
}
// Create class Car
class Car{
    // Create attribute name, brand, year
    String Name;
    String Brand;
    int year;
// Create a function ex[iry date that returns 100 years added to year]
int ExpiryDate(){
    return year+100;
}

// Create a function start
void start(){
    System.out.println(Name+" is starting");
}
// Create a functiuon stop
void stop(){
    System.out.println(Name+" is stopping");
}
// Create a funciton info
void info(){
    System.out.println("The name of car is "+Name+"\nThe brand of car is  "+Brand+"\nThe year the car was manufactured is "+year);
}
// 


}