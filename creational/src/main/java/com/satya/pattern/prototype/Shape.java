package com.satya.pattern.prototype;


public class Shape implements Prototype{

    private String color;
    private String type;

    public Shape(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Prototype clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported exception");
        }
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
