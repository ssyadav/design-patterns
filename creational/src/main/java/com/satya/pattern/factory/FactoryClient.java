package com.satya.pattern.factory;


public class FactoryClient {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.computeArea();
        shape = shapeFactory.getShape("RECTANGLE");
        shape.computeArea();
        shape = shapeFactory.getShape("SQUARE");
        shape.computeArea();
    }
}
