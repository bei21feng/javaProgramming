package indi.bill.javaprogramming.learnbasic;

public class Circle {

    double radius;

    Circle () {
        radius = 1;
    }

    Circle (double newRadius) {
        radius = newRadius;
    }

    double getArea () {
        return Math.pow(radius, 2) * Math.PI;
    }
}
