package com.company;

public class Persons {
    private String complexion;
    private int height;
    private int age;
    private String gender;

    public void walk() {
        System.out.println("Person is walking. ");
    }
    public void talk() {
        System.out.println("Person is talking. ");
    }
    public void eat() {
        System.out.println("Person is eating. ");
    }
    public void run() {
        System.out.println("Person is running. ");
    }
    public String getComplexion() {
        return this.complexion;
    }
    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }
    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getHeight() {
        return this.height;
    }
    public void setHeight(int height){
        this.height = height;
    }
}
