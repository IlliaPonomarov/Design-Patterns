package org.example;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.example.Builder.Gender;
import org.example.Builder.Person;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<User, Integer> users = new HashMap<>();

        User user = new User(1, "Illia", 20, "lololoshka2");
        User user2 = new User(1, "Illia", 20 , "lololoshka2");

        users.put(user, 123);
        users.put(user2, 123);

        System.out.println(users);

    }

   static class User {

        private int id;
        private String name;
        private int age;
        private String password;

       public User(int id, String name, int age, String password) {
           this.id = id;
           this.name = name;
           this.age = age;
           this.password = password;
       }


       @Override
       public boolean equals(Object obj) {
           if (obj == this) return true;
           if (!(obj instanceof User)) return false;

           User user = (User) obj;


           return id == user.id && name.equals(user.name) && age == user.age && password.equals(user.password);
       }

       @Override
       public int hashCode() {
           return 31 * id + ( name != null ? name.hashCode() : 0  );
       }

       public int getId() {
           return id;
       }

       public void setId(int id) {
           this.id = id;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public int getAge() {
           return age;
       }

       public void setAge(int age) {
           this.age = age;
       }

       public String getPassword() {
           return password;
       }

       public void setPassword(String password) {
           this.password = password;
       }

       @Override
       public String toString() {
           return "User{" +
                   "id=" + id +
                   ", name='" + name + '\'' +
                   ", age=" + age +
                   ", password='" + password + '\'' +
                   '}';
       }
   }


}