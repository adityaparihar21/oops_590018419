import java.io.*;

class FileUpdater {

    private String filePath;

    // Constructor
    FileUpdater(String filePath) {
        this.filePath = filePath;
    }

    // Method to update file content
    public void updateContent(String oldWord, String newWord) {

        try {
            File file = new File(filePath);

            // Create file if not exists
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created successfully.");
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String line;

            // Read file
            while ((line = br.readLine()) != null) {
                content.append(line.replace(oldWord, newWord));
                content.append("\n");
            }
            br.close();

            // Write updated content
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(content.toString());
            bw.close();

            System.out.println("File updated successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Main Class
public class FileUpdateProgram {

    public static void main(String[] args) {

        // File will be created in current directory
        FileUpdater updater = new FileUpdater("sample.txt");

        updater.updateContent("old", "new");
    }
}
