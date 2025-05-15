import java.util.Scanner;
// Code Runner

class UnderAge extends Exception {

    private final int age;

    public UnderAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UnderAge: " + age + " years of age is not allowed to vote.";
    }
}

public class Main {

    public static void testAge(int age) throws UnderAge {
        if (age < 18) {
            throw new UnderAge(age);
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            testAge(age);
        } catch (UnderAge e) {
            System.out.println(e);
        }
    }
}

/**==============================================
 * *                   OUTPUT
 * (Case 1:)
 * Enter your age: 21
 * You are eligible to vote.
 * 
 * (Case 2:)
 * Enter your age: 15
 * UnderAge: 15 years of age is not allowed to vote.
 *=============================================**/
