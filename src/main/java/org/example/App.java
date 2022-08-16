package org.example;

import org.example.Builder.Gender;
import org.example.Builder.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person.Builder("Illia", "Ponomarov", 20).addGender(Gender.MALE).build();

        System.out.println(person.toString());
    }
}
