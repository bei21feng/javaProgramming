package indi.bill.javaprogramming.learnbasic;

import java.util.Random;

public class LearnObject {
    public static void learnObject() {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2);

        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());

        Random generator = new Random();
        int ranInt = generator.nextInt(5);
        System.out.println(ranInt);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("indi.bill.javaprogramming.learnbasic.Welcome");
        stringBuffer.append(' ');
        stringBuffer.append("to Java");

        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
    }
}
