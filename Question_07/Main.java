import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Code Runner

public class Main {

    public static void main(String[] args) {
        String file_name = "data.txt";

        try (BufferedReader bReader = new BufferedReader(new FileReader(file_name))) {
            String line_data;

            while ((line_data = bReader.readLine()) != null) {
                if (line_data.trim().startsWith("//")) {
                    System.out.println(line_data);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

/**==============================================
 * *                   OUTPUT
 * (Output:)
 * // Create Scanner object to take input from the terminal
 * // Prompt user to enter their name
 * // Read the entered name using nextLine()
 * // Print the entered name
 * // Close the scanner to avoid memory leaks
 * 
 * (Error case - file not found:)
 * java.io.FileNotFoundException: data.txt (The system cannot find the file specified)
 *=============================================**/
