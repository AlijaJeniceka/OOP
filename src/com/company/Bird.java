package com.company;

public class Bird {
    //Bird should have color, noOfWings, noOfLegs (private and fields)
    //bird should be able to fly, walk and sing (public and methods)
    // Use getter and setters on your fields.
    private  String color;
    private int noOfWings;
    private int noOfLegs;

    public void fly() {
        if(this.noOfWings == 2) {
            System.out.println("Bird is flying. ");
        } else {
            System.out.println("Bird cannot fly. ");
        }
    }
    public void walk() {
        System.out.println("Bird is walking. ");
    }
    public void sing() {
        System.out.println("Bird is singing. ");
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getNoOfWings() {
        return this.noOfWings;
    }
    public void setNoOfWings(int noOfWings){
        this.noOfWings = noOfWings;
    }
    public int getNoOfLegs() {
        return this.noOfLegs;
    }
    public void setNoOfLegs(int noOfLegs){
        this.noOfLegs = noOfLegs;
    }

}
