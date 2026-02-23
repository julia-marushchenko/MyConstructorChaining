/**
 *  Java program to demonstrate chaining of the constructors between parent and child classes.
 */

package com.myconstructors;

/**
 *  Main class.
 */
public class Main {

    // Main method to start java program.
    public static void main(String[] args) {

        // Creating instances of Child class.
       Child ch = new Child(); // Output: Constructor of a Parent class./n Constructor of a Child class.;

        // Creating instances of Child class.
        Child ch1 = new Child("Child1"); // Output: Constructor of a Parent class./nConstructor of a Child
        // class with name Child1.

        // Creating instances of Parent class.
        Parent pr = new Parent(); // Output: Constructor of a Parent class.

    }
}