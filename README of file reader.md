# File Reader Program

A Java program that reads and displays the contents of text files with comprehensive file information and error handling.

## Features

- **File Reading**: Reads and displays text file contents with line numbers
- **File Information**: Shows file details including name, path, size, and line count
- **Error Handling**: Graceful handling of file not found, permission, and I/O errors
- **Flexible Input**: Supports both command-line arguments and interactive input
- **Cross-platform**: Works on Windows, macOS, and Linux

## Requirements

- Java Development Kit (JDK) 8 or higher
- Any text editor or IDE

### Installing Java

If Java is not installed on your system:

1. **Download Java JDK**: Visit [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
2. **Install Java**: Run the installer and follow the setup wizard
3. **Add to PATH**: The installer usually does this automatically, but you may need to restart your command prompt
4. **Verify Installation**: Open a new command prompt and run:
   ```bash
   java -version
   javac -version
   ```

**Note**: Make sure to install the JDK (Development Kit), not just the JRE (Runtime Environment), as you need the compiler (`javac`).

## Project Structure

```
FileReaderProject/
├── FileReader.java         # Main Java program
├── sample.txt             # Sample text file for testing
├── compile_and_run.bat    # Windows batch file for easy compilation and running
├── compile_and_run.sh     # Unix/Linux shell script for easy compilation and running
└── README.md              # This file
```

## How to Compile

### Method 1: Using the Helper Scripts (Recommended)

**Windows:**
Simply double-click `compile_and_run.bat` or run it from command prompt:
```bash
compile_and_run.bat
```

**Unix/Linux/macOS:**
Make the script executable and run it:
```bash
chmod +x compile_and_run.sh
./compile_and_run.sh
```

These scripts will:
- Check if Java is installed
- Compile the program
- Run it with the sample file
- Provide helpful error messages if Java is not installed

### Method 2: Manual Compilation
1. Open a terminal/command prompt
2. Navigate to the project directory:
   ```bash
   cd FileReaderProject
   ```
3. Compile the Java program:
   ```bash
   javac FileReader.java
   ```

## How to Run

### Method 1: Interactive Mode
Run the program without arguments and enter the file path when prompted:
```bash
java FileReader
```

### Method 2: Command Line Argument
Provide the file path as a command line argument:
```bash
java FileReader sample.txt
```

## Usage Examples

### Example 1: Reading the sample file
```bash
java FileReader sample.txt
```

**Expected Output:**
```
=== File Reader Program ===
This program reads and displays the contents of a text file.

=== File Information ===
File name: sample.txt
Absolute path: C:\Users\kavya\FileReaderProject\sample.txt
File size: 456 bytes
Number of lines: 12

=== File Contents ===
----------------------------------------
   1 | Hello World!
   2 | This is a sample text file for testing the FileReader program.
   3 | 
   4 | The program should be able to:
   5 | - Read this file and display its contents
   6 | - Show line numbers
   7 | - Display file information like size and line count
   8 | - Handle errors gracefully
   9 | 
  10 | This is line 6 of the sample file.
  11 | Line 7 contains some numbers: 123, 456, 789
  12 | Line 8 has special characters: @#$%^&*()
  13 | Line 9 is the last line of this sample file.
  14 | 
  15 | End of sample file.
----------------------------------------
End of file.
```

### Example 2: Interactive mode
```bash
java FileReader
```
Then enter the file path when prompted.

### Example 3: Error handling
```bash
java FileReader nonexistent.txt
```

**Expected Output:**
```
=== File Reader Program ===
This program reads and displays the contents of a text file.

Error: File 'nonexistent.txt' does not exist.
```

## Program Features Explained

### 1. File Validation
- Checks if the file exists before attempting to read
- Verifies that the path points to a regular file (not a directory)
- Provides clear error messages for common issues

### 2. File Information Display
- **File name**: Shows the name of the file
- **Absolute path**: Displays the complete file path
- **File size**: Shows the file size in bytes
- **Line count**: Counts the total number of lines in the file

### 3. Content Display
- Shows file contents with line numbers
- Uses formatted output for better readability
- Handles empty lines and special characters

### 4. Error Handling
- **File not found**: Clear error message when file doesn't exist
- **Permission errors**: Handles access permission issues
- **I/O errors**: Graceful handling of reading errors
- **Invalid paths**: Validates file paths before processing

## Supported File Types

The program is designed to read text files. It works best with:
- `.txt` files
- `.md` files
- `.java` files
- `.py` files
- Any plain text file

## Troubleshooting

### Common Issues

1. **"javac is not recognized"**
   - Solution: Install Java JDK and add it to your system PATH

2. **"File does not exist"**
   - Solution: Check the file path and ensure the file exists
   - Use absolute paths if needed

3. **"Permission denied"**
   - Solution: Ensure you have read permissions for the file

4. **"Not a regular file"**
   - Solution: Make sure the path points to a file, not a directory

### Getting Help

If you encounter any issues:
1. Check that Java is properly installed: `java -version`
2. Verify the file path is correct
3. Ensure you have read permissions for the file
4. Try using absolute paths instead of relative paths

## Code Structure

The program consists of three main methods:

1. **`main(String[] args)`**: Entry point that handles user input
2. **`readAndDisplayFile(String filePath)`**: Main logic for reading and displaying files
3. **`displayFileInfo(Path path)`**: Displays file metadata

## Contributing

Feel free to enhance this program by adding features like:
- Support for different file encodings
- Search functionality within files
- File comparison capabilities
- GUI interface

## License

This project is open source and available under the MIT License.

---

**Author**: File Reader Program  
**Version**: 1.0  
**Last Updated**: 2024 