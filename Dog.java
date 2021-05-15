package week1.day1assignments;

public class Dog {
    float height = 2.5f;
    String breed;
    String color;
    int age = 5 ;
    boolean isfurry = false;

    //method
    public void bark(){
        System.out.println("barking dog");

    }
    public void sleep (){
        System.out.println("sleeping dog");
    }
    public void run () {
        System.out.println("running dog");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();
        myDog.sleep();
        System.out.println("age:"+ myDog.age);
        myDog.breed ="german shepherd";



    }
}
