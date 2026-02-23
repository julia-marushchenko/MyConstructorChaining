package com.myconstructors;

public class Child extends Parent {

    public Child() {

        System.out.println("Constructor of a Child class.");

    }

    public Child(String name) {

        super();
        System.out.println("Constructor of a Child class with name " + name + ".");

    }

}
