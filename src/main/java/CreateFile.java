import java.io.*;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {

        System.out.println("Please input a string to add to the new file: ");
        Scanner userInput = new Scanner(System.in);
        String fileInput = userInput.nextLine();

        try {
            File myFile = new File(fileInput);
            PrintWriter outputFile = new PrintWriter(new FileWriter(myFile, true));
            System.out.println("Enter a string to input into the created file: ");
            String fileValueInput = userInput.nextLine();
            outputFile.println(fileValueInput);
            outputFile.close();

            Scanner inputFile = new Scanner(myFile);
            while(inputFile.hasNextLine()) {
                String firstString = inputFile.nextLine();
                System.out.println(firstString);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
