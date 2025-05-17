package io.javabrains.javacollections;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

import org.w3c.dom.ls.LSOutput;

import java.util.Date;
import java.util.Objects;

public class EqualsAndHashCode {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("John");
        person1.setLastName("Doe");
//        person1.setAge(30);

        Person person2 = new Person();
        person2.setFirstName("John");
        person2.setLastName("Doe");
//        person2.setAge(30);
        System.out.println(person1.equals(person2));
    }



}
class Person {
    private String firstName;
    private String lastName;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private Date lastModifiedDate;

    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj==null || this.getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return  this.age == other.age
                && Objects.equals(this.firstName,other.firstName)
                && Objects.equals(this.lastName,other.lastName);
//        return this.age == other.age
//                && this.firstName.equals(other.firstName)
//                && this.lastName.equals(other.lastName);
    }
    public int hashCode(Object obj) {
        return Objects.hash(this.firstName,this.lastName,this.age);
    }
}
