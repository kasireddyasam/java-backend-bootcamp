package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int a=10;
        int b= 20;

        // Step 2: Convert primitive variables to wrapper objects

        // Step 3: Print the values of the wrapper objects

        // Step 4: Convert wrapper objects back to primitive variables
        Integer A  =  a; // auto boxing;
        Integer B = b;
        // Step 5: Print the values of the primitive variables
        System.out.printf("a=%d, B=%d\n", a,b);

    }
}
