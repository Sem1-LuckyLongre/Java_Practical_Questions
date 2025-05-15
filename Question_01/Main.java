package Question_01;
// Run JAVA
class Complex {

    public final double x;
    public final double y;

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Complex addComplex(Complex otherComplex) {
        return new Complex(this.x + otherComplex.x, this.y + otherComplex.y);
    }

    public Complex multiplyComplex(Complex otherComplex) {
        double real_real = this.x * otherComplex.x;
        double real_img = this.x * otherComplex.y;
        double img_real = this.y * otherComplex.x;
        double img_img = this.y * otherComplex.y;

        double real_part = real_real - img_img;
        double img_part = real_img + img_real;
        return new Complex(real_part, img_part);
    }
    @Override
    public String toString() {
        if (this.y < 0) {
            String outputString = this.x + " - " + Math.abs(this.y) + "i";
            return outputString;
        } else {
            String outputString = this.x + " + " + Math.abs(this.y) + "i";
            return outputString;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Complex c1Complex = new Complex(3, 8);
        Complex c2Complex = new Complex(7, 6);

        System.out.println("The First Complex Number : " + c1Complex.toString());
        System.out.println("The Second Complex Number : " + c2Complex.toString() + "\n");

        System.out.println("Adding Two Complex Numbers...");
        Complex addedComplex = c1Complex.addComplex(c2Complex);
        System.out.println("After Adding Complex Number: " + addedComplex.toString() + "\n");

        System.out.println("Multiplying Two Complex Numbers...");
        Complex multipliComplex = c1Complex.multiplyComplex(c2Complex);
        System.out.println("After Multiplying Complex Number: " + multipliComplex.toString() + "\n");
    }
}


/**==============================================
 * *                   OUTPUT
 * The First Complex Number : 3.0 + 8.0i
 * The Second Complex Number : 7.0 + 6.0i

 * Adding Two Complex Numbers...
 * After Adding Complex Number: 10.0 + 14.0i

 * Multiplying Two Complex Numbers...
 * After Multiplying Complex Number: -27.0 + 74.0i
 *=============================================**/