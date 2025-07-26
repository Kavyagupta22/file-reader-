import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * FileReader - A Java program to read and display the contents of a text file
 * 
 * This program provides functionality to:
 * - Read text files and display their contents
 * - Handle file not found errors gracefully
 * - Support both relative and absolute file paths
 * - Display file information (size, line count)
 */
public class FileReader {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== File Reader Program ===");
        System.out.println("This program reads and displays the contents of a text file.");
        System.out.println();
        
        // If file path is provided as command line argument
        if (args.length > 0) {
            readAndDisplayFile(args[0]);
        } else {
            // Interactive mode - ask user for file path
            System.out.print("Enter the path to the text file: ");
            String filePath = scanner.nextLine().trim();
            
            if (!filePath.isEmpty()) {
                readAndDisplayFile(filePath);
            } else {
                System.out.println("No file path provided. Exiting...");
            }
        }
        
        scanner.close();
    }
    
    /**
     * Reads and displays the contents of a text file
     * @param filePath The path to the text file
     */
    public static void readAndDisplayFile(String filePath) {
        Path path = Paths.get(filePath);
        
        // Check if file exists
        if (!Files.exists(path)) {
            System.err.println("Error: File '" + filePath + "' does not exist.");
            return;
        }
        
        // Check if it's a regular file
        if (!Files.isRegularFile(path)) {
            System.err.println("Error: '" + filePath + "' is not a regular file.");
            return;
        }
        
        // Display file information
        displayFileInfo(path);
        
        // Read and display file contents
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            System.out.println("\n=== File Contents ===");
            System.out.println("----------------------------------------");
            
            String line;
            int lineNumber = 1;
            
            while ((line = reader.readLine()) != null) {
                System.out.printf("%4d | %s%n", lineNumber, line);
                lineNumber++;
            }
            
            System.out.println("----------------------------------------");
            System.out.println("End of file.");
            
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    
    /**
     * Displays information about the file
     * @param path The path to the file
     */
    public static void displayFileInfo(Path path) {
        try {
            System.out.println("=== File Information ===");
            System.out.println("File name: " + path.getFileName());
            System.out.println("Absolute path: " + path.toAbsolutePath());
            System.out.println("File size: " + Files.size(path) + " bytes");
            
            // Count lines
            long lineCount = Files.lines(path).count();
            System.out.println("Number of lines: " + lineCount);
            
        } catch (IOException e) {
            System.err.println("Error getting file information: " + e.getMessage());
        }
    }
} 