package P2;

import P1.Shape;
import java.util.Scanner;

public class Rectangle extends Shape {
    double length;
    double breadth;

    @Override
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        this.length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        this.breadth = sc.nextDouble();
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}
