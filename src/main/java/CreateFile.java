import java.io.*;

public class CreateFile {
    public static void main(String[] args) {

        File myFile = new File("MyFile.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());

        try {
            String content = "Dewan's test";
            PrintWriter outputFile = new PrintWriter(new FileWriter(myFile, true));
            outputFile.println(content);
            outputFile.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
