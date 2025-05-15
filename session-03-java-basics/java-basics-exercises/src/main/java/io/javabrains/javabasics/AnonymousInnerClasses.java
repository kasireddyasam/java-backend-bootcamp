package io.javabrains.javabasics;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */

abstract class Animal2 {
    abstract public void makeSound();
}
public class AnonymousInnerClasses extends Animal2 {
    public void makeSound(){
        System.out.println("Animal2 is making sound");
    }
    public static void main(String[] args) {
         AnonymousInnerClasses a = new AnonymousInnerClasses();
         a.makeSound();

    }
}
