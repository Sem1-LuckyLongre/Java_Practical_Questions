import P1.Shape;
import P2.Rectangle;
import P3.Circle;
import java.util.Scanner;
// Code Runner

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape;

        System.out.print("Enter shape type (1 for Rectangle, 2 for Circle): ");
        int type = sc.nextInt();

        switch (type) {
            case 1:
                shape = new Rectangle();
                shape.read();
                shape.area();
                break;
            case 2:
                shape = new Circle();
                shape.read();
                shape.area();
                break;
            default:
                System.out.println("Invalid shape type. Exiting.");
                break;
        }
    }
}

/**==============================================
 * *                   OUTPUT
 * Enter shape type (1 for Rectangle, 2 for Circle): 1
 * Enter length: 5
 * Enter breadth: 3
 * Area of rectangle: 15.0
 * 
 * (For case 2:)
 * Enter shape type (1 for Rectangle, 2 for Circle): 2
 * Enter radius: 4
 * Area of circle: 50.26548245743669
 *=============================================**/
