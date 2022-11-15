import java.io.*;

public class CreateFile {
    public static void main(String[] args) {

        File myFile = new File("MyFile.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());

        try {
            String content = "third entry";
            FileWriter outputFile = new FileWriter(myFile, true);
            outputFile.write(content);
            outputFile.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
