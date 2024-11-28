import java.io.*;

public class FileHandler {
    public static void main(String[] args) {
        String filename = "data.txt";

        // Writing to file
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello World!\nThis is a simple file write.");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // Reading from file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}