import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
// By Terminal  --> java Main input.txt output.txt
public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try (
                FileInputStream fis = new FileInputStream(inputFile);
                FileOutputStream fos = new FileOutputStream(outputFile)) {
            int chData;

            while ((chData = fis.read()) != -1) {
                fos.write(chData);
            }
            System.out.println("File copied successfully. from " + inputFile + " to " + outputFile);
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }catch(IOException e){
            System.out.println("An error occurred!");
        }catch(Exception e){
            System.out.println("An unexpected error occurred!");
        }
    }
}

/**==============================================
 * *                   OUTPUT
 * (Success Case:)
 * $ java Main input.txt output.txt
 * File copied successfully. from input.txt to output.txt
 * 
 * (Error Case - File not found:)
 * $ java Main nonexistent.txt output.txt
 * File not found!
 *=============================================**/
