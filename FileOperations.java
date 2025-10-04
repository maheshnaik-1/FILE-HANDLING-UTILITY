import java.util.Scanner;
import java.io.*;

public class FileHandlerSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Step 1: Ask user whether to create a new file or open existing
            System.out.println("Do you want to create a new file or open existing? (C/O): ");
            String choice = sc.nextLine().toUpperCase();
            System.out.println("Enter the full path of the file (e.g., C:\\Users\\xyz\\Documents\\file.txt):");
            String filePath = sc.nextLine();
            File file = new File(filePath);
            if (choice.equals("C")) {
                // Create new file
                if (file.createNewFile()) {
                    System.out.println("File created successfully at: " + file.getAbsolutePath());
                } else {
                    System.out.println("File already exists, you can write/append to it.");
                }
            } else if (choice.equals("O")) {
                // Open existing file
                if (!file.exists()) {
                    System.out.println("File does not exist! Exiting program.");
                    sc.close();
                    return;
                }
                System.out.println("File opened: " + file.getAbsolutePath());
            } else {
                System.out.println("Invalid choice. Exiting.");
                sc.close();
                return;
            }
            // Step 2: Write new content
            System.out.println("\nEnter text to write to the file (will overwrite existing content):");
            String writeData = sc.nextLine();
            FileWriter writer = new FileWriter(file);
            writer.write(writeData + "\n");
            writer.close();
            System.out.println("Data written successfully!");
            // Step 3: Read file contents
            System.out.println("\n--- File Content ---");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            // Step 4: Append new content
            System.out.println("\nEnter text to append to the file:");
            String appendData = sc.nextLine();
            FileWriter appendWriter = new FileWriter(file, true);
            appendWriter.write(appendData + "\n");
            appendWriter.close();
            System.out.println("Data appended successfully!");
            // Step 5: Show final file contents
            System.out.println("\n--- Updated File Content ---");
            BufferedReader reader2 = new BufferedReader(new FileReader(file));
            while ((line = reader2.readLine()) != null) {
                System.out.println(line);
            }
            reader2.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        sc.close();
    }
}
