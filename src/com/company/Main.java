package com.company;

public class Main {

    public static void main(String[] args) {


        // OOP
        // A paradigm is a way of view things
        // Car
        // A class is a blueprint for creating objects.
        // Features of a car: Color, noOfTires, price, model (fields/class variables)
        // Behaviour or actions of a car: Switching engine on switching engine off, moving forward
        //moving backboard, turning left or right. (methods)

        // Inheritance
        // This is a mechanism that allows us to share behaviour between classes.
        // A class that inherits from another class is the child class. While the inherited class is the parent class.
        // Mercedes,
        // convertible, compressor engine, color: chrome
        //

        // encapsulation
        // It is the process of hiding data and methods from the "outside world"meaning
        // from public access
        // public, private, package
        // typically we use getters and setters to access such values

        // Abstraction
        // It is a mechanism that is focused on hiding implementation details from
        // the user. The user does not need to know how it was done, they just need to know that
        // it  works.

        //Polymorphism
        // This is the ability of an object to return different responses tot he same request/method call.
        // Number<decimal> = new Double(5.6);
        // Number<integer> = new Integer(3);

        //Calling the car object
//        Car car = new Car(); //if is not static, but public String color
//        System.out.println(car.getColor());
//        car.setColor("Blue");
//        System.out.println(car.getColor());
//        car.setNoOfTires(8);
//        car.setBrand("BMW Limousine");
//        System.out.println(car.getNoOfTires());
//        System.out.println(car.getBrand());
    //   System.out.println(Car.color);
    //   System.out.println(Car.noOfTires);
     //   System.out.println(Car.brand);

     //   car.startEngine(true);
//        Bird bird = new Bird();
//        bird.setColor("Black");
//        System.out.println(bird.getColor());
//        bird.setNoOfLegs(2);
//        System.out.println("Barry has " + bird.getNoOfLegs() + " legs. ");
//        bird.setNoOfWings(2);
//        System.out.println("Barry has " + bird.getNoOfWings() + " wings. ");
//        bird.walk();
//        bird.fly();
//        bird.sing();

// Create a class that models a person
// features of the person class: height, gender, complexion, age
// actions: walking, talking, eat and run.
        Persons persons = new Persons();
        persons.setComplexion("Dark");
        System.out.println("This persons complexion type is: " + persons.getComplexion());
        persons.setAge(18);
        System.out.println("Person is " + persons.getAge() + " years old. ");
        persons.setGender("Male.");
        System.out.println(persons.getGender());
        persons.setHeight(175);
        System.out.println("Person is " + persons.getHeight() + " height. ");
        persons.walk();
        persons.talk();
        persons.run();
        persons.eat();

    }
}
