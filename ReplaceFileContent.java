import java.io.*;
import java.util.Scanner;

class FileReplace {

    private String filePath;

    // Constructor
    FileReplace(String filePath) {
        this.filePath = filePath;
    }

    // Method to replace entire content
    public void replaceContent(String newContent) {

        try {
            File file = new File(filePath);

            // Create file if it doesn't exist
            if (!file.exists()) {
                file.createNewFile();
            }

            // FileWriter without 'true' will overwrite file
            FileWriter fw = new FileWriter(file);
            fw.write(newContent);
            fw.close();

            System.out.println("File content replaced successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class ReplaceFileContent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FileReplace obj = new FileReplace("sample.txt");

        System.out.println("Enter new content to write in file:");
        String content = sc.nextLine();

        obj.replaceContent(content);

        sc.close();
    }
}
