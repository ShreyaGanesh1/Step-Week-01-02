package problem8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to write into file: ");
        String text = scanner.nextLine();

        // Writing to file
        try (FileWriter writer = new FileWriter("data.txt")) {
            writer.write(text);
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        // Reading from file
        System.out.println("\nReading from file:");

        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        scanner.close();
    }
}
