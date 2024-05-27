package Week7;

public class FirstOop {
    
    public static void main(String[] args) {
        Person p1 = new Person();
    p1.name= "Ayush";
    p1.age=10;
    p1.gender='F';
    p1.introduction();

    Person p2= new Person();
    p2.name="Bulky";
    p2.age=12;
    p2.gender='F';
    p2.introduction();

    Person p3= new Person();
    p3.name="Nipuana";
    p3.age=18;
    p3.gender='M';
    p3.introduction();

    Square s1=new Square();
    s1.sides = 10;
    int s1Area = s1.area();
    System.out.println(s1Area);
    System.out.println(s1.area());
    s1.increaseSidex(2);
    System.out.println(s1.area());
}
}

class square {
    int sides;
    int area() {
        return sides*sides;
    }
    void increaseSidex(int val) {
        sides=sides+val;
    }
}


class Person{
    String name;
    int age;
    char gender;

    void introduction(){
        System.out.println("My name is "+name+"\nI am "+age+"years old.\n my gender is  "+gender);
    }
}