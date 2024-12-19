package com.satya.pattern.prototype;

public class PrototypeClient {
  public static void main(String[] args) {
    // Create a prototype
    Shape originalShape = new Shape("Circle", "Red");

    // Clone the prototype
    Shape clonedShape1 = (Shape) originalShape.clone();
    Shape clonedShape2 = (Shape) originalShape.clone();

    // Modify the cloned objects
    clonedShape1.setColor("Blue");
    clonedShape2.setType("Rectangle");

    // Display objects
    System.out.println("Original: " + originalShape);
    System.out.println("Cloned 1: " + clonedShape1);
    System.out.println("Cloned 2: " + clonedShape2);
  }
}
