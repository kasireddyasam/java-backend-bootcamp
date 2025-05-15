package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */
class Rectangle {
    private  int width;
    private  int height;
    static int numOfRectangles = 0;
//    static {
//        numOfRectangles++;
//    }
    public Rectangle(){
        numOfRectangles++;
        this.width = 20;
        this.height = 10;
    }
    public Rectangle(int width, int height){
        numOfRectangles++;
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return width * height;
    }
    public int perimeter(){
        return 2*(width + height);
    }
    public int getNumOfRectangles(){
        return numOfRectangles;
    }
}
public class StaticChallenge {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.perimeter());
        System.out.println(r1.getArea());
        System.out.println(r1.getNumOfRectangles());
        Rectangle r2 = new Rectangle(100,200);
        Rectangle r3 = new Rectangle();
        System.out.println(r2.getArea());
        System.out.println(r2.getNumOfRectangles());
        int numOfRectangles = Rectangle.numOfRectangles;
        System.out.println(numOfRectangles);

    }
}
