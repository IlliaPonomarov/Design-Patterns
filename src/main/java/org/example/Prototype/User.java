package org.example.Prototype;

public class User extends org.example.Prototype.Person implements Prototype {

    public User(Person person) {
        super(person);
    }


    @Override
    public Person clone(Person person) {
        return new Person(this);
    }
}
