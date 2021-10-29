package indi.bill.javaprogramming.learnclass;

import java.util.ArrayList;

public class GeometricObject {
    // data field
    private String color = "white";

    // constructor
    GeometricObject () {
        System.out.println("from superclass");
    }
    GeometricObject (String color) {
        this.color = color;
        System.out.println("from superclass");
    }

    // methods
    /** return color */
    public String getColor() {
        return color;
    }
    public void setColor (String color) {
        this.color = color;
    }


    // main method
    public static void main(String[] args) {
//        Circle c1 = new Circle(1, "black");
//        System.out.println(c1.getArea());
//        System.out.println(c1.getColor());

        /** constructor chaining */
        Circle c2 = new Circle();

        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Paris");
        cityList.add(1,"Beijing");
        System.out.println(cityList);
        System.out.println(cityList.size());
    }
}

class Circle extends GeometricObject{
    // data field
    private double radius;

    // constructor
    Circle () {
        System.out.println("from subclass");
    }
    Circle (double radius) {
        this.radius = radius;
        System.out.println("from subclass");
    }
    Circle (double radius, String color) {
        this.radius = radius;
        super.setColor(color);
        System.out.println("from subclass");
    }

    // methods
    public double getArea () {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
