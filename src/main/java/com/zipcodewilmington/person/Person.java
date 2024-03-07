package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private Double height;
    private Double weight;

    private Integer birthYear;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.height = Double.MAX_VALUE;
        this.weight = Double.MAX_VALUE;
        this.birthYear = Integer.MAX_VALUE;
    }

    public Person(int age) {
   this.age = age;
    }

    public Person(String name) {
    this.name = name;
    }

    public Person(Double height, Double weight) {
        this.height = height;
        this.weight = weight;
    }
    
    public Person(Integer birthYear) {
        this.birthYear =   birthYear;
    }


    public Person(String name, int age, double height, double weight, int  birthYear) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.birthYear = birthYear;

    }

    public void setName(String name) {
    this.name = name;}

    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setBirthYear(int birthYear){this.birthYear = birthYear;}
    public String getName() {
        return this.name;
    }

    public Integer getAge() {return this.age;
    }
    public Double getHeight(){
        return this.height;
    }

    public Double getWeigh (){
        return this.weight;
    }
    public Integer getBirthYear(){return this.birthYear;}
}
