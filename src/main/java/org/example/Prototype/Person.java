package org.example.Prototype;

public class Person implements Prototype{

    public Person(Person person){
        System.out.println("Cloning person ...");
    }

    @Override
    public org.example.Prototype.Person clone(Person person) {
        return new org.example.Prototype.Person(this);
    }
}
