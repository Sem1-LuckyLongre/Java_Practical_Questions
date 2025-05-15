package P3;

import java.util.Scanner;

import P1.Shape;

public class Circle extends Shape {
    double radius;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        radius = sc.nextDouble();
    }

    public void area() {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }
}
