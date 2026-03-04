package problem5;

import java.io.*;

public class FileService {

    private static final String FILE_NAME = "users.txt";

    public void writeToFile(String data) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(data + "\n");
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            System.out.println("\n--- Stored Data ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}